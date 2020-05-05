package fr.hudbert.bruno.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="myTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickValidate(View view) {
        Log.i(TAG,"Arrétes de valider , il y a rien qui fonctionne ");
        Toast.makeText(this, "J'aime pas les Toast", Toast.LENGTH_SHORT).show();
        Intent intention = new Intent(this,Main2Activity.class);
        startActivity(intention);
    }
}
