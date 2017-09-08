package com.example.user.imagezoom;

import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 =(TextView) findViewById(R.id.tv1);

    }

    public void Zoom1(View view) {
        Intent exp_int = new Intent(this, ZoomActivity.class);
        exp_int.putExtra("ImageKey", "1");
       // startActivity(exp_int);
        startActivityForResult(exp_int, 10);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String str1 = data.getStringExtra("ReturnVal");
        Toast.makeText(this, "Receiving Value:"+str1,Toast.LENGTH_LONG).show();
        tv1.setText(str1);
    }

    public void Zoom2(View view) {
        Intent exp_int = new Intent(this, ZoomActivity.class);

        exp_int.putExtra("ImageKey", "2");
        startActivity(exp_int);
    }

    public void Zoom3(View view) {
        Intent exp_int = new Intent(this, ZoomActivity.class);

        exp_int.putExtra("ImageKey", "3");
        startActivity(exp_int);
    }

    public void OpenGoogle(View view){
        Intent i3 = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.co.in"));
        startActivity(i3);
    }

}
