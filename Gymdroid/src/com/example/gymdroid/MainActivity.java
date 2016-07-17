package com.example.gymdroid;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void onDayClick(View v){
		if(v.getId() == R.id.Monday){
			Intent intent = new Intent(this,MondayActivity.class);
			startActivity(intent);
		}else if(v.getId() == R.id.Tuesday){
			Intent intent = new Intent(this,TuesdayActivity.class);
			startActivity(intent);
		}else if(v.getId() == R.id.Wednesday){
			Intent intent = new Intent(this,WednesdayActivity.class);
			startActivity(intent);
		}else if(v.getId() == R.id.Thursday){
			Intent intent = new Intent(this,ThursdayActivity.class);
			startActivity(intent);
		}else if(v.getId() == R.id.Friday){
			Intent intent = new Intent(this,FridayActivity.class);
			startActivity(intent);
		}
		
	}
}
