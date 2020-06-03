package com.example.scrum_java;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Task.db";
    public static final String TABLE_NAME = "task_table";
    public static final String COL_1= "ID";
    public static final String COL_2= "Name";
    public static final String COL_3 = "Employee";
    public static final String COL_4= "Status";


    public databaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, EMPLOYEE TEXT, STATUS INTEGER)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);

    }
}
