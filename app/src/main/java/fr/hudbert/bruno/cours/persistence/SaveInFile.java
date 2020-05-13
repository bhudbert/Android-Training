package fr.hudbert.bruno.cours.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import fr.hudbert.bruno.cours.R;

public class SaveInFile extends AppCompatActivity {

    private static final String FILE_NAME ="myFile.txt";
    private static final String CONTENT = "lorem ipsum et doloris";
    private static final String TAG = "Erreur : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_in_file);
    }

    public void onClickSave(View view) {

        new Thread(new Runnable() {
            @Override
            public void run() {
            FileOutputStream fos = null;
                try {
                    fos = openFileOutput(FILE_NAME,MODE_PRIVATE);
                    fos.write(CONTENT.getBytes());
                    fos.close();
                } catch (Exception e) {
                    Log.e(TAG,"Message "+e.getMessage());
                }

            }
        }).start();
    }

    StringBuilder result =new StringBuilder();

    public void onClickRead(View view) {

        new Thread(new Runnable() {
           public void run() {
                FileInputStream fis = null;
                try {
                    fis = openFileInput(FILE_NAME);
                    byte[] buffer = new byte[1024];

                    // fileInputStream.read returns -1 when empty

                    while(fis.read(buffer)!=-1){
                        result.append(new String(buffer));
                    }
                } catch (Exception e) {
                    Log.e(TAG,"Message "+e.getMessage());
            }

        }
    }).start();
        Toast.makeText(SaveInFile.this,result.toString(),Toast.LENGTH_SHORT).show();
    }
}
