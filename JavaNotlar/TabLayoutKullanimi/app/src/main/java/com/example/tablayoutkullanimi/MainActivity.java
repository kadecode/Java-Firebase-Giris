package com.example.tablayoutkullanimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private TabLayout tablayout;
    private ViewPager2 viewpager2;

    private ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    private ArrayList<String> fragmentBaslikList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout = findViewById(R.id.tablayout);
        viewpager2 = findViewById(R.id.viewpager2);

        fragmentArrayList.add(new FragmentBirinci());
        fragmentArrayList.add(new FragmentIkinci());
        fragmentArrayList.add(new FragmentUcuncu());

        MyViewPagerAdapter adapter = new MyViewPagerAdapter(this);

        viewpager2.setAdapter(adapter);

        fragmentBaslikList.add("Bir");
        fragmentBaslikList.add("İki");
        fragmentBaslikList.add("Üç");

        new TabLayoutMediator(tablayout,viewpager2,
                ((tab, position) -> tab.setText(fragmentBaslikList.get(position)))).attach();

        tablayout.getTabAt(0).setIcon(R.drawable.resim1);
        tablayout.getTabAt(1).setIcon(R.drawable.resim2);
        tablayout.getTabAt(2).setIcon(R.drawable.resim3);


    }

    private class MyViewPagerAdapter extends FragmentStateAdapter{

        public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragmentArrayList.get(position);
        }

        @Override
        public int getItemCount() {
            return fragmentArrayList.size();
        }
    }
}