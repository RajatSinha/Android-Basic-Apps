package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    TextView tv1;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        tv1 = (TextView) findViewById(R.id.lblUserName);
        String str1 = tv1.getText().toString();
        tv1.setText("Rajat Sinha");
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        ed1 = (EditText) findViewById(R.id.ediUserName);
        Toast.makeText(this, "Hello Toast First", Toast.LENGTH_LONG).show();

        Log.d("MainActivity", "Putting value in logcat");

    }



    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Hello Toast onStart", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Hello Toast onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Hello Toast onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Hello Toast onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Hello Toast onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Hello Toast onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        String str1;
        str1=ed1.getText().toString();
        tv1.setText(str1);
    }

}



