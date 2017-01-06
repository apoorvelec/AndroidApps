package com.columbia.investofolio;

import com.columbia.investofolio.database.InvestofolioDBHelper;
import com.columbia.investofolio.database.InvestofolioDataContract.InvestmentTable;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AddInvestmentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_investment);
	}
	
	public void startMainActivity(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	public void addInvestmentDataToDB(View v){
		//Here add data to the Investofolio.db
		InvestofolioDBHelper DbHelper = new InvestofolioDBHelper(v.getContext());
		SQLiteDatabase db = DbHelper.getWritableDatabase();
		// Create a new map of values, where column names are the keys
		ContentValues values = new ContentValues();
		
		values.put(InvestmentTable.COLUMN_NAME_POLICY_HOLDER_NAME, ((EditText)findViewById(R.id.policy_holder_name)).getText().toString());
		Log.d("Form", ((EditText)findViewById(R.id.policy_holder_name)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_INVESTMENT_NAME, ((EditText)findViewById(R.id.investment_name)).getText().toString());
		Log.d("Form", ((EditText)findViewById(R.id.investment_name)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_FD_NO, ((EditText)findViewById(R.id.fixed_deposit_number)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_INCEPTION_DATE, ((EditText)findViewById(R.id.inception_date)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_MATURITY_DATE, ((EditText)findViewById(R.id.maturity_date)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_PRINCIPAL_AMOUNT, ((EditText)findViewById(R.id.principal_amount)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_PRINCIPAL_AMOUNT_SOURCE, ((EditText)findViewById(R.id.principal_amount_source)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_RATE_OF_INTEREST, ((EditText)findViewById(R.id.interest_rate)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_MATURITY_PROCEEDS, ((EditText)findViewById(R.id.maturity_proceeds)).getText().toString());
		values.put(InvestmentTable.COLUMN_NAME_SPECIAL_REMARK, ((EditText)findViewById(R.id.special_remark)).getText().toString());
		
		db.insert(InvestmentTable.TABLE_NAME, null, values);
		Log.d("DB", "updated");
		// Database is now updated. Now return to MainActivity activity
		startMainActivity(v);
		
	}
	
}
