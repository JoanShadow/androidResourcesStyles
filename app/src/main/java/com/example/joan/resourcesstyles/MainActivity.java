package com.example.joan.resourcesstyles;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context contexto = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String appName = getString(R.string.app_name);
        Log.d(MainActivity.class.getSimpleName(), appName);

        int backgroundColorObsolete = getResources().getColor(R.color.red);
        int backgroundColorV2 = ContextCompat.getColor(contexto, R.color.red);

        TextView lblTitle = findViewById(R.id.lblTitle);
        lblTitle.setBackgroundColor(backgroundColorV2);
    }
}