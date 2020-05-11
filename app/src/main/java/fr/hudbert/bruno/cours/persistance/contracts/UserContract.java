package fr.hudbert.bruno.cours.persistance.contracts;

public class UserContract {

    public static final String TABLE_NAME="Users";

    public static final String COL_ID="id";
    public static final String COL_NAME="name";
    public static final String COL_FIRSTNAME="firstname";

    public static final String CREATE_TABLE="CREATE TABLE " + TABLE_NAME
                                + "( "
                                + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                                + COL_NAME + " TEXT,"
                                + COL_FIRSTNAME + " TEXT); " ;
    public static final String DROP_TABLE=" DROP TABLE "+ TABLE_NAME;




}
