package com.dc.library;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/**
 * Created by HB on 12/7/18.
 */
public class DrawableMaker {


  private DrawableMaker(GradientDrawable drawable) {
    this.drawable = drawable;
  }

  public static final int RECT = GradientDrawable.RECTANGLE;
  public static final int OVAL = GradientDrawable.OVAL;
  public static final int LINE = GradientDrawable.LINE;
  public static final int RING = GradientDrawable.RING;


  private int shape;
  private float roundedRadius;
  private int color;
  private int strokeWidth;
  private int strokeColor;
  private GradientDrawable drawable;

  public static DrawableMaker create() {
    return new DrawableMaker(new GradientDrawable());
  }

  public static DrawableMaker from(GradientDrawable gradientDrawable) {
    return new DrawableMaker(gradientDrawable);
  }

  public static DrawableMaker oval(){
    return new DrawableMaker(new GradientDrawable()).shape(OVAL);
  }

  public static DrawableMaker rectangle(){
    return new DrawableMaker(new GradientDrawable()).shape(RECT);
  }

  public DrawableMaker shape(int shape) {
    this.shape = shape;
    return this;
  }

  public DrawableMaker cornerRadius(float roundedRadius) {
    this.roundedRadius = roundedRadius;
    return this;
  }

  public DrawableMaker color(int color) {
    this.color = color;
    return this;
  }

  public DrawableMaker border(int width, int color) {
    this.strokeWidth = width;
    this.strokeColor = color;
    return this;
  }

  public Drawable build() {
    drawable.setShape(shape);
    drawable.setColor(color);
    drawable.setStroke(strokeWidth, strokeColor);
    drawable.setCornerRadii(new float[]{roundedRadius, roundedRadius, roundedRadius,
            roundedRadius, roundedRadius, roundedRadius, roundedRadius, roundedRadius});
    return drawable;
  }
}
