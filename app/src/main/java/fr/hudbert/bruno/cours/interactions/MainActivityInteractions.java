package fr.hudbert.bruno.cours.interactions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import fr.hudbert.bruno.cours.R;
import fr.hudbert.bruno.cours.common.bo.User;

public class MainActivityInteractions extends AppCompatActivity {

    private static final String TAG="bh_log : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactions_main);
    }

    public void onClickPrintLog(View view) {
        Log.e(TAG,"Le bouton de creation de Log fonctionne ");
    }

    public void onClickMakeToast(View view) {
        Toast.makeText(this, "A la votre :D ! ", Toast.LENGTH_LONG).show();
    }

    public void onClickShowExpliciteIntent(View view) {
        Intent  intent =new Intent(this, ActivityWithExplicitIntent.class);
        startActivity(intent);

    }
    public void onClickShowExpliciteIntentWithExtra(View view) {
        Intent  intent =new Intent(this,ActivityWithExplicitIntentAndExtra.class);
        intent.putExtra("uneChaine","Mon code postal est");
        intent.putExtra("unChiffre",44390);
        intent.putExtra("unUtilisateur",new User("HUDBERT","Bruno"));

        startActivity(intent);
    }

    public void onClickRunimpliciteIntent(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:+33620053954"));
        startActivity(intent);
    }


    public void onClickRunImpliciteIntentWithFilter(View view) {
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("application/pdf");
        // Se proteger contre le plantage de l'appli si aucune appli n'ouvre les PDF
        if(intent.resolveActivity(getPackageManager())==null){
            Toast.makeText(this,"Aucune application disponible pour ce type de fichier",Toast.LENGTH_LONG).show();
            startActivity(intent);
        }else{
            startActivity(intent);
        }



    }
}
