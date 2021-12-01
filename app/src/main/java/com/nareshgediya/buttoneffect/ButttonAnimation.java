package com.nareshgediya.buttoneffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class ButttonAnimation extends AppCompatActivity {
    LottieAnimationView lottieAnimationView1, lottieAnimationView2,lottieAnimationView3,lottieAnimationView4,lottieAnimationView5,lottieAnimationView6;
    boolean switchOn = false;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttton_animation);

        lottieAnimationView1 = findViewById(R.id.likeButton);
        lottieAnimationView2 = findViewById(R.id.plusButton);
        lottieAnimationView3 = findViewById(R.id.playButton);
        lottieAnimationView4 = findViewById(R.id.processing_btn);
        lottieAnimationView5 = findViewById(R.id.dot_button);
        lottieAnimationView6 = findViewById(R.id.switchButton);

        button2 = findViewById(R.id.button2);

       button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchOn){
                    lottieAnimationView1.playAnimation();
                    lottieAnimationView2.playAnimation();

                    lottieAnimationView4.playAnimation();
                    switchOn = false;
                }else {
                    lottieAnimationView1.playAnimation();
                    lottieAnimationView2.playAnimation();
                    lottieAnimationView4.playAnimation();
                    switchOn = true;
                }

            }
        });

       lottieAnimationView6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (switchOn){
                   lottieAnimationView6.setMinAndMaxProgress(0.5f,1.0f);
                   lottieAnimationView6.playAnimation();
                   switchOn = false;
               }
               else {
                   lottieAnimationView6.setMinAndMaxProgress(0.0f,0.5f);
                   lottieAnimationView6.playAnimation();
                   switchOn = true;
               }
           }
       });
          lottieAnimationView5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (switchOn){

                   lottieAnimationView5.playAnimation();
                   switchOn = false;
               }
               else {

                   lottieAnimationView5.playAnimation();
                   switchOn = true;
               }
           }
       });

        lottieAnimationView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchOn){
                    lottieAnimationView6.setMinAndMaxProgress(0.5f,1.0f);
                    lottieAnimationView3.playAnimation();
                    switchOn = false;
                }
                else {
                    lottieAnimationView6.setMinAndMaxProgress(0.0f,0.5f);
                    lottieAnimationView3.playAnimation();
                    switchOn = true;
                }
            }
        });



    }
}