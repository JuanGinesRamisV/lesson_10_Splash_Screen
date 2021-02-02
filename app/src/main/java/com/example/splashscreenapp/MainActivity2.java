package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.ExtractedTextRequest;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView number1;
    private TextView number2;
    private TextView number3;
    private TextView number4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initializeViews();
        initializeAnimation();
    }

    private void initializeViews(){
        this.number1 = (TextView) findViewById(R.id.first_number);
        this.number2 = (TextView) findViewById(R.id.second_number);
        this.number3 = (TextView) findViewById(R.id.thrid_number);
        this.number4 = (TextView) findViewById(R.id.number4);
    }

    private void initializeAnimation(){
        Animation down = AnimationUtils.loadAnimation(this,R.anim.down);
        Animation spin = AnimationUtils.loadAnimation(this,R.anim.spin);

        this.number1.startAnimation(spin);
        this.number2.startAnimation(down);
        this.number3.startAnimation(down);
        this.number4.startAnimation(spin);
    }
}