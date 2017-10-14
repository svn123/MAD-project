package com.example.raghu.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raghu.navigationexample.R;

/**
 * Created by raghu on 13-Oct-17.
 */

public class PseudoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.pseudo,container,false);
        TextView pseudo=(TextView) rootview.findViewById(R.id.textView25);
        String newLine = System.getProperty("line.separator");
        pseudo.setText(" PSEUDO CODE :"+newLine+
                ""+newLine+


                "" +newLine+
                "PROGRAM DIVIDE:" +newLine+
                ""+newLine+
                ""+newLine+
                "      READ A" +newLine+
                ""+newLine+
                ""+newLine+
                "      READ B" +newLine+
                ""+newLine+ ""+newLine+
                "      IF B!=0" +newLine+
                ""+newLine+ ""+newLine+
                "           THEN "+" PRINT THE ANSWER" +newLine+
                ""+newLine+ ""+newLine+
                "           ELSE "+" RAISE AN EXCEPTION" +newLine+
                ""+newLine+ ""+newLine+
                "      ENDIF" +newLine+
                ""+newLine+ ""+newLine+
                "END"+newLine+"");
        return rootview;
    }
}
