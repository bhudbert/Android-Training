package fr.hudbert.bruno.cours.interactions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import fr.hudbert.bruno.cours.R;

public class ActivityWithExplicitIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactions_with_explicit);
    }
}
