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
  private GradientDrawable drawable;


  public static DrawableMaker create() {
    return new DrawableMaker(new GradientDrawable());
  }

  public static DrawableMaker from(GradientDrawable gradientDrawable) {
    return new DrawableMaker(gradientDrawable);
  }

  public static DrawableMaker oval() {
    return new DrawableMaker(new GradientDrawable()).shape(OVAL);
  }

  public static DrawableMaker rectangle() {
    return new DrawableMaker(new GradientDrawable()).shape(RECT);
  }

  public DrawableMaker shape(int shape) {
    drawable.setShape(shape);
    return this;
  }

  public DrawableMaker cornerRadius(float roundedRadius) {
    drawable.setCornerRadii(new float[]{roundedRadius, roundedRadius, roundedRadius,
            roundedRadius, roundedRadius, roundedRadius, roundedRadius, roundedRadius});
    return this;
  }


  public DrawableMaker color(int color) {
    drawable.setColor(color);
    return this;
  }

  public DrawableMaker gradients(int start, int center, int end) {
    drawable.setColors(new int[]{start, center, end});
    return this;
  }

  public DrawableMaker gradients(int start, int end) {
    drawable.setColors(new int[]{start, end});
    return this;
  }

  public DrawableMaker gradientAngle(GradientDrawable.Orientation orientation) {
    drawable.setOrientation(orientation);
    return this;
  }

  public DrawableMaker border(int width, int color) {
    drawable.setStroke(width, color);
    return this;
  }

  public Drawable build() {
    return drawable;
  }
}
