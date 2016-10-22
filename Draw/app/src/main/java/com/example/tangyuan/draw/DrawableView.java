package com.example.tangyuan.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

/**
 * Created by TangYuan on 2016/9/28.
 */
public class DrawableView extends View {
    private ShapeDrawable mDrawable;

    public DrawableView(Context context) {
        super(context);

        int x = 250;
        int y = 500;
        int width = 500;
        int height = 500;

        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(0xff77AA66);
        mDrawable.setBounds(x, y, x + width, y + height);
    }

    protected void onDraw(Canvas canvas) {
        mDrawable.draw(canvas);
    }
}
