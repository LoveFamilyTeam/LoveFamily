package com.example.style.lovefamily;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.style.lovefamily.Adapter.ViewPagerAdapter;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lenove on 2016/8/10.
 */
public class Welcome extends Activity {
    boolean isFirst;
    private ViewPager vp;
    private TextView textView;
    private ArrayList<View> pageview;
    private int autoCurrIndex=0;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(autoCurrIndex == pageview.size()){
                 //跳转界面
                Intent intent=new Intent(Welcome.this,MainActivity.class);
                startActivity(intent);
            }
            vp.setCurrentItem(autoCurrIndex,false);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);
        vp = (ViewPager) findViewById(R.id.welcom_pager);
        iniView();
    }
    public void iniView() {
        SharedPreferences pref = getSharedPreferences("first", Activity.MODE_PRIVATE);
        isFirst = pref.getBoolean("status", true);

        if (!isFirst) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        pageview=new ArrayList<View> ();
        //是第一次进入  如果点击 跳过广告，直接进入首页
        LayoutInflater inflater=getLayoutInflater();
        //注入图片所在布局
        View view1 = inflater.inflate(R.layout.guide1, null);
        View view2 = inflater.inflate(R.layout.guide2, null);
        View view3 = inflater.inflate(R.layout.guide3, null);
        //将这个view放入到数组中
        pageview.add(view1);
        pageview.add(view2);
        pageview.add(view3);

        //自己定义的adapter
        final ViewPagerAdapter pagerAdapter=new ViewPagerAdapter(pageview,this);
        vp.setAdapter(pagerAdapter);

        //跳过广告的事件
        textView=(TextView)findViewById(R.id.comein) ;
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

       //开一个线程
        new Thread(){
            public void run(){
                for(int i=0;i<= pageview.size();i++){
                    Message message=new Message();
                    autoCurrIndex = i;
                    message.obj = autoCurrIndex ;
                    handler.sendMessage(message);
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}