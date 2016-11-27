package com.example.shouritou.p3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by shouritou on 16/11/26.
 */
public class main1 extends Fragment{
    private Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout1,container,false);
        button= (Button) view.findViewById(R.id.button);
        return view;
    }

}
