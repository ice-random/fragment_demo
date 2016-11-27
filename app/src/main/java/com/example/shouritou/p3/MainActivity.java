package com.example.shouritou.p3;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    
    private ImageButton btn_1;
    private ImageButton btn_2;
    private ImageButton btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        init();

    }

    private void init() {
        btn_1= (ImageButton) findViewById(R.id.imabtn_1);
        btn_2= (ImageButton) findViewById(R.id.imabtn_2);
        btn_3= (ImageButton) findViewById(R.id.imabtn_3);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imabtn_1:
                main1 fragment1=new main1();
                FragmentManager mainmanager1=getFragmentManager();
                FragmentTransaction transaction1= mainmanager1.beginTransaction();
                transaction1.replace(R.id.mainlayout,fragment1);
//                transaction1.addToBackStack(null);
                transaction1.commit();
                break;
            case R.id.imabtn_2:
                main2 fragment2=new main2();
                FragmentManager mainmanager2=getFragmentManager();
                FragmentTransaction transaction2= mainmanager2.beginTransaction();
                transaction2.replace(R.id.mainlayout,fragment2);
//                transaction2.addToBackStack(null);
                transaction2.commit();
                break;
            case R.id.imabtn_3:
                main3 fragment3=new main3();
                FragmentManager mainmanager3=getFragmentManager();
                FragmentTransaction transaction3= mainmanager3.beginTransaction();
                transaction3.replace(R.id.mainlayout,fragment3);
//                transaction3.addToBackStack(null);
                transaction3.commit();
                break;
        }
    }
}
