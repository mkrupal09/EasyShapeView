# EasyShapeView

<img alt="Easy Shape View Library" src="https://github.com/mkrupal09/EasyShapeView/blob/master/ss1.png" width = "500" height = "900" hspace="5"/>

```xml
<?xml version="1.0" encoding="utf-8"?>
 <layout xmlns:android="http://schemas.android.com/apk/res/android"
     xmlns:bind="http://schemas.android.com/tools">
 
     <data>
 
         <import type="com.dc.library.DrawableMaker" />
 
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
 
 
             <View
                 android:id="@+id/tvv"
                 android:layout_width="80dp"
                 android:layout_height="80dp"
                 android:gravity="center"
                 bind:disableBackground="@{DrawableMaker.create().shape(DrawableMaker.OVAL).color(Color.BLACK).build()}"
                 bind:normalBackground="@{DrawableMaker.create().shape(DrawableMaker.RECT).color(@color/colorPrimary).build()}"
                 bind:pressedBackground="@{DrawableMaker.create().shape(DrawableMaker.OVAL).color(Color.GREEN).build()}" />
 
             <TextView
                 android:id="@+id/tvMain"
                 android:layout_width="match_parent"
                 android:layout_height="wrap_content"
                 android:layout_marginTop="10dp"
                 android:gravity="center"
                 android:padding="10dp"
                 android:text="@string/click_me"
                 bind:disableBackground="@{DrawableMaker.create().shape(DrawableMaker.RECT).color(Color.BLACK).build()}"
                 bind:disableTextColor="@{Color.BLACK}"
                 bind:normalBackground="@{DrawableMaker.create().shape(DrawableMaker.RECT).color(Color.RED).border(5,@color/colorPrimary).build()}"
                 bind:normalTextColor="@{Color.WHITE}"
                 bind:pressedBackground="@{DrawableMaker.create().shape(DrawableMaker.RECT).cornerRadius(@dimen/space_med).color(Color.GREEN).build()}"
                 bind:pressedTextColor="@{@color/colorPrimary}" />
 
 
             <TextView
                 android:id="@+id/tvMain2"
                 android:layout_width="match_parent"
                 android:layout_height="wrap_content"
                 android:layout_marginTop="10dp"
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
                 android:layout_height="30dp" />
 
             <EditText
                 android:layout_width="match_parent"
                 android:layout_height="wrap_content"
                 android:hint="@string/app_name" />
 
             <android.support.v7.widget.AppCompatEditText
                 android:layout_width="match_parent"
                 android:layout_height="wrap_content"
                 android:hint="@string/app_name"
                 bind:focusedBackground="@{DrawableMaker.rectangle().cornerRadius(@dimen/space_med).color(Color.GREEN).build()}"
                 bind:focusedHintTextColor="@{Color.WHITE}"
                 bind:focusedTextColor="@{Color.WHITE}"
                 bind:normalBackground="@{DrawableMaker.rectangle().color(Color.RED).border(5,@color/colorPrimary).build()}"
                 bind:normalHintTextColor="@{Color.BLACK}"
                 bind:normalTextColor="@{Color.BLACK}" />
 
         </LinearLayout>
     </ScrollView>
 </layout>
```