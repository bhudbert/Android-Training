package fr.hudbert.bruno.cours.interactioncomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import fr.hudbert.bruno.cours.R;
import fr.hudbert.bruno.cours.interactioncomponents.adapter.UserRecyclerViewAdapter;

public class ActivityInteractionComponentsRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction_components_recycler_view);
    }

    @Override
    protected void onResume() {
        super.onResume();
        RecyclerView rv=findViewById(R.id.myrecyclerlist);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager rlm=new LinearLayoutManager(this);
        rv.setLayoutManager(rlm);
        String[] couleurs= {"Bleu","Blanc","Rouge"};
        UserRecyclerViewAdapter adapter = new UserRecyclerViewAdapter(couleurs);
        rv.setAdapter(adapter);
    }

}
