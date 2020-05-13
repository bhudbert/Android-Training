package fr.hudbert.bruno.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fr.hudbert.bruno.cours.layouts.ActivityWithMixedLayouts;
import fr.hudbert.bruno.cours.layouts.MainActivityLayouts;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowLayouts(View view) {

        Intent  intent= new Intent(this, MainActivityLayouts.class);
        startActivity(intent);
    }
}
