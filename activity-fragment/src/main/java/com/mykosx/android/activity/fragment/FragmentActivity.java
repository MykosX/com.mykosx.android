package com.mykosx.android.activity.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mykosx.android.activity.fragment.ui.main.Fragment;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment.newInstance())
                    .commitNow();
        }
    }
}