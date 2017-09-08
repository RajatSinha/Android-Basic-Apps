package com.example.user.mydatapersistence;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2 ;
    SharedPreferences sharedPreferences;
    int a1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        a1 = sharedPreferences.getInt("ACCESS_COUNT",0);
        tv1.setText(String.valueOf(a1));
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor spe = sharedPreferences.edit();
        a1++ ;
        spe.putInt("ACCESS_COUNT",a1);
        spe.commit();
    }
}
