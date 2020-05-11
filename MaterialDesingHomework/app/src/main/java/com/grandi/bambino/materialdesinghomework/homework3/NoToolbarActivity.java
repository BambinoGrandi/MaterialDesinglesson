package com.grandi.bambino.materialdesinghomework.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.grandi.bambino.materialdesinghomework.R;

public class NoToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_toolbar);


    }

    public void openActivity(View view){
        Intent intent = new Intent(this, AppBarDemo.class);
        startActivity(intent);
    }

    public void closeApp(View view){
        finish();
    }
}
