package com.xrj.jampto;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        Uri uri = new Uri.Builder()
                .scheme("xrj123456")
                .authority("login")
                .path("/create")
                .appendQueryParameter("username", "13800138000")
                .build();


        intent.setData(uri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

            finish();
        } else {
            Toast.makeText(this, "DO NOTHING", Toast.LENGTH_SHORT).show();
        }
    }
}
