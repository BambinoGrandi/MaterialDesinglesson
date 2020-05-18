package com.grandi.bambino.materialdesinghomework4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ProgressBar extends AppCompatActivity {

    android.widget.ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBar = findViewById(R.id.pb_line);
    }

    public void showProgressBar(View v){
        progressBar.setVisibility(View.VISIBLE);
    }

    public void hideProgressBar(View v){
        progressBar.setVisibility(View.INVISIBLE);
    }
}
