package com.example.style.lovefamily.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lenove on 2016/8/9.
 */
public class ViewPagerAdapter extends PagerAdapter{

    //界面列表
    private List<View> views;
    private Context context;

    public ViewPagerAdapter(List<View> views, Context context) {
        this.views = views;
        this.context = context;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }
    //加载viewpager的每个item
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View  v= views.get(position);
        container.addView(v);
        return v;
    }
    // 获得当前界面数
    @Override
    public int getCount() {
        if (views != null) {
            return views.size();
        }
        return 0;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
