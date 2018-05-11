package com.example.administrator.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CounterView extends View implements View.OnClickListener{
    Paint paint;
    private Paint mPaint;
    private Rect mBounds;
    private int mCount;

    public CounterView(Context context) {
        super(context);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint=new Paint();
        mBounds = new Rect();
        setOnClickListener(this);
    }

    public CounterView(Context context, @Nullable AttributeSet attrs) {
        this(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, getWidth(), getHeight(), mPaint);
        mPaint.setColor(Color.RED);
        mPaint.setTextSize(50);
        String text = String.valueOf(mCount);
// 获取文字的宽和高
        mPaint.getTextBounds(text, 0, text.length(), mBounds);
        float textWidth = mBounds.width();
        float textHeight = mBounds.height();
        canvas.drawText(text, getWidth() / 2 - textWidth / 2, getHeight() / 2
                + textHeight / 2, mPaint);


//        paint.setStrokeWidth(3);
//        canvas.drawLine(100,100,100,750,paint);
//        for (int i=0;i<5;i++){
//            paint.setColor(Color.RED);
//            canvas.drawCircle(100,100+150*i,60,paint);
//            paint.setColor(Color.BLACK);
//            paint.setTextSize(60);
//            canvas.drawText("周",72,130+150*i,paint);
//        }


    }

//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//    }

    @Override
    public void onClick(View v) {

    }
}
