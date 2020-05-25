package com.grandi.bambino.materialdesinghomework4.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.grandi.bambino.materialdesinghomework4.adapters.AdapterRVCars;
import com.grandi.bambino.materialdesinghomework4.R;
import com.grandi.bambino.materialdesinghomework4.model.Audi;

import java.util.ArrayList;
import java.util.List;

public class FragmentAudiRV extends Fragment {

    public static FragmentAudiRV newInstance(Bundle bundle){
        FragmentAudiRV currentFragment = new FragmentAudiRV();
        Bundle args = new Bundle();
        args.putBundle("getArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    private List<Audi> cars = new ArrayList<>();
    private RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_audi_rv, null);

        initRecyclerView(v);

        return v;
    }

    private void initRecyclerView(View v){
        rv = v.findViewById(R.id.rv_audi);
        LinearLayoutManager layoutManager = new LinearLayoutManager(v.getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        AdapterRVCars adapter = new AdapterRVCars(v.getContext(), initArray());
        rv.setAdapter(adapter);
    }

    private List initArray(){

        cars.add(new Audi(getActivity().getDrawable(R.drawable.audi80), R.string.audi_80));
        cars.add(new Audi(getActivity().getDrawable(R.drawable.audi100), R.string.audi_100));
        cars.add(new Audi(getActivity().getDrawable(R.drawable.a4), R.string.audi_a4));
        cars.add(new Audi(getActivity().getDrawable(R.drawable.r8), R.string.audi_r8));

        return cars;
    }

}
