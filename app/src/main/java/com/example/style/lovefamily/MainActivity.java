package com.example.style.lovefamily;

import android.graphics.Color;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.style.goodsmoudle.PublishFragment;
import com.example.style.homemoudle.HomeFragment;
import com.example.style.usermoudle.UserFragment;

import java.util.ArrayList;


public class MainActivity extends FragmentActivity {
    public static ArrayList data=new ArrayList();
    LinearLayout layout1,layout2,layout3;
    ImageView img1,img2,img3;
    TextView t1,t2,t3;
    ViewPager vp;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 数据源,存放4个碎片对象
        data.add(new HomeFragment());
        data.add(new PublishFragment());
        data.add(new UserFragment());

        t1 = ((TextView) findViewById(R.id.text_home));
        t2 = ((TextView) findViewById(R.id.text_fabu));
        t3 = ((TextView) findViewById(R.id.text_wode));
        img1=(ImageView)findViewById(R.id.img_home);
        img2=(ImageView)findViewById(R.id.img_fabu);
        img3=(ImageView)findViewById(R.id.img_wode);
        //将首页的字体颜色变为选中后颜色

        t1.setTextColor(Color.parseColor("#44AE67"));
        img1.setImageResource(R.mipmap.home_press);

        vp=(ViewPager)findViewById(R.id.viewpager);

        vp.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            public int getItemPosition(Object object) {
                // TODO Auto-generated method stub
                return POSITION_NONE;
            }
            public int getCount() {
                return data.size();
            }
            @Override
            public Fragment getItem(int arg0) {
                // TODO Auto-generated method stub
                return (Fragment) data.get(arg0);
            }
        });
        // 为选项卡添加事件改变颜色   然后做点击的时候的事件自动  显示对应的碎片
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageSelected(int arg0) {
                t1.setTextColor(Color.parseColor("#000000"));
                t2.setTextColor(Color.parseColor("#000000"));
                t3.setTextColor(Color.parseColor("#000000"));

                img1.setImageResource(R.mipmap.home);
                img2.setImageResource(R.mipmap.publish);
                img3.setImageResource(R.mipmap.wode);

                switch(arg0){
                    case 0:
                            t1.setTextColor(Color.parseColor("#44AE67"));
                            img1.setImageResource(R.mipmap.home_press);
                        break;
                    case 1:
                          t2.setTextColor(Color.parseColor("#44AE67"));
                          img2.setImageResource(R.mipmap.publish_press);
                        break;
                    case 2:
                            t3.setTextColor(Color.parseColor("#44AE67"));
                           img3.setImageResource(R.mipmap.wode_press);
                        break;

                }
            }
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View v) {
                int index = Integer.parseInt(v.getTag().toString());
                flag=index;
                vp.setCurrentItem(index);
            }
        };

        layout1=(LinearLayout)findViewById(R.id.shouye);
        layout2=(LinearLayout)findViewById(R.id.fabu);
        layout3=(LinearLayout)findViewById(R.id.wode);

        layout1.setTag("0");
        layout2.setTag("1");
        layout3.setTag("2");

        layout1.setOnClickListener(listener);
        layout2.setOnClickListener(listener);
        layout3.setOnClickListener(listener);

    }

}
