package fr.hudbert.bruno.cours.persistence.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import fr.hudbert.bruno.cours.persistence.contracts.UserContract;

public class DatabaseHelper extends SQLiteOpenHelper {



    public DatabaseHelper(Context context){
        super(context,"MyDatabase.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UserContract.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(UserContract.DROP_TABLE);
        onCreate(db);
    }
}
