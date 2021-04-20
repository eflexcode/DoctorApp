package com.larrex.doctorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.larrex.doctorapp.adapter.DoctorAdapter;
import com.larrex.doctorapp.fragment.DoctorFragment1;
import com.larrex.doctorapp.fragment.DoctorFragment2;
import com.larrex.doctorapp.fragment.DoctorFragment3;
import com.larrex.doctorapp.fragment.DoctorFragment4;
import com.larrex.doctorapp.fragment.DoctorFragment5;
import com.rd.PageIndicatorView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager;
        PageIndicatorView pageIndicatorView;

        viewPager = findViewById(R.id.viewPager);
        pageIndicatorView = findViewById(R.id.pageIndicatorView);

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new DoctorFragment1());
        fragments.add(new DoctorFragment2());
        fragments.add(new DoctorFragment3());
        fragments.add(new DoctorFragment4());
        fragments.add(new DoctorFragment5());

        DoctorAdapter doctorAdapter = new DoctorAdapter(getSupportFragmentManager(),fragments);

        viewPager.setAdapter(doctorAdapter);

    }
}