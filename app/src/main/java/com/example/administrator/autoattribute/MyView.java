package com.example.administrator.autoattribute;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/5/11.
 */

public class MyView extends View{
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        for(int i=0;i<attrs.getAttributeCount();i++){
            attrs.getAttributeName(i);
            System.out.println(attrs.getAttributeName(i)+"---"+attrs.getAttributeValue(i));
        }
    }
}
