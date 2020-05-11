package fr.hudbert.bruno.cours.persistance.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import fr.hudbert.bruno.cours.persistance.bo.User;
import fr.hudbert.bruno.cours.persistance.contracts.UserContract;

public class UserDao {
    private SQLiteDatabase db;
    private DatabaseHelper helper;

    public UserDao(Context context){

        this.helper=new DatabaseHelper(context);
        this.db=helper.getWritableDatabase();
    }

    public long insert(User user){
        ContentValues cv = new ContentValues();
        cv.put(UserContract.COL_NAME,user.getName());
        cv.put(UserContract.COL_FIRSTNAME,user.getFirstname());

        return db.insert(UserContract.TABLE_NAME,null,cv);
    }
}
