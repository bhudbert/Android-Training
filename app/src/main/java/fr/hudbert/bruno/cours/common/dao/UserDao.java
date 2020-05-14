package fr.hudbert.bruno.cours.common.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import fr.hudbert.bruno.cours.common.bo.User;
import fr.hudbert.bruno.cours.persistence.contracts.UserContract;

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

    public User get(long id){
        User user = null;
        Cursor cursor = db.query(
                true,
                //FROM
                UserContract.TABLE_NAME,
                //SELECT
                new String[]{UserContract.COL_ID,UserContract.COL_FIRSTNAME,UserContract.COL_NAME},
                //WHERE
                UserContract.COL_ID+"=?",
                //VALUE IN ? WHERE
                new String[]{String.valueOf(id)},
                null,
                null,
                null,
                null
                );

        if (cursor.moveToNext()){
            user=new User();
            user.setId(cursor.getLong(cursor.getColumnIndex(UserContract.COL_ID)));
            user.setName(cursor.getString(cursor.getColumnIndex(UserContract.COL_NAME)));
            user.setFirstname(cursor.getString(cursor.getColumnIndex(UserContract.COL_FIRSTNAME)));

        }
        return user;
    }

}
