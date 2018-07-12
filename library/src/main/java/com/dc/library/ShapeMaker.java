package com.dc.library;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/**
 * Created by HB on 12/7/18.
 */
public class ShapeMaker {


    public static final int RECT = GradientDrawable.RECTANGLE;
    public static final int OVAL = GradientDrawable.OVAL;
    public static final int LINE = GradientDrawable.LINE;
    public static final int RING = GradientDrawable.RING;

    public static final int BORDER = 8;
    public static final int FILL = 10;


    private int shape;
    private float roundedRadius;
    private int color;
    private int fillType;
    private float strokeWidth;

    public static ShapeMaker create() {
        return new ShapeMaker();
    }

    public ShapeMaker shape(int shape) {
        this.shape = shape;
        return this;
    }

    public ShapeMaker radius(float roundedRadius) {
        this.roundedRadius = roundedRadius;
        return this;
    }

    public ShapeMaker color(int color) {
        this.color = color;
        return this;
    }

    public ShapeMaker fillType(int fillType) {
        this.fillType = fillType;
        return this;
    }

    public ShapeMaker strokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }


    public Drawable build() {
        GradientDrawable drawable = new GradientDrawable();

        drawable.setShape(shape);
        if (fillType == BORDER) {
            drawable.setStroke((int) strokeWidth, color);
        } else {
            drawable.setColor(color);
        }
        drawable.setCornerRadii(new float[]{roundedRadius, roundedRadius, roundedRadius, roundedRadius, roundedRadius, roundedRadius, roundedRadius, roundedRadius});
        return drawable;
    }
}
