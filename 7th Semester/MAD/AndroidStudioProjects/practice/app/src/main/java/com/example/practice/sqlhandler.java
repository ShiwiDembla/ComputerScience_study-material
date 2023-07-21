package com.example.practice;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sqlhandler extends SQLiteOpenHelper {
    public static final String dbname = "student.db";
    public sqlhandler(Context context,  String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, dbname, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table student_table(name text primary key, number text, course text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS student_table");
        onCreate(db);
    }

    public boolean insertdata(String name, String number, String course){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name", name);
        cv.put("number", number);
        cv.put("course", course);

        long res = DB.insert("student_table", null, cv);
        if (res==-1) {
            return false;
        }
        else{
            return true;
        }
    }
}
