package fr.hudbert.bruno.cours.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import fr.hudbert.bruno.cours.R;
import fr.hudbert.bruno.cours.persistence.bo.User;
import fr.hudbert.bruno.cours.persistence.dao.UserDao;

public class SaveInDatabase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_in_database);
    }

    @Override
    protected void onResume() {
        super.onResume();

        UserDao ud = new UserDao(this);

        User user = ud.get(3);

        Toast.makeText(this,"Resultat => ID : " + user,Toast.LENGTH_SHORT).show();

        }

}
