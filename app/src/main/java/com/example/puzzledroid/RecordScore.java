package com.example.puzzledroid;

import android.database.sqlite.SQLiteDatabase;

import androidx.appcompat.app.AppCompatActivity;

import com.example.puzzledroid.Utilities.utilities;

public class RecordScore extends AppCompatActivity {


    private void recordScore(){

        ConexionSQLiteHelper conex=new ConexionSQLiteHelper(this,"db_score",null,1);
        SQLiteDatabase db=conex.getWritableDatabase();
//Falta añadir de donde tomara los valores
       /* String insert="INSERT INTO "+ utilities.TABLA_SCORE
                +" ("+utilities.CAMPO_ID+" , "+utilities.CAMPO_USER+" ,"+utilities.CAMPO_SCORE+","+utilities.CAMPO_TIME+")" +
                "values (" ; */
        //db.execSQL(insert);
        db.close();
    }
}