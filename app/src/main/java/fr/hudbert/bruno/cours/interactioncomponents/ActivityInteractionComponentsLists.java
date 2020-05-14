package fr.hudbert.bruno.cours.interactioncomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fr.hudbert.bruno.cours.R;
import fr.hudbert.bruno.cours.common.bo.User;
import fr.hudbert.bruno.cours.interactioncomponents.adapter.UserAdapter;

public class ActivityInteractionComponentsLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction_components_list);
    }

    protected void onResume(){
        super.onResume();
        List<User> listUser = new ArrayList<User>();
        listUser.add(new User("HUDBERT","Bruno"));
        listUser.add(new User("HUDBERT","Alexandra"));
        listUser.add(new User("HUDBERT","Paloma"));

        UserAdapter adapter = new UserAdapter(this,R.layout.activity_interaction_components_list_element,listUser);
        ListView listView = findViewById(R.id.mylist);
        listView.setAdapter(adapter);

    }
}
