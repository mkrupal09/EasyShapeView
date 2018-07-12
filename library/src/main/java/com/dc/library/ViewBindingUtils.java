package com.dc.library;

import android.content.res.ColorStateList;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HB on 12/7/18.
 */
public class ViewBindingUtils {

    @BindingAdapter(value = {"normal", "pressed", "disable"}, requireAll = false)
    public static void background(View view, Drawable normal, Drawable pressed, Drawable disable) {
        StateListDrawable background = new StateListDrawable();
        if (pressed != null)
            background.addState(new int[]{android.R.attr.state_pressed}, pressed);
        if (disable != null)
            background.addState(new int[]{-android.R.attr.state_enabled}, disable);
        if (normal != null)
            background.addState(StateSet.WILD_CARD, normal);
        view.setBackgroundDrawable(background);
    }

    @BindingAdapter(value = {"normalSrc", "pressedSrc", "disableSrc","selectedSrc"}, requireAll = false)
    public static void imageSource(ImageView view, Drawable normal, Drawable pressed, Drawable disable, Drawable selected) {
        StateListDrawable image = new StateListDrawable();
        if (pressed != null)
            image.addState(new int[]{android.R.attr.state_pressed}, pressed);
        if (disable != null)
            image.addState(new int[]{-android.R.attr.state_enabled}, disable);
        if (normal != null) {
            image.addState(new int[]{-android.R.attr.state_selected}, selected);
        }
        if (normal != null)
            image.addState(StateSet.WILD_CARD, normal);
        view.setImageDrawable(image);
    }


    @BindingAdapter(value = {"normalTextColor", "pressedTextColor", "disableTextColor"}, requireAll = false)
    public static void textColor(TextView textView, int normal, int pressed, int disable) {
        int[][] states = new int[][]{
                new int[]{android.R.attr.state_pressed}, // disabled
                new int[]{-android.R.attr.state_enabled},  // pressed
                StateSet.WILD_CARD
        };

        int[] colors = new int[]{
                pressed, disable, normal
        };
        ColorStateList textColor = new ColorStateList(states, colors);
        textView.setTextColor(textColor);
    }

    @BindingAdapter(value = {"check", "uncheck"})
    public static void checkUncheck(CompoundButton view, Drawable check, Drawable uncheck) {
        StateListDrawable checkUncheckDrawable = new StateListDrawable();
        checkUncheckDrawable.addState(new int[]{android.R.attr.state_checked}, check);
        checkUncheckDrawable.addState(new int[]{-android.R.attr.state_checked}, uncheck);
        view.setButtonDrawable(checkUncheckDrawable);
    }
}
