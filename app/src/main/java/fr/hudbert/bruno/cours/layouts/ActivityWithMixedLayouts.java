package fr.hudbert.bruno.cours.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import fr.hudbert.bruno.cours.R;

public class ActivityWithMixedLayouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts_grid_layout);
    }
}
