package com.example.administrator.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TitleView titleView;
    // 自定义Lv
      private CustomListView mCustomLv;
      // 自定义适配器
              private CustomListViewAdapter mAdapter;
      // 内容列表
              private List<String> contentList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initContentList();

        mCustomLv = (CustomListView) findViewById(R.id.custom_lv);
        mCustomLv.setOnDeleteListener(new CustomListView.OnDeleteListener() {

            @Override
            public void onDelete(int index) {
                contentList.remove(index);
                mAdapter.notifyDataSetChanged();
            }
        });

        mAdapter = new CustomListViewAdapter(this, 0, contentList);
        mCustomLv.setAdapter(mAdapter);
    }
    // 初始化内容列表
    private void initContentList() {
        for (int i = 0; i < 20; i++) {
            contentList.add("内容项" + i);
        }
    }
    public void initView() {
        titleView= (TitleView) findViewById(R.id.title_bar);
        titleView.setLeftButtonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleView.setTitleText("app标题"+Math.random()*100);
                Toast.makeText(MainActivity.this,"测试啦",Toast.LENGTH_SHORT).show();
            }
        });
        titleView.setTitleText("app标题"+Math.random()*100);


    }
}
