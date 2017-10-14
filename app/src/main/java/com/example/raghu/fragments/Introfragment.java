package com.example.raghu.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raghu.navigationexample.R;

/**
 * Created by raghu on 13-Oct-17.
 */

public class Introfragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.intro_fragment,container,false);
        TextView intro=(TextView) rootview.findViewById(R.id.textView23);
        String newline= System.getProperty("line.separator");
        intro.setText("INTRODUCTION:" +newline+
                ""+newline+
                ""+newline+
                ""+newline+
                " This is program takes two numbers " +newline+
                        ""+newline+
                        "   i.e say A and B.Then do the Division " +newline+
                        ""+newline+
                        "   operation,if B is zero then raise " +newline+
                        ""+newline+
                        "   an exception else calculate the " +newline+
                        ""+newline+
                        "   Division of two numbers  "+newline+
                "");
        return rootview;
    }
}
