package com.grandi.bambino.materialdesinghomework4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentHistoryAudi extends Fragment {

    public static FragmentHistoryAudi newInstance(Bundle bundle) {

        Bundle args = new Bundle();

        FragmentHistoryAudi fragment = new FragmentHistoryAudi();
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentHistoryAudi() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_history_audi, null);

        return v;
    }
}
