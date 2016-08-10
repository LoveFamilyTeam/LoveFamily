package com.example.style.lovefamily;

import android.os.Bundle;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.LinearLayout;

import com.example.style.goodsmoudle.PublishFragment;
import com.example.style.homemoudle.HomeFragment;
import com.example.style.usermoudle.UserFragment;

import java.util.ArrayList;


public class MainActivity extends FragmentActivity {
   // public static ArrayList data=new ArrayList();
    LinearLayout layout1;
    LinearLayout layout2;
    LinearLayout layout3;
    FragmentManager fm;
    HomeFragment homeFragment;
    PublishFragment publishFragment;
    UserFragment userFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeFragment=new HomeFragment();

        layout1=(LinearLayout) findViewById(R.id.shouye);
        layout2=(LinearLayout) findViewById(R.id.fabu);
        layout3=(LinearLayout) findViewById(R.id.wode);


        fm=getSupportFragmentManager();
        FragmentTransaction transaction = fm. beginTransaction();
        transaction.add(R.id.fragment, homeFragment);
        transaction.commit();

        //点击事件 换碎片
        infView();
    }
    public void infView(){
        layout1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(homeFragment==null){
                    fm=getSupportFragmentManager();
                    FragmentTransaction transaction = fm. beginTransaction();
                    transaction.replace(R.id.fragment, homeFragment);
                    transaction.commit();
                }
                else{
                    fm=getSupportFragmentManager();
                    FragmentTransaction transaction = fm. beginTransaction();
                    transaction.replace(R.id.fragment, homeFragment);
                    transaction.commit();
                }
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (publishFragment==null){
                    publishFragment=new PublishFragment();
                    fm=getSupportFragmentManager();
                    FragmentTransaction transaction = fm. beginTransaction();
                    transaction.replace(R.id.fragment, publishFragment);
                    transaction.commit();
                }else{
                    fm=getSupportFragmentManager();
                    FragmentTransaction transaction = fm. beginTransaction();
                    transaction.replace(R.id.fragment, publishFragment);
                    transaction.commit();
                }
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userFragment=new UserFragment();
                fm=getSupportFragmentManager();
                FragmentTransaction transaction = fm. beginTransaction();
                transaction.replace(R.id.fragment, userFragment);
                transaction.commit();
            }
        });
    }
}
