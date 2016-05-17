package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	String msg = "Android : ";
	TextView CalcOutput;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
       super.onStart();
       Log.d(msg, "The onStart() event");
    }
    
    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
       super.onResume();
       Log.d(msg, "The onResume() event");
    }
    
    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
       super.onPause();
       Log.d(msg, "The onPause() event");
    }
    
    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
       super.onStop();
       Log.d(msg, "The onStop() event");
    }
    
    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
       super.onDestroy();
       Log.d(msg, "The onDestroy() event");
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
    
    public void buttonClick(View v){
    	if(v.getId() == R.id.button1){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("1");
    	}else if(v.getId() == R.id.button2){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("2");
    	}else if(v.getId() == R.id.button3){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("3");
    	}else if(v.getId() == R.id.button4){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("4");
    	}else if(v.getId() == R.id.button5){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("5");
    	}else if(v.getId() == R.id.button6){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("6");
    	}else if(v.getId() == R.id.button7){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("7");
    	}else if(v.getId() == R.id.button8){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("8");
    	}else if(v.getId() == R.id.button9){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText("9");
    	}
    }
}
