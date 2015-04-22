package com.jxufe.mycontact.login.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jxufe.mycontact.R;

public class LogIn_Activity extends Activity{
	Button bt_signin;
	EditText et_user_password;
	EditText et_user_name;
	TextView bt_register;
	Context mcontext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mcontext = this;
        this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
        setContentView(R.layout.avtivity_login);
        
        bt_signin = (Button)findViewById(R.id.signin_button);
        et_user_name = (EditText)findViewById(R.id.user_name);
        et_user_password =(EditText)findViewById(R.id.user_password);
        
        bt_signin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
       // http://www.apkbus.com/blog-117765-44677.html
        //http://blog.csdn.net/anialy/article/details/8514437
	}
}
