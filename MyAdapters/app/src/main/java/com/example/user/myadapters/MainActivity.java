package com.example.user.myadapters;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.File;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {
    TextView selection;
    String[] items = {"Table", "Chair", "Laptop", "Mobile", "Desktop", "File"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        selection = (TextView) findViewById(R.id.selection);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selection.setText(items[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        selection.setText("");
    }
}
