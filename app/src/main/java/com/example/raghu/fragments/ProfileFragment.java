package com.example.raghu.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raghu.navigationexample.R;

/**
 * Created by raghu on 13-Oct-17.
 */

public class ProfileFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.profile,container,false);
        return rootview;
    }
}
