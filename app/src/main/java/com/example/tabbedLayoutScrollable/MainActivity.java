package com.example.tabbedLayoutScrollable;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar myToolBar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //change styles.xml theme to NoActionBar, create a toolbar in visual mode link it to the code below in onCreate override
        myToolBar = findViewById(R.id.mytoolbar);
        setSupportActionBar(myToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new oneFragment(), "item1");
        adapter.addFragment(new twoFragment(), "item2");
        adapter.addFragment(new threeFragment(), "item3");
        adapter.addFragment(new fourFragment(), "item4");
        adapter.addFragment(new fiveFragment(), "item5");
        adapter.addFragment(new sixFragment(), "item6");
        adapter.addFragment(new sevenFragment(), "item7");
        adapter.addFragment(new eightFragment(), "item8");
        adapter.addFragment(new nineFragment(), "item9");
        adapter.addFragment(new tenFragment(), "item10");
        viewPager.setAdapter(adapter);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

    }
}

