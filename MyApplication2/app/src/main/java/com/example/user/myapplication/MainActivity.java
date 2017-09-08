package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, btn2, btn3, btn4 ;
    EditText ed1;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        tv1 = (TextView)findViewById(R.id.textView);
        ed1 = (EditText)findViewById(R.id.editText);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button1:
                String str1=ed1.getText().toString();
                tv1.setText(str1);
                Toast toast = Toast.makeText(this,"From New Button Click:"+str1, Toast.LENGTH_LONG);
                toast.show();

                break ;
            case R.id.button2:
                Toast t = Toast.makeText(this,"Button 2 Click"+v.getId(), Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.button3:
                Toast t1 = Toast.makeText(this,"Button 3 Click"+v.getId(), Toast.LENGTH_LONG);
                t1.show();
                break;
            case(R.id.button4):
                Toast t2 = Toast.makeText(this,"Button 4 Clicked"+v.getId(),Toast.LENGTH_LONG);
                t2.show();

        }



    }



}

