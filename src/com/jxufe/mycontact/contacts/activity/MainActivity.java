package com.jxufe.mycontact.contacts.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

import com.jxufe.mycontact.R;
import com.jxufe.mycontact.login.activity.Login_Avtivity;

public class MainActivity extends Activity {
	boolean IsLogIn = false;
	Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);  
        setContentView(R.layout.activity_main);
        
        bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(IsLogIn == true){
		        	run();
		        }
		        else{
		        	login();
		        }
			}
		});
        
    }


    @Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		//login();
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void login(){
    	Intent login_intent =new Intent(MainActivity.this,Login_Avtivity.class);
    	this.startActivity(login_intent);
    }
    public void run(){
    	
    }
    
}
