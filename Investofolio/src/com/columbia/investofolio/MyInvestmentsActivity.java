package com.columbia.investofolio;

import com.columbia.investofolio.database.InvestofolioDBHelper;
import com.columbia.investofolio.database.InvestofolioDataContract.InvestmentTable;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MyInvestmentsActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_investments);
	}
	
	public void showDatabaseRecords(View v){
		InvestofolioDBHelper DbHelper = new InvestofolioDBHelper(this);
		SQLiteDatabase db = DbHelper.getReadableDatabase();
		
		String sql = "SELECT * FROM "+InvestmentTable.TABLE_NAME;
		Cursor cursor = db.rawQuery(sql , null);
		
		while(cursor.moveToNext()) {
			String investmentname = cursor.getString(
					cursor.getColumnIndexOrThrow(InvestmentTable.COLUMN_NAME_INVESTMENT_NAME));
			Button myButton = new Button(this);
			myButton.setText(investmentname);

			LinearLayout ll = (LinearLayout)findViewById(R.id.button_layout);
			LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
			ll.addView(myButton, lp);
		}
		cursor.close();
	}
	
}
