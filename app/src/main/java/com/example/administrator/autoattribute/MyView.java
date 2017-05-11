package com.example.administrator.autoattribute;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/5/11.
 */

public class MyView extends View{
    String name;
    int age;
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        for(int i=0;i<attrs.getAttributeCount();i++){
            attrs.getAttributeName(i);
            System.out.println(attrs.getAttributeName(i)+"---"+attrs.getAttributeValue(i));
        }

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        name=ta.getString(R.styleable.MyView_name);
        age=ta.getInt(R.styleable.MyView_age,0);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint=new Paint();
        paint.setTextSize(40);
        paint.setColor(Color.RED);
        canvas.drawText(name+age+"",40,40,paint);
    }
}
