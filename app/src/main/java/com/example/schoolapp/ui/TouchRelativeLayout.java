package com.example.schoolapp.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class TouchRelativeLayout extends RelativeLayout {

    public TouchRelativeLayout(Context context) {
        super(context);
    }

    public TouchRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    float mDownX,mDownY,mMoveX,mMoveY;

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                getParent().requestDisallowInterceptTouchEvent(true);
//                 mDownX = ev.getX();
//                 mDownY = ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:
//                mMoveX = ev.getX();
//                mMoveY = ev.getY();
//                if(Math.abs(mMoveX-mDownX)>Math.abs(mMoveY-mDownY)){
                    getParent().requestDisallowInterceptTouchEvent(true);
//                }else{
//                    getParent().requestDisallowInterceptTouchEvent(false);
//                }
                break;
            case MotionEvent.ACTION_UP:
                getParent().requestDisallowInterceptTouchEvent(false);
                break;


        }
        return super.dispatchTouchEvent(ev);
    }
}
