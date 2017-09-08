package com.example.user.mylistactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView tv1;
    ListView lv1;

    String[] items = {"Neeti Khand", "Gyan Khand", "Shakti Khand", "Nyay Khand", "Ahinsa Khand", "Vaibhav Khand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.text);
        lv1 = (ListView) findViewById(R.id.alist);
                ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        lv1.setAdapter(aa);
        lv1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Toast.makeText(this,items[position],Toast.LENGTH_SHORT).show();
    }
}
