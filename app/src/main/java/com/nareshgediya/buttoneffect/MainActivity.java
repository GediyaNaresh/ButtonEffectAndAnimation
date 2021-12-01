package com.nareshgediya.buttoneffect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  buttonAnimation = findViewById(R.id.butttonAnimation);
        buttonAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ButttonAnimation.class);
                startActivity(intent);
            }
        });

    }
    public void fadding(View view) {
        Button btn = (Button)findViewById(R.id.btn_fade);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fade);
        btn.startAnimation(animation);

    }

    public void blink(View view) {
        Button btn = (Button)findViewById(R.id.btn_blink);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
        btn.startAnimation(animation);
    }

    public void slide(View view) {
        Button btn = (Button)findViewById(R.id.btn_slide);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        btn.startAnimation(animation);

    }

    public void move(View view) {
        Button btn = (Button)findViewById(R.id.btn_move);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.move);
        btn.startAnimation(animation);
    }



}
