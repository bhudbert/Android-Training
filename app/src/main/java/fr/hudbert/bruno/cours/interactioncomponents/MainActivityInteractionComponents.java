package fr.hudbert.bruno.cours.interactioncomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fr.hudbert.bruno.cours.R;

public class MainActivityInteractionComponents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction_components_main);
    }

    public void onClickShowList(View view) {
        Intent intent =new Intent(this, ActivityInteractionComponentsLists.class);
        startActivity(intent);

    }

    public void onClickShowRecyclerViews(View view) {
        Intent  intent =new Intent(this, ActivityInteractionComponentsRecyclerView.class);
        startActivity(intent);

    }

    public void onClickShowCardView(View view) {
        Intent  intent =new Intent(this, ActivityInteractionComponentsCardViews.class);
        startActivity(intent);

    }

    public void onClickShowNavigationDrawer(View view) {
        Intent  intent =new Intent(this, ActivityInteractionComponentsNavigationDrawer.class);
        startActivity(intent);

    }

    public void onClickShowActionBar(View view) {
        Intent  intent =new Intent(this, ActivityInteractionComponentsActionBar.class);
        startActivity(intent);

    }
}
