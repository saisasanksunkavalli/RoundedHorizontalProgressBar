package com.sasank.example.roundedhorizontalprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sasank.roundedhorizontalprogress.RoundedHorizontalProgressBar;

public class MainActivity extends AppCompatActivity {

    private RoundedHorizontalProgressBar mRoundedHorizontalProgressBar1;
    private RoundedHorizontalProgressBar mRoundedHorizontalProgressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoundedHorizontalProgressBar1 = (RoundedHorizontalProgressBar) findViewById(R.id.progress_bar_1);
        mRoundedHorizontalProgressBar2 = (RoundedHorizontalProgressBar) findViewById(R.id.progress_bar_2);

        mRoundedHorizontalProgressBar1.animateProgress(2000, 0, 80);

        mRoundedHorizontalProgressBar2.setProgressColors(getResources().getColor(R.color.blue_light), getResources().getColor(R.color.blue));
        mRoundedHorizontalProgressBar2.animateProgress(1000, 0, 60);
    }
}
