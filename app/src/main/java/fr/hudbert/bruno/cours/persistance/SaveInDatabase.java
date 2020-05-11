package fr.hudbert.bruno.cours.persistance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import fr.hudbert.bruno.cours.R;
import fr.hudbert.bruno.cours.persistance.bo.User;
import fr.hudbert.bruno.cours.persistance.dao.UserDao;

public class SaveInDatabase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_in_database);
    }

    @Override
    protected void onResume() {
        super.onResume();

        User bh = new User();
        bh.setFirstname("Bruno");
        bh.setName("HUDBERT");


        UserDao ud = new UserDao(this);
        long id = ud.insert(bh);

        Toast.makeText(this,"ID =" + id,Toast.LENGTH_SHORT).show();

        }

}
