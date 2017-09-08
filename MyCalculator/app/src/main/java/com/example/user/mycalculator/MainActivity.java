package com.example.user.mycalculator;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText ed1;
    Button zero, one, two, three, four, five, six, seven, eight, nine, add, subtract, multiply, divide, decimal, equals, b17, b18, b19, b20;
    String ops = "";
    double val1=0, val2=0;
    double valflag = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        ed1 = (EditText) findViewById(R.id.editText);
        ed1.setInputType(InputType.TYPE_NULL);
        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(this);
        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(this);
        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(this);
        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(this);
        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(this);
        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(this);
        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(this);
        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(this);
        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(this);
        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(this);
        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(this);
        subtract = (Button) findViewById(R.id.subtract);
        subtract.setOnClickListener(this);
        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(this);
        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(this);
        decimal = (Button) findViewById(R.id.decimal);
        decimal.setOnClickListener(this);
        equals = (Button) findViewById(R.id.equals);
        equals.setOnClickListener(this);
        b17 = (Button) findViewById(R.id.button17);
        b17.setOnClickListener(this);
        b18 = (Button) findViewById(R.id.button18);
        b18.setOnClickListener(this);
        b19 = (Button) findViewById(R.id.button19);
        b19.setOnClickListener(this);
        b20 = (Button) findViewById(R.id.button20);
        b20.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String str1 = ed1.getText().toString();
        switch (v.getId()) {
            case R.id.add:
                ops = "+";
                str1 = str1.concat(add.getText().toString());
                ed1.setText(str1);
                if (valflag == 1)
                    valflag = 2;
                break;

            case R.id.subtract:
                ops = "-";
                str1 = str1.concat(subtract.getText().toString());

                ed1.setText(str1);
                if (valflag == 1)
                    valflag = 2;

                break;

            case R.id.multiply:
                ops = "*";
                str1 = str1.concat(multiply.getText().toString());
                ed1.setText(str1);
                if (valflag == 1)
                    valflag = 2;

                break;


            case R.id.divide:
                ops = "/";
                str1 = str1.concat(divide.getText().toString());
                ed1.setText(str1);
                if (valflag == 1)
                    valflag = 2;

                break;
            case R.id.zero:
                str1 = str1.concat(zero.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 0;
                }
                else {
                    val2 = val2 * 10 + 0;
                }
                break;


            case R.id.one:
                str1 = str1.concat(one.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 1;
                } else {
                    val2 = val2 * 10 + 1;
                }

                break;
            case R.id.two:
                str1 = str1.concat(two.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 2;
                } else {
                    val2 = val2 * 10 + 2;
                }
                break;
            case R.id.three:
                str1 = str1.concat(three.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 3;
                } else {
                    val2 = val2 * 10 + 3;
                }
                break;
            case R.id.four:
                str1 = str1.concat(four.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 4;
                } else {
                    val2 = val2 * 10 + 4;
                }
                break;
            case R.id.five:
                str1 = str1.concat(five.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 5;
                } else {
                    val2 = val2 * 10 + 5;
                }
                break;
            case R.id.six:
                str1 = str1.concat(six.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 6;
                } else {
                    val2 = val2 * 10 + 6;
                }
                break;
            case R.id.seven:
                str1 = str1.concat(seven.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 7;
                } else {
                    val2 = val2 * 10 + 7;
                }
                break;
            case R.id.eight:
                str1 = str1.concat(eight.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 8;
                } else {
                    val2 = val2 * 10 + 8;
                }
                break;
            case R.id.nine:
                str1 = str1.concat(nine.getText().toString());
                ed1.setText(str1);
                if (valflag == 1) {
                    val1 = val1 * 10 + 9 ;
                } else {
                    val2 = val2 * 10 + 9 ;
                }
                break;
            case R.id.decimal:
                str1 = str1.concat(decimal.getText().toString());
                ed1.setText(str1);
                break;
            case R.id.equals:
                str1 = str1.concat(equals.getText().toString());
                ed1.setText(str1);

                if (ops.equalsIgnoreCase("+")) {
                    double val3 = val1 + val2;
                    ed1.setText("" + val3);


                } else if (ops.equalsIgnoreCase("-")) {
                    double val4 = val1 - val2;
                    ed1.setText("" + val4);

                } else if (ops.equalsIgnoreCase("*")) {
                    double val5 = val1 * val2;
                    ed1.setText("" + val5);

                } else if (ops.equalsIgnoreCase("/")) {
                    double val6 = val1 / val2;
                    ed1.setText("" + val6);

                }

                break;
            case R.id.button17:
                ed1.setText("");
                val1 = 0;
                val2 = 0;
                valflag = 1;
                ops = "";
                break;
            case R.id.button18:
                ed1.setText("");
                val1 = 0;
                val2 = 0;
                valflag = 1;
                ops = "";
                break;
            case R.id.button20:
                ed1.setText("");
                val1 = 0;
                val2 = 0;
                valflag = 1;
                ops = "";
        }
    }
}


