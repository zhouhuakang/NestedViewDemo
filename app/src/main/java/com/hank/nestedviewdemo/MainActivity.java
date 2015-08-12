package com.hank.nestedviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mListViewInScrollView;
    private Button mExpandableListviewInScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initView();
        setListener();
    }

    private void findView() {
        mListViewInScrollView = (Button) findViewById(R.id.btn_ListViewInScrollViewDemo);
        mExpandableListviewInScrollView = (Button) findViewById(R.id.btn_ExpandableListviewInScrollView);
    }

    private void initView() {
    }

    private void setListener() {
        mListViewInScrollView.setOnClickListener(this);
        mExpandableListviewInScrollView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ListViewInScrollViewDemo:
                startActivity(new Intent(MainActivity.this, ListViewInScrollViewDemo.class));
                break;
            case R.id.btn_ExpandableListviewInScrollView:
                startActivity(new Intent(MainActivity.this, ExpandableListInScrollViewDemo.class));
                break;
        }
    }
}
