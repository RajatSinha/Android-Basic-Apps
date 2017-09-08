package com.example.user.imagezoom;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.user.imagezoom.R.drawable.a;

public class ZoomActivity extends AppCompatActivity {

    ImageView imageView;
    Button btn2;
    EditText ed1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        btn2 = (Button) findViewById(R.id.btn2);
        ed1 = (EditText) findViewById(R.id.ed1);


        imageView = (ImageView) findViewById(R.id.imageView);
        String str = new String("4");
        Intent intent1 = getIntent();
        str = intent1.getStringExtra("ImageKey");
        Toast.makeText(this, "Image To show:" + str, Toast.LENGTH_LONG).show();
        if (str.equalsIgnoreCase("1")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.rajat_123));
            Intent i2 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9999283283"));
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                requestPermissions(new String[]{"android.permission.CALL_PHONE"}, 10);
                //Toast.makeText(this, "Permission not granted", Toast.LENGTH_LONG).show();
                //  return;
            }
            //startActivity(i2);
            //Toast.makeText(this, "Permission granted:starting call", Toast.LENGTH_LONG).show();




        } else if (str.equalsIgnoreCase("2")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.b));


        } else {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.c));
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 10) {
            for (int i = 0; i < permissions.length; i++) {
                String permission = permissions[i];
                int grantResult = grantResults[i];

                if (permission.equals(Manifest.permission.SEND_SMS)) {
                    if (grantResult == PackageManager.PERMISSION_GRANTED) {
                        Intent i2 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9999283283"));
                        try {
                            startActivity(i2);
                        } catch (SecurityException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }

        }
    }

    public void Move(View view) {
        Intent i4 = new Intent();
        String str1 = ed1.getText().toString();
        Toast.makeText(this, "Sending Value:"+str1,Toast.LENGTH_LONG).show();
        i4.putExtra("ReturnVal",str1);
        setResult(Activity.RESULT_OK,i4);
        finish();
    }
}


