package com.grandi.bambino.materialdesinghomework4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentImagePreview extends Fragment {

    public static FragmentImagePreview newInstance(Bundle bundle) {

        Bundle args = new Bundle();

        FragmentImagePreview fragment = new FragmentImagePreview();
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentImagePreview() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_image_preview, null);

        return v;
    }
}
