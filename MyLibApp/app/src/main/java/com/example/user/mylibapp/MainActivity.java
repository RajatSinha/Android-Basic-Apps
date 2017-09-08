package com.example.user.mylibapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn1, btn2, btn3 ;
    RelativeLayout rel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        rel = (RelativeLayout) findViewById(R.id.rel2);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button:
                MainActivityFragment maf = new MainActivityFragment();
                Bundle b1 = new Bundle();
                b1.putString("Title","Button1 Favours");
                maf.setArguments(b1);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.add(rel.getId(),maf,"myfrag");
                // ft.add(maf,"NewFrag");
                ft.commit();
                break ;

            case R.id.button2:
                FragmentManager fragmentManager2 = getFragmentManager();
                MainActivityFragment maf2 = (MainActivityFragment) fragmentManager2.findFragmentByTag("myfrag");
                FragmentTransaction ft2 = fragmentManager2.beginTransaction();
                ft2.remove(maf2);
                // ft.add(maf,"NewFrag");
                ft2.commit();
                break ;

            case R.id.button3:
                MainActivityFragment maf3 = new MainActivityFragment();
                Bundle b3 = new Bundle();
                b3.putString("Title","Button3 Miracle");
                maf3.setArguments(b3);
                FragmentManager fragmentManager3 = getFragmentManager();
                FragmentTransaction ft3 = fragmentManager3.beginTransaction();
                ft3.replace(rel.getId(),maf3,"myfrag");
                // ft.add(maf,"NewFrag");
                ft3.commit();
                break ;

        }

    }
}
