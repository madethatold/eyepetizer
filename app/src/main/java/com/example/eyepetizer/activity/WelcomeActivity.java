package com.example.eyepetizer.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eyepetizer.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {

    private ActivityWelcomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        AnimationSet animationSet = new AnimationSet(true);
//        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
//        alphaAnimation.setDuration(1500);
//        animationSet.addAnimation(alphaAnimation);
//        binding.ivBg.startAnimation(animationSet);

        ObjectAnimator animator1 = ObjectAnimator.ofFloat(binding.ivBg0, "alpha", 1.0f, 0f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(binding.ivBg1, "alpha", 0f, 1.0f);
        ObjectAnimator animatorScale1 = ObjectAnimator.ofFloat(binding.ivBg0, "scaleX", 1.0f, 1.3f);
        ObjectAnimator animatorScale2 = ObjectAnimator.ofFloat(binding.ivBg0, "scaleY", 1.0f, 1.3f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(3000);
        animatorSet.play(animator1).with(animator2).with(animatorScale1).with(animatorScale2);
        animatorSet.start();
    }

}
