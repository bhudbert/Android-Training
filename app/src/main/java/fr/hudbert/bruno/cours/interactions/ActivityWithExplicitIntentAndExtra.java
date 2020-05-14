package fr.hudbert.bruno.cours.interactions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import fr.hudbert.bruno.cours.R;

public class ActivityWithExplicitIntentAndExtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactions_with_explicit_intent_and_extra);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();

        String phrase = intent.getStringExtra("uneChaine");
        String chiffre = String.valueOf(intent.getIntExtra("unChiffre",35000));
        String Utilisateur = intent.getParcelableExtra("unUtilisateur").toString();

        Toast.makeText(this, Utilisateur+" "+ phrase +" "+chiffre, Toast.LENGTH_LONG).show();
        // @TODO  Supprimer le toast est integrer les données
    }
}
