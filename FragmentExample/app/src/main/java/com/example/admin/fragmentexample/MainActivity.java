package com.example.admin.fragmentexample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admin.fragmentexample.fragments.FragmentOne;
import com.example.admin.fragmentexample.fragments.FragmentTwo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mFragmentOneButton;
    private Button mFragmentTwoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentOneButton = (Button) findViewById(R.id.frgamentOneButton);
        mFragmentTwoButton = (Button) findViewById(R.id.fragmentTwoButton);


        mFragmentOneButton.setOnClickListener(this);
        mFragmentTwoButton.setOnClickListener(this);

        onClick(mFragmentOneButton);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.frgamentOneButton:
                transaction.replace(R.id.container,new FragmentOne(),"fragmentone").commit();
                break;
            case R.id.fragmentTwoButton:
                transaction.replace(R.id.container,new FragmentTwo(),"fragmentone").commit();
                break;
        }

    }
}
