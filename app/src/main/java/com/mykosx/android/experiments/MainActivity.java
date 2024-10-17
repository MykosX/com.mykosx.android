package com.mykosx.android.experiments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mykosx.android.activity.basic.BasicActivity;
import com.mykosx.android.activity.detail.ItemDetailHostActivity;
import com.mykosx.android.activity.empty.EmptyActivity;
import com.mykosx.android.activity.fragment.FragmentActivity;
import com.mykosx.android.activity.fullscreen.FullscreenActivity;
import com.mykosx.android.activity.login.ui.login.LoginActivity;
import com.mykosx.android.activity.navigation.bottom.BottomNavActivity;
import com.mykosx.android.activity.navigation.drawer.NavDrawerActivity;
import com.mykosx.android.activity.response.ResponseActivity;
import com.mykosx.android.activity.scrolling.ScrollingActivity;
import com.mykosx.android.activity.settings.SettingsActivity;
import com.mykosx.android.activity.tabbed.TabbedActivity;
import com.mykosx.android.activity.tv.TVActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTabbedActivity(View view) {
        Intent intent = new Intent(this, TabbedActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onSettingsActivity(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onScrollingActivity(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onResponseActivity(View view) {
        Intent intent = new Intent(this, ResponseActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onItemDetailHostActivity(View view) {
        Intent intent = new Intent(this, ItemDetailHostActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onNavDrawerActivity(View view) {
        Intent intent = new Intent(this, NavDrawerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onFullscreenActivity(View view) {
        Intent intent = new Intent(this, FullscreenActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onFragmentActivity(View view) {
        Intent intent = new Intent(this, FragmentActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onEmptyActivity(View view) {
        Intent intent = new Intent(this, EmptyActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onBottomNavActivity(View view) {
        Intent intent = new Intent(this, BottomNavActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onBasicViewsActivity(View view) {
        Intent intent = new Intent(this, BasicActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    public void onTVActivity(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }
}
