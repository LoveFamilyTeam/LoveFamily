package com.example.style.coremodule.entity.http;

import com.example.style.coremodule.entity.entity.Constant;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

/**
 * Created by lenove on 2016/8/9.
 */
public class HttpUtil {
    //单例模式
    private  AsyncHttpClient client;

    private  static  HttpUtil instance;
    private  HttpUtil () {
        client=new AsyncHttpClient();
    }

    public static HttpUtil getInstance(){
        if(instance==null){
            instance=new HttpUtil();
        }
        return instance;
    }
    //获取城市名
    public void getCityName( JsonHttpResponseHandler handler){
        String url= Constant.HTTP_CITYNAME;
        client.get(url,handler);
    }

    //这里是获取首页 爱家乡  gridview点击之后  跳转界面获取的数据
    public void getCategoryData( JsonHttpResponseHandler handler){
        String url= Constant.HTTP_CATEGORY;
        client.get(url,handler);
    }



}
