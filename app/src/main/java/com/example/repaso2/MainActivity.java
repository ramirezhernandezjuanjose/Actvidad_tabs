package com.example.repaso2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.example.repaso2.controlador.Pagercontroller;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
TabLayout taplayaut;
ViewPager viewpager;
TabItem tab1,tab2;
Pagercontroller pagercontroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       taplayaut =findViewById(R.id.tablayaut);
       viewpager=findViewById(R.id.viewpager);
       tab1=findViewById(R.id.registrar);
       tab2=findViewById(R.id.entrar);

       pagercontroller=new Pagercontroller(getSupportFragmentManager(), taplayaut.getTabCount());
       viewpager.setAdapter(pagercontroller);
       taplayaut.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               viewpager.setCurrentItem(tab.getPosition());
               if (tab.getPosition() == 0) {
               pagercontroller.notifyDataSetChanged();
               }if (tab.getPosition() == 1) {
                   pagercontroller.notifyDataSetChanged();
               }
           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });
      viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(taplayaut));
    }
}
