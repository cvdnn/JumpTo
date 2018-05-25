package com.xrj.jampto;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        TextView labelView = findViewById(R.id.label);

        Uri uri = getIntent().getData();
        if (uri != null) {
            labelView.setText(uri.toString());
        } else {
            labelView.setText("ACTION FROM");
        }
    }
}