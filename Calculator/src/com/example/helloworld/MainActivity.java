package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.graphics.Color;
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
	String Number1="";
	String Number2="";
	String OutputNumber;
	boolean MathematicalOperatorButtonClicked=false;
	boolean ResultOperatorButtonClicked=false;
	boolean AddOperator = false;
	boolean MinusOperator = false;
	boolean DivideOperator = false;
    boolean MultiplyOperator = false;
	
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
    		CalcOutput.append("1");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"1";
    		}else{
    			this.Number1 = this.Number1+"1";
    		}
    		System.out.println("1");
    	}else if(v.getId() == R.id.button2){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("2");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"2";
    		}else{
    			this.Number1 = this.Number1+"2";
    		}
    	}else if(v.getId() == R.id.button3){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("3");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"3";
    		}else{
    			this.Number1 = this.Number1+"3";
    		}
    	}else if(v.getId() == R.id.button4){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("4");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"4";
    		}else{
    			this.Number1 = this.Number1+"4";
    		}
    	}else if(v.getId() == R.id.button5){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("5");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"5";
    		}else{
    			this.Number1 = this.Number1+"5";
    		}
    	}else if(v.getId() == R.id.button6){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("6");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"6";
    		}else{
    			this.Number1 = this.Number1+"6";
    		}
    	}else if(v.getId() == R.id.button7){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("7");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"7";
    		}else{
    			this.Number1 = this.Number1+"7";
    		}
    	}else if(v.getId() == R.id.button8){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("8");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"8";
    		}else{
    			this.Number1 = this.Number1+"8";
    		}
    	}else if(v.getId() == R.id.button9){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("9");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"9";
    		}else{
    			this.Number1 = this.Number1+"9";
    		}
    	}else if(v.getId() == R.id.button10){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("+");
    		this.MathematicalOperatorButtonClicked = true;
    		this.AddOperator = true;
    	}else if(v.getId() == R.id.button11){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("-");
    		this.MathematicalOperatorButtonClicked = true;
    		this.MinusOperator = true;
    	}else if(v.getId() == R.id.button12){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("/");
    		this.MathematicalOperatorButtonClicked = true;
    		this.DivideOperator = true;
    	}else if(v.getId() == R.id.button14){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("*");
    		this.MathematicalOperatorButtonClicked = true;
    		this.MultiplyOperator = true;
    	}else if(v.getId() == R.id.button15){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.append("0");
    		if(this.MathematicalOperatorButtonClicked){
    			this.Number2 = this.Number2+"0";
    		}else{
    			this.Number1 = this.Number1+"0";
    		}
    	}else if(v.getId() == R.id.button16){
            //handle the click here
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setText(""); // Clear screen
    		// Set all states to default initial
    		this.MathematicalOperatorButtonClicked = false;
    		this.MultiplyOperator = false;
    		this.AddOperator=false;
    		this.MinusOperator=false;
    		this.ResultOperatorButtonClicked = false;
    		this.Number1="";
    		this.Number2="";
    	}
    }
    
    public void outputResult(View v){
    	if(v.getId() == R.id.button13){
    		CalcOutput = (TextView) findViewById(R.id.text);
    		CalcOutput.setMovementMethod(new ScrollingMovementMethod());
        	int num1 = Integer.parseInt(Number1);
        	int num2 = Integer.parseInt(Number2);
        	//System.out.println(num1+" "+num2);
        	if(this.AddOperator){
        		// add logic
        		this.OutputNumber=Integer.toString(num1+num2);
        		CalcOutput.append("\n"+"="+OutputNumber+"\n");
        		this.AddOperator=false;
        		this.MathematicalOperatorButtonClicked=false;
        		this.Number1="";
        		this.Number2="";
        	}else if(this.MinusOperator){
        		//add logic
        		this.OutputNumber=Integer.toString(num1-num2);
        		CalcOutput.append("\n"+"="+OutputNumber+"\n");
        		this.MinusOperator=false;
        		this.MathematicalOperatorButtonClicked=false;
        		this.Number1="";
        		this.Number2="";
        	}else if(this.DivideOperator){
        		//add logic
        		this.OutputNumber=Integer.toString(num1/num2);
        		CalcOutput.append("\n"+"="+OutputNumber+"\n");
        		this.DivideOperator=false;
        		this.MathematicalOperatorButtonClicked=false;
        		this.Number1="";
        		this.Number2="";
        	}else if(this.MultiplyOperator){
        		//add logic
        		this.OutputNumber=Integer.toString(num1*num2);
        		CalcOutput.append("\n"+"="+OutputNumber+"\n");
        		this.MultiplyOperator=false;
        		this.MathematicalOperatorButtonClicked=false;
        		this.Number1="";
        		this.Number2="";
        	}
    	}
    }
}
