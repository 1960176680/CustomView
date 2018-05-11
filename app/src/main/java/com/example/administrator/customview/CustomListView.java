package com.example.administrator.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class CustomListView extends ListView implements View.OnTouchListener,
        GestureDetector.OnGestureListener{
    // 手势动作探测器
    private GestureDetector mGestureDetector;
    // 删除事件监听器
    public interface OnDeleteListener {
        void onDelete(int index);
    }
    private OnDeleteListener mOnDeleteListener;
    // 删除按钮
    private View mDeleteBtn;
    // 列表项布局
    private ViewGroup mItemLayout;
    // 选择的列表项
    private int mSelectedItem;

    // 当前删除按钮是否显示出来了
    private boolean isDeleteShown;









    public CustomListView(Context context) {
        super(context);
    }

    public CustomListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // 创建手势监听器对象
        mGestureDetector = new GestureDetector(getContext(), this);





    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
