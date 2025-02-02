package com.example.nihar.delta;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadScreen extends AppCompatActivity {
    protected Intent inte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_sceen);
        SharedPreferences sharedPref;
        sharedPref= getSharedPreferences("myPref", Context.MODE_PRIVATE);
        String userId=sharedPref.getString("user_id","");
        if(userId.equals("")){
            inte = new Intent(LoadScreen.this,Login.class);
        }
        else{
            inte = new Intent(LoadScreen.this,MainMenu.class);
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                startActivity(inte);
                finish();
            }
        }, 2000);
        //
    }

}
