package com.example.administrator.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TitleView titleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
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
