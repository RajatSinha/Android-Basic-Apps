package com.example.user.myviewpager;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int size = 6;
    ViewPager mypager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_1);
        ViewPagerAdapter adapter = new ViewPagerAdapter(MainActivity.this, size);
        mypager = (ViewPager) findViewById(R.id.viewpager);
        mypager.setAdapter(adapter);
        mypager.setCurrentItem(0);
    }
}
   class ViewPagerAdapter extends PagerAdapter
    {
        int noofpages;
        Activity act;
        View layout;
        TextView pagenumber;
        Button click;
        public ViewPagerAdapter( Activity viewPagerSimpleMainActivity, int size) {
            noofpages=size;
            act=viewPagerSimpleMainActivity;
        }
        @Override
        public int getCount() {

            return noofpages;
        }
        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {

            return arg0 == ((View) arg1);
        }
        @Override
        public Object instantiateItem(View container, int position)
        {
            LayoutInflater inflater = (LayoutInflater) act
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = inflater.inflate(R.layout.pages, null);
            pagenumber = (TextView) layout.findViewById(R.id.pagenumber);
            int pagenumberTxt=position + 1;
            pagenumber.setText("Now your in Page No " +pagenumberTxt );
            ((ViewPager) container).addView(layout, 0);
            return layout;
        }

        @Override
        public void destroyItem(View arg0, int arg1, Object arg2) {
            ((ViewPager) arg0).removeView((View) arg2);
        }
    }


