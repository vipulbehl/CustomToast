package com.demonhunts.customtoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.demonhunts.customtoastlibrary.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast customToast = new CustomToast(getApplicationContext(),"hello");
        customToast.setTextColor(Color.RED);
        customToast.setBackgroundColor(Color.GREEN);
        customToast.setTextSize(50);
        customToast.showToast();
    }
}
