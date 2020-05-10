package com.grandi.bambino.materialdesinghomework.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.grandi.bambino.materialdesinghomework.R;

public class SheetsBottomDemo extends AppCompatActivity {

    LinearLayout bottomSheet;
    BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sheets_bottom_demo);

        bottomSheet = findViewById(R.id.bottom_sheet);

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        bottomSheetBehavior.setPeekHeight(150);
    }

    public void showSheetBottom(View view){
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }


}
