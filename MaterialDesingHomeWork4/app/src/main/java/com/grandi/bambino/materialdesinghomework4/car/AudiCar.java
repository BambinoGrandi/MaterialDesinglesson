package com.grandi.bambino.materialdesinghomework4.car;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.grandi.bambino.materialdesinghomework4.FragmentHistoryAudi;
import com.grandi.bambino.materialdesinghomework4.FragmentImagePreview;
import com.grandi.bambino.materialdesinghomework4.R;
import com.grandi.bambino.materialdesinghomework4.adapters.TabsAdapterCars;
import com.grandi.bambino.materialdesinghomework4.fragments.FragmentAudiRV;

public class AudiCar extends AppCompatActivity {

    private TabsAdapterCars adapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi_car);

        Fragment audiRV = new FragmentAudiRV().newInstance(null);
        Fragment imagePreview = new FragmentImagePreview().newInstance(null);
        Fragment historyAudi = new FragmentHistoryAudi().newInstance(null);

        adapter = new TabsAdapterCars(getSupportFragmentManager(), 0);
        adapter.addFragment(imagePreview, "Ауди");
        adapter.addFragment(historyAudi, "История");
        adapter.addFragment(audiRV, "Модели");

        viewPager = findViewById(R.id.view_page);
        viewPager.setAdapter(adapter);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }


}
