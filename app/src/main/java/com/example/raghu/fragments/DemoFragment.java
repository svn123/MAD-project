package com.example.raghu.fragments;

import android.app.Fragment;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.raghu.navigationexample.R;

/**
 * Created by raghu on 13-Oct-17.
 */

public class DemoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View rootview =inflater.inflate(R.layout.demo,container,false);
        Button b=(Button) rootview.findViewById(R.id.button);
         final TextView ans=(TextView) rootview.findViewById(R.id.textView12);
       final  EditText m1=(EditText) rootview.findViewById(R.id.editText);
        final EditText m2=(EditText) rootview.findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float a=Float.parseFloat(m1.getText().toString());
                float b= Float.parseFloat(m2.getText().toString());
                if(b!=0)
                {
                    float sum=0;
                    sum=(float)a/b;
                    ans.setText("The answer is "+Float.toString(sum));
                    ans.setTextColor(Color.RED);


                }
                else
                {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(rootview.getContext());
                    builder.setMessage("B value cannot be 0!! Please Enter a different number").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            m1.setText("");
                            m2.setText("");
                            ans.setText("");
                            return;
                        }
                    });
                    builder.show();
                }
            }
        });
        return rootview;
    }
}
