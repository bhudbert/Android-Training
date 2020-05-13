package fr.hudbert.bruno.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fr.hudbert.bruno.cours.asynchronestasks.MainActivityAsynchroneTask;
import fr.hudbert.bruno.cours.broadcastservices.MainActivityBroadcastServices;
import fr.hudbert.bruno.cours.geolocalisation.MainActivityGeolocalisation;
import fr.hudbert.bruno.cours.interactions.MainActivityInteractions;
import fr.hudbert.bruno.cours.interactionscomponets.MainActivityInteractionComponents;
import fr.hudbert.bruno.cours.layouts.ActivityWithMixedLayouts;
import fr.hudbert.bruno.cours.layouts.MainActivityLayouts;
import fr.hudbert.bruno.cours.persistence.MainActivityPersistence;
import fr.hudbert.bruno.cours.room.MainActivityRoom;
import fr.hudbert.bruno.cours.webservices.MainActivityWebServices;
import fr.hudbert.bruno.cours.webviews.MainActivityWebViews;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowLayouts(View view) {

        Intent  intent= new Intent(this, MainActivityLayouts.class);
        startActivity(intent);
    }

    public void onClickShowInteractions(View view) {
        Intent  intent= new Intent(this, MainActivityInteractions.class);
        startActivity(intent);

    }

    public void onClickShowInterractionsComponents(View view) {
        Intent  intent= new Intent(this, MainActivityInteractionComponents.class);
        startActivity(intent);

    }

    public void onClickShowPersistence(View view) {
        Intent  intent= new Intent(this, MainActivityPersistence.class);
        startActivity(intent);
    }

    public void onClickShowAsyncTasks(View view) {
        Intent  intent= new Intent(this, MainActivityAsynchroneTask.class);
        startActivity(intent);

    }

    public void onClickShowWebServicess(View view) {
        Intent  intent= new Intent(this, MainActivityWebServices.class);
        startActivity(intent);

    }

    public void onClickShowBroadcastServices(View view) {
        Intent  intent= new Intent(this, MainActivityBroadcastServices.class);
        startActivity(intent);

    }

    public void onClickShowRoom(View view) {
        Intent  intent= new Intent(this, MainActivityRoom.class);
        startActivity(intent);

    }

    public void onClickShowWebViews(View view) {
        Intent  intent= new Intent(this, MainActivityWebViews.class);
        startActivity(intent);

    }

    public void onClickShowGeolocalisation(View view) {
        Intent  intent= new Intent(this, MainActivityGeolocalisation.class);
        startActivity(intent);

    }
}
