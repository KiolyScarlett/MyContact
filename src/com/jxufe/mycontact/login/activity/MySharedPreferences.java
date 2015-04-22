package com.jxufe.mycontact.login.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MySharedPreferences {
	private static MySharedPreferences preference = null;  
    private SharedPreferences sharedPreference;  
    private String packageName = "";  
      
    private static final String LOGIN_NAME = "loginName"; //µ«¬º√˚  
    private static final String PASSWORD = "password";  //√‹¬Î  
    private static final String IS_SAVE_PWD = "isSavePwd"; // «∑Ò±£¡Ù√‹¬Î  
      
    public static synchronized MySharedPreferences getInstance(Context context){  
        if(preference == null)  
            preference = new MySharedPreferences(context);  
        return preference;  
    }  
      
      
    public MySharedPreferences(Context context){  
        packageName = context.getPackageName() + "_preferences";  
        sharedPreference = context.getSharedPreferences(  
                packageName, context.MODE_PRIVATE);  
    }  
      
      
    public String getLoginName(){  
        String loginName = sharedPreference.getString(LOGIN_NAME, "");  
        return loginName;  
    }  
      
      
    public void SetLoginName(String loginName){  
        Editor editor = sharedPreference.edit();  
        editor.putString(LOGIN_NAME, loginName);  
        editor.commit();  
    }  
      
      
    public String getPassword(){  
        String password = sharedPreference.getString(PASSWORD, "");  
        return password;  
    }  
      
      
    public void SetPassword(String password){  
        Editor editor = sharedPreference.edit();  
        editor.putString(PASSWORD, password);  
        editor.commit();  
    }  
      
      
    public boolean IsSavePwd(){  
        Boolean isSavePwd = sharedPreference.getBoolean(IS_SAVE_PWD, false);  
        return isSavePwd;  
    }  
      
      
    public void SetIsSavePwd(Boolean isSave){  
        Editor edit = sharedPreference.edit();  
        edit.putBoolean(IS_SAVE_PWD, isSave);  
        edit.commit();  
    }  

}
