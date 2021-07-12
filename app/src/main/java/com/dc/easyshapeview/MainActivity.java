package com.dc.easyshapeview;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dc.easyshapeview.databinding.ActivityMainBinding;
import com.dc.library.DrawableMaker;
import com.dc.library.DrawableBindingUtils;

public class MainActivity extends AppCompatActivity {


  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
/*
        DrawableBindingUtils.background(binding.tvMain,
                DrawableMaker.create().shape(DrawableMaker.RECT).cornerRadius(15).color(Color.RED).build(),
                DrawableMaker.create().shape(DrawableMaker.RECT).cornerRadius(15).color(Color.GREEN).build(),
                DrawableMaker.create().shape(DrawableMaker.RECT).color(Color.BLACK).build(),null);*/

    /*DrawableBindingUtils.textColor(binding.tvMain, Color.RED, Color.WHITE, Color.GREEN);*/

    binding.tvMain.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });


    binding.tvMain2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });

    binding.ivMain.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        binding.ivMain.setSelected(!binding.ivMain.isSelected());
      }
    });

    DrawableBindingUtils.background(binding.viewFromDrawable,
            DrawableMaker.from((GradientDrawable) ContextCompat.getDrawable(this, R.drawable.oval)).shape(DrawableMaker.OVAL).color(Color.RED).build());

  }
}
