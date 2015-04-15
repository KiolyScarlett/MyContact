package com.jxufe.mycontact.login.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.jxufe.mycontact.R;

public class LogIn_Aacitity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);  
        
        setContentView(R.layout.avtivity_login);
	}
}
