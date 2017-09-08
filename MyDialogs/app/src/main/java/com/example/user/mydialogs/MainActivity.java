package com.example.user.mydialogs;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button btn, btn2, btn3, btn4;
    TextView tv, tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
    }


    public void Display(View view) {
        Calendar cal = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                (Toast.makeText(getApplicationContext(), "On Date Set : " + dayOfMonth + "/" + String.valueOf(monthOfYear + 1) + "/" + year, Toast.LENGTH_LONG)).show();
            }
        },

                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
    public void Display4 (View v){
    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
    alertBuilder.setTitle("Confirmation Message");
    alertBuilder.setMessage("Sure to delete this content");
    alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(MainActivity.this, "Positive Confirmation", Toast.LENGTH_LONG).show();
            dialog.cancel(); }; });
        alertBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Negative Confirmation",
                        Toast.LENGTH_LONG).show();
                dialog.cancel();} });
        AlertDialog ad = alertBuilder.create();
        ad.show() ;
    }
    public void Display2 (View v){
        Calendar cal2 = Calendar.getInstance();
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker arg0, int hourOfDay, int minute) {
                (Toast.makeText(getApplicationContext(), "On Time Set:"+ hourOfDay +":"+ minute +" ", Toast.LENGTH_LONG)).show();
            }
        },
                cal2.get(Calendar.HOUR_OF_DAY),
                cal2.get(Calendar.MINUTE), false);
        timePickerDialog.show();
    }
    public void Display3 (View view){
        ProgressDialog myPd_bar =new ProgressDialog(this);
        myPd_bar.setMessage("Loading....");
        myPd_bar.setTitle("Please Wait..");
        myPd_bar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        myPd_bar.setProgress(0);
        myPd_bar.setMax(30);
        myPd_bar.show();

        }
    }




