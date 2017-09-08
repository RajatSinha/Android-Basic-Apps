package com.example.user.myappfrag1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    Button btn1;
    EditText ed1;
    TextView textView;
    public MainActivityFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        btn1 = (Button) v.findViewById(R.id.btn1);
        ed1 = (EditText) v.findViewById(R.id.ed1);
        textView =(TextView) v.findViewById(R.id.textView);
        btn1.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        String str1 = new String ("2");
        str1 = ed1.getText().toString();
        textView.setText(str1);

    }
}
