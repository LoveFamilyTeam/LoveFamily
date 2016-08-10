package com.example.style.homemoudle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by lenove on 2016/8/9.
 */
public class HomeFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homelayout, null);
        Toast.makeText(getContext(), "home", Toast.LENGTH_SHORT).show();
        return view;
    }
}
