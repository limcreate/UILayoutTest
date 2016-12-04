package com.example.uilayouttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThreeDemo extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.three_layout);
        Log.d(MainActivity.TAG, "ThreeDemo starting..."+ this.getTaskId());
        
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			   Intent it1 = new Intent(ThreeDemo.this,MainActivity.class);
			   startActivity(it1);
			}
		});
	}
}
