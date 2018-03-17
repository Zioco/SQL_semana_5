package com.example.edutools_011.ejerciciosqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by edutools_011 on 16/03/2018.
 */

public class AsistenteSqlite extends SQLiteOpenHelper {

    String cadenaSQL = "CREATE TABLE alumnos(id INTEGER PRIMARY KEY AUTOINCREMENT,nombre VARCHAR(100), dni VARCHAR(8),telefono VARCHAR(50))";

    public AsistenteSqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(cadenaSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS alumnos");
        sqLiteDatabase.execSQL(cadenaSQL);
    }
}
