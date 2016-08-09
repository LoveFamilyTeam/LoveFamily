package com.example.style.lovefamily;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.LinearLayout;

import com.example.style.goodsmoudle.PublishActivity;
import com.example.style.homemoudle.HomeActivity;
import com.example.style.usermoudle.UserActivity;


public class MainActivity extends Activity {
    LinearLayout layout1;
    LinearLayout layout2;
    LinearLayout layout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1=(LinearLayout) findViewById(R.id.shouye);
        layout2=(LinearLayout) findViewById(R.id.fabu);
        layout3=(LinearLayout) findViewById(R.id.wode);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, PublishActivity.class);
                startActivity(intent);
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent);
            }
        });
    }
}
