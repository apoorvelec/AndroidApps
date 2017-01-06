package com.columbia.investofolio.database;

import com.columbia.investofolio.database.InvestofolioDataContract.InvestmentTable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class InvestofolioDBHelper extends SQLiteOpenHelper{

	// If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "Investofolio.db";
    private static final String SQL_CREATE_ENTRIES =
		    "CREATE TABLE " + InvestmentTable.TABLE_NAME + " (" +
		    		InvestmentTable._ID + " INTEGER PRIMARY KEY," +
		    		InvestmentTable.COLUMN_NAME_POLICY_HOLDER_NAME + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_INVESTMENT_NAME + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_FD_NO + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_INCEPTION_DATE + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_MATURITY_DATE + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_PRINCIPAL_AMOUNT + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_PRINCIPAL_AMOUNT_SOURCE + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_RATE_OF_INTEREST + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_MATURITY_PROCEEDS + " TEXT," +
		    		InvestmentTable.COLUMN_NAME_SPECIAL_REMARK + " TEXT)";

		private static final String SQL_DELETE_ENTRIES =
		    "DROP TABLE IF EXISTS " + InvestmentTable.TABLE_NAME;

    public InvestofolioDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
