package com.dc.easyshapeview;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dc.easyshapeview.databinding.ActivityMainBinding;
import com.dc.library.ShapeMaker;
import com.dc.library.ViewBindingUtils;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ViewBindingUtils.background(binding.tvMain,
                ShapeMaker.create().shape(ShapeMaker.RECT).fillType(ShapeMaker.BORDER).strokeWidth(5).radius(15).color(Color.RED).build(),
                ShapeMaker.create().shape(ShapeMaker.RECT).fillType(ShapeMaker.FILL).radius(15).color(Color.GREEN).build(),
                ShapeMaker.create().shape(ShapeMaker.RECT).color(Color.BLACK).build());

        ViewBindingUtils.textColor(binding.tvMain, Color.RED, Color.WHITE, Color.GREEN);

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

    }
}
