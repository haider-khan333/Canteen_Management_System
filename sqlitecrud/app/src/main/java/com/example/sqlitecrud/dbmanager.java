package com.example.sqlitecrud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbmanager extends SQLiteOpenHelper {
   private static final String dbname="dbcontact";

    public dbmanager(@Nullable Context context)
    {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
       String qry="create table tbl_contact ( id integer primary key autoincrement, orders text, updates text, info text, chats text, Locations text, cancels text, dashboards text)";
       sqLiteDatabase.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
      String qry="DROP TABLE IF EXISTS tbl_contact";
      sqLiteDatabase.execSQL(qry);
      onCreate(sqLiteDatabase);
    }

    public  String addRecord(String orderStatus, String updateStatus, String deliveryInfo, String visitChat, String deliveryLocation, String cancelOrder, String dashboard)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("orders", orderStatus);
        cv.put("updates",updateStatus);
        cv.put("info",deliveryInfo);
        cv.put("chats",visitChat);
        cv.put("locations",deliveryLocation);
        cv.put("cancels",cancelOrder);
        cv.put("dashboards",dashboard);
        float res=db.insert("tbl_contact",null,cv);

        if(res==-1)
             return "Failed";
        else
             return  "Successfully inserted";

    }

    public Cursor readalldata()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String qry="select * from tbl_contact order by id desc";
        Cursor cursor=db.rawQuery(qry,null);
        return  cursor;
    }
}
