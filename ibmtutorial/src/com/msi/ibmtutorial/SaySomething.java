package com.msi.ibmtutorial;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SaySomething extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) 
   {
        super.onCreate(icicle);
        setContentView(R.layout.activity_say_something);
    }
    
    public void startNewActivity(View v){
    	Intent intent = new Intent(this,NewActivity.class);
    	startActivity(intent);
    }
}
