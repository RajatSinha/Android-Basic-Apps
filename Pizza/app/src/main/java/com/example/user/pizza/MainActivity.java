package com.example.user.pizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
    }


    public void Display (View v){
        EditText ed = (EditText) findViewById(R.id.Rajat);
        String str =  ed.getText().toString();
        CheckBox cb = (CheckBox) findViewById(R.id.Chicken);
        CheckBox cb1 = (CheckBox) findViewById(R.id.Veg);
        CheckBox cb2 = (CheckBox) findViewById(R.id.Salami);
        EditText ed1 = (EditText) findViewById(R.id.Quantity);
        boolean b1 = cb.isChecked();
        boolean b2 = cb1.isChecked();
        boolean b3 = cb2.isChecked();
        int a = Integer.parseInt(ed1.getText().toString());
        int price = 130*a;

        StringBuffer str2 = new StringBuffer("");

        if(b1==true){str2.append("Chicken ");}
        if(b2==true){str2.append("Veg ");}
        if(b3==true){str2.append("Salami ");}

        String str1 = "Customer Name: "+str+"\nToppings: "+str2+"\nQuantity: "+a+"\nTotal Bill: "+"Rs."+price;


        TextView tv1 = (TextView)findViewById(R.id.action0);
        tv1.setText(str1);
    }
}
