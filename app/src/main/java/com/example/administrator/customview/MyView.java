package com.example.administrator.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016-12-05.
 */

public class MyView extends View {
    private boolean mShowText;
    private Paint mPaint;
    private Context mContext;
    private static final String mString = "Welcome to Mr Zhou's blog";

    public MyView(Context context) {
        super(context);
        mPaint = new Paint();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();

        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.MyView);

//        int textColor = a.getColor(R.styleable.MyView_textColor,
//                0XFFFFFFFF);
//        float textSize = a.getDimension(R.styleable.MyView_textSize, 36);
//        mPaint.setTextSize(textSize);
//        mPaint.setColor(textColor);
        a.recycle();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//设置填充
        mPaint.setStyle(Paint.Style.FILL);

        //画一个矩形,前俩个是矩形左上角坐标，后面俩个是右下角坐标
        canvas.drawRect(new Rect(10, 10, 100, 100), mPaint);

        mPaint.setColor(Color.BLUE);
        //绘制文字
        canvas.drawText(mString, 10, 110, mPaint);




    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        // Account for padding
        float xpad = (float)(getPaddingLeft() + getPaddingRight());
        float ypad = (float)(getPaddingTop() + getPaddingBottom());

        // Account for the label   mTextWidth
        if (mShowText) xpad += 2;

        float ww = (float)w - xpad;
        float hh = (float)h - ypad;

        // Figure out how big we can make the pie.
        float diameter = Math.min(ww, hh);
    }

//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        // Try for a width based on our minimum
//        int minw = getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth();
//        int w = resolveSizeAndState(minw, widthMeasureSpec, 1);
//
//        // Whatever the width ends up being, ask for a height that would let the pie
//        // get as big as it can
////        int minh = MeasureSpec.getSize(w) - (int)mTextWidth + getPaddingBottom() + getPaddingTop();
////        int h = resolveSizeAndState(MeasureSpec.getSize(w) - (int)mTextWidth, heightMeasureSpec, 0);
//
//        setMeasuredDimension(w, h);
//
//    }

    public boolean isShowText() {
        return mShowText;
    }

    public void setShowText(boolean showText) {
        mShowText = showText;
        invalidate();
        requestLayout();
    }
}
