package fr.hudbert.bruno.cours.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import fr.hudbert.bruno.cours.R;

public class MainActivityLayouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts_main);
    }

    public void onClickShowConstraintLayoutToast(View view) {
        Toast.makeText(this, "Vous etiez deja dans un Layout de type Constraint Layout", Toast.LENGTH_LONG).show();
    }
}
