package com.grandi.bambino.materialdesinghomework.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.grandi.bambino.materialdesinghomework.R;


public class SnackBarDemo extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack_bar_demo);
    }

    public void onClick(View v){
        Snackbar snackbar = Snackbar.make(v, "Press button on Snackbar", Snackbar.LENGTH_LONG);

        snackbar.setAction("Press", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar secondSnackbar = Snackbar.make(v, "This second snackbar", Snackbar.LENGTH_SHORT);

                secondSnackbar.show();
            }
        });

        snackbar.show();
    }
}
