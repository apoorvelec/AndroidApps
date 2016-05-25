package com.example.calculator1pt1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorInfo extends Activity{

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator_info);
		Intent intent = getIntent();
		String receivedmessage = intent.getStringExtra("MESSAGE");
		TextView calcinfoview = (TextView) findViewById(R.id.calc_info);
		calcinfoview.setText(receivedmessage);
	}
}
