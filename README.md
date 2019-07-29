# EasyShapeView



<img alt="Easy Shape View Library" src="https://github.com/mkrupal09/EasyShapeView/blob/master/ss1.png" width = "500" height = "900" hspace="5"/>

Description

- You can directly set disable,normal,pressed background to any view.
- You can directly set disable,enable,pressed,focused,normal text/hint color to textview
- You can directly set check,uncheck drawable to checkbox,radiobutton
- You can set disable,normal,pressed,focused background using DrawableMaker.
- You can use already created shape drawable and change attributes/properties 
  i.e if you already have oval/rect shape you can change color,radius,border etc..
  so make one drawable and use everywhere

Drawable maker properties - make oval,rect shape directly using DrawableMaker.oval()/rectangle()
all below things using xml
- You can give shape color
- You can give border color, border width
- You can give gradient color, gradient orietation
- You can give corner radius


Pros
- No need to create drawable files just for color change, border change, and many small changes
 so you don't have list of same drawables
- Less boilerplate code

Cons
- You can't see preview of creating drawables because it's rely on BindingAdapter (Data Binding)



```xml
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:bind="http://schemas.android.com/tools">

    <data>

        <import type="com.dc.library.DrawableMaker" />

        <import type="android.graphics.drawable.GradientDrawable.Orientation" />

        <import type="android.graphics.drawable.GradientDrawable" />

        <import type="android.graphics.Color" />
    </data>

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center_horizontal"
            android:orientation="vertical"
            android:padding="10dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center"
                android:orientation="horizontal">

                <View
                    android:layout_width="80dp"
                    android:layout_height="80dp"
                    android:layout_margin="10dp"
                    android:gravity="center"
                    bind:disableBackground="@{DrawableMaker.oval().color(Color.BLACK).build()}"
                    bind:normalBackground="@{DrawableMaker.rectangle().color(@color/colorPrimary).build()}"
                    bind:pressedBackground="@{DrawableMaker.oval().color(Color.GREEN).build()}" />

                <View
                    android:layout_width="80dp"
                    android:layout_height="80dp"
                    android:layout_margin="10dp"
                    android:gravity="center"
                    bind:disableBackground="@{DrawableMaker.oval().color(Color.BLACK).build()}"
                    bind:normalBackground="@{DrawableMaker.oval().color(@color/colorAccent).build()}"
                    bind:pressedBackground="@{DrawableMaker.oval().color(Color.GREEN).build()}" />
            </LinearLayout>

            <TextView
                android:id="@+id/tvMain"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:gravity="center"
                android:padding="10dp"
                android:text="@string/click_me"
                bind:disableBackground="@{DrawableMaker.rectangle().color(Color.BLACK).build()}"
                bind:disableTextColor="@{Color.BLACK}"
                bind:normalBackground="@{DrawableMaker.rectangle().border(5,@color/colorPrimary).build()}"
                bind:normalTextColor="@{@color/colorPrimary}"
                bind:pressedBackground="@{DrawableMaker.rectangle().border(5,@color/colorPrimary).color(Color.GREEN).build()}"
                bind:pressedTextColor="@{@color/colorPrimary}" />


            <TextView
                android:id="@+id/tvMain2"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:gravity="center"
                android:text="@string/hello_android"
                android:textColor="@android:color/white"
                bind:disableBackground="@{@drawable/settings_switch_back_on}"
                bind:normalBackground="@{@drawable/settings_switch_back_off}"
                bind:pressedBackground="@{@drawable/settings_switch_back_on}" />


            <ImageView
                android:id="@+id/ivMain"
                android:layout_width="100dp"
                android:layout_height="100dp"
                bind:disableSrc="@{@drawable/basketball_unsel}"
                bind:normalSrc="@{@drawable/basketball_unsel}"
                bind:pressedSrc="@{@drawable/basketball_sel}"
                bind:selectedSrc="@{@drawable/basketball_sel}" />

            <CheckBox
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                bind:check="@{@drawable/img_radiobtn_h}"
                bind:uncheck="@{@drawable/img_radiobtn}" />

            <View
                android:id="@+id/viewFromDrawable"
                android:layout_width="30dp"
                android:layout_height="30dp"
                android:layout_marginTop="20dp"
                android:layout_marginBottom="20dp" />


            <android.support.v7.widget.AppCompatEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="@string/app_name"
                bind:focusedBackground="@{DrawableMaker.rectangle().cornerRadius(@dimen/space_med).color(Color.GREEN).build()}"
                bind:focusedHintTextColor="@{Color.WHITE}"
                bind:focusedTextColor="@{Color.WHITE}"
                bind:normalBackground="@{DrawableMaker.rectangle().color(Color.RED).border(5,@color/colorPrimary).gradients(@color/colorPrimary,@color/colorAccent).gradientAngle(GradientDrawable.Orientation.BOTTOM_TOP).build()}"
                bind:normalHintTextColor="@{Color.WHITE}"
                bind:normalTextColor="@{Color.WHITE}" />

        </LinearLayout>
    </ScrollView>
</layout>
```
