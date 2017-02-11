package com.demonhunts.customtoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demonhunts.customtoastlibrary.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Success Button Resource
        Button success = (Button)findViewById(R.id.success);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast customToast = new CustomToast(getApplicationContext(),"Success");
                customToast.setTextColor(Color.BLACK);
                customToast.setBackgroundColor(Color.rgb(136,250,136));
                customToast.setTextSize(30);
                customToast.setToastIcon(R.drawable.success);
                customToast.showToast();
            }
        });


        //Warning Button Resource
        Button warning = (Button)findViewById(R.id.warning);
        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast customToast = new CustomToast(getApplicationContext(),"Warning");
                customToast.setTextColor(Color.BLACK);
                customToast.setBackgroundColor(Color.rgb(255,222,97));
                customToast.setTextSize(30);
                customToast.setBold();
                customToast.setToastIcon(R.drawable.warning);
                customToast.showToast();
            }
        });


        //Sync Button Resource
        Button sync = (Button)findViewById(R.id.sync);
        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast customToast = new CustomToast(getApplicationContext(),"Sync");
                customToast.setTextColor(Color.BLACK);
                customToast.setBackgroundColor(Color.CYAN);
                customToast.setTextSize(30);
                customToast.setToastIcon(R.drawable.sync);
                customToast.showToast();
            }
        });


        //Error Button Resource
        Button error = (Button)findViewById(R.id.error);
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast customToast = new CustomToast(getApplicationContext(),"Error");
                customToast.setTextColor(Color.BLACK);
                customToast.setBackgroundColor(Color.rgb(255,87,79));
                customToast.setTextSize(30);
                customToast.setToastIcon(R.drawable.error);
                customToast.showToast();
            }
        });


        //Info Button Resource
        Button info = (Button)findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast customToast = new CustomToast(getApplicationContext(),"Info");
                customToast.setTextColor(Color.BLACK);
                customToast.setBackgroundColor(Color.GREEN);
                customToast.setTextSize(30);
                customToast.setToastIcon(R.drawable.info);
                customToast.showToast();
            }
        });


        //Normal Button Resource
        Button normal = (Button)findViewById(R.id.normal);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast customToast = new CustomToast(getApplicationContext(),"Normal");
                customToast.setTextColor(Color.BLACK);
                customToast.setBackgroundColor(Color.rgb(98,179,182));
                customToast.setTextSize(30);
                customToast.showToast();
            }
        });
    }
}
