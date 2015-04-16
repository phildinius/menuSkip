package com.example.phil.menuskip;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;

/**
 * Created by Phil on 4/2/2015.
 */
public class MenuDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "menu_db";
    private static final String TABLE_NAME = "MENU";
    private static final int DATABASE_VERSION = 1;
    private Context context;
    private static final String UID = "_id";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
    UID + " integer primary key autoincrement, " +
            " lettuce integer, " +
            " tomato integer, " +
            " onion integer, " +
            " mushrooms integer, " +
            " pickles integer, " +
            " jalapenos integer, " +
            " salsa integer, " +
            " mayo integer, " +
            " cheese integer, " +
            " bacon integer, " +
            " o_straws integer, " +
            " chip_mayo integer, " +
            " pineapple integer, " +
            " teriyaki integer, " +
            " relish integer, " +
            " steak_sauce integer, " +
            " chili integer, " +
            " guacamole integer, " +
            " egg integer, " +
            " bbq integer, " +
            " turkey integer, " +
            " beef integer, " +
            " chicken integer, " +
            " bison integer, " +
            " white_bun integer, " +
            " wheat_bun integer, " +
            " ciabatta_bun integer, " +
            " cornmeal_bun integer, " +
            " onion_bun integer, " +
            " american integer, " +
            " cheddar integer, " +
            " provolone integer, " +
            " swiss integer, " +
            " pepperjack integer, " +
            " bleu integer);";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    public MenuDatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        Message.message(context, "dbConstructer has been called");
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        try {
            db.execSQL(CREATE_TABLE);
            Message.message(context, "dbCreate has been called");
        } catch (android.database.SQLException e){ // why isn't this being thrown???
            Message.message(context, ""+e);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        // TRY CATCH??
        db.execSQL(DROP_TABLE);
        Message.message(context, "dbUpgrade has been called");
        onCreate(db);
        try {
            db.execSQL(CREATE_TABLE);
            Message.message(context, "dbCreate has been called");
        } catch (android.database.SQLException e){ // why isn't this being thrown???
            Message.message(context, ""+e);
        }

    }

}
