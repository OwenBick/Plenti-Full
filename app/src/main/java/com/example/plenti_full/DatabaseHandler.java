package com.example.plenti_full;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 @author Ocbick
  *
  * CRUD OPERATIONS
  * */
public class DatabaseHandler extends SQLiteOpenHelper {


    /*
     Database Version
     */
    public static final int DATABASE_VERSION = 1;

    /*
    Database Name
     */
    public static final String DATABASE_NAME = "recipedb";

    /*
    Table Names
     */
    public static final String TABLE_RECIPES = "recipes";

    /*
    Column Names
     */
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_CAT = "category";
    public static final String COLUMN_INSTRUCTIONS = "instructions";
    public static final String COLUMN_THUMB = "thumb";
    public static final String COLUMN_VIDEO = "video";
    public static final String COLUMN_INGREDIENT_1 = "ingredient1";
    public static final String COLUMN_INGREDIENT_2 = "ingredient2";
    public static final String COLUMN_INGREDIENT_3 = "ingredient3";
    public static final String COLUMN_INGREDIENT_4 = "ingredient4";
    public static final String COLUMN_INGREDIENT_5 = "ingredient5";
    public static final String COLUMN_INGREDIENT_6 = "ingredient6";
    public static final String COLUMN_INGREDIENT_7 = "ingredient7";
    public static final String COLUMN_INGREDIENT_8 = "ingredient8";
    public static final String COLUMN_INGREDIENT_9 = "ingredient9";
    public static final String COLUMN_INGREDIENT_10 = "ingredient10";
    public static final String COLUMN_INGREDIENT_11 = "ingredient11";
    public static final String COLUMN_INGREDIENT_12 = "ingredient12";
    public static final String COLUMN_INGREDIENT_13 = "ingredient13";
    public static final String COLUMN_INGREDIENT_14 = "ingredient14";
    public static final String COLUMN_INGREDIENT_15 = "ingredient15";
    public static final String COLUMN_INGREDIENT_16 = "ingredient16";
    public static final String COLUMN_INGREDIENT_17 = "ingredient17";
    public static final String COLUMN_INGREDIENT_18 = "ingredient18";
    public static final String COLUMN_INGREDIENT_19 = "ingredient19";
    public static final String COLUMN_INGREDIENT_20 = "ingredient20";




    /*
    CREATE TABLE STATEMENT
     */
    public static final String CREATE_RECIPE_TABLE = "CREATE TABLE " +
            TABLE_RECIPES + " (" + COLUMN_ID + " INTEGER PRIMARY KEY," +
            COLUMN_NAME + " TEXT," + COLUMN_CAT + " TEXT," + COLUMN_INSTRUCTIONS + " TEXT," + COLUMN_THUMB + " TEXT,"
            + COLUMN_INGREDIENT_1 + " TEXT,"
            + COLUMN_INGREDIENT_2 + " TEXT,"
            + COLUMN_INGREDIENT_3 + " TEXT,"
            + COLUMN_INGREDIENT_4 + " TEXT,"
            + COLUMN_INGREDIENT_5 + " TEXT,"
            + COLUMN_INGREDIENT_6 + " TEXT,"
            + COLUMN_INGREDIENT_7 + " TEXT,"
            + COLUMN_INGREDIENT_8 + " TEXT,"
            + COLUMN_INGREDIENT_9 + " TEXT,"
            + COLUMN_INGREDIENT_10 + " TEXT,"
            + COLUMN_INGREDIENT_11 + " TEXT,"
            + COLUMN_INGREDIENT_12 + " TEXT,"
            + COLUMN_INGREDIENT_13 + " TEXT,"
            + COLUMN_INGREDIENT_14 + " TEXT,"
            + COLUMN_INGREDIENT_15 + " TEXT,"
            + COLUMN_INGREDIENT_16 + " TEXT,"
            + COLUMN_INGREDIENT_17 + " TEXT,"
            + COLUMN_INGREDIENT_18 + " TEXT,"
            + COLUMN_INGREDIENT_19 + " TEXT,"
            + COLUMN_INGREDIENT_20 + " TEXT,"
            + COLUMN_VIDEO + " TEXT)";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_RECIPE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /*
    INSERT RECORDS
     */


    /*
    RETRIEVE RECORDS
     */





    /*
        UPDATE RECORDS
    */



    /*
        DELETE RECORDS
     */


}

