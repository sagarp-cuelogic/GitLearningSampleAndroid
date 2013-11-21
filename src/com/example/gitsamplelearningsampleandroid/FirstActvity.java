package com.example.gitsamplelearningsampleandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FirstActvity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_actvity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first_actvity, menu);
        return true;
    }
    
}
