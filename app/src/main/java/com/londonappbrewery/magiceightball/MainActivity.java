package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ball;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball = findViewById(R.id.image_eightBall);

       final int[] ballArray  = {R.drawable.ball1, R.drawable.ball2,
                            R.drawable.ball3, R.drawable.ball4,
                            R.drawable.ball5};
         myButton = findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8Ball", "The button has been pressed");
                Random randNum = new Random();
                int number = randNum.nextInt(5);

                ball.setImageResource(ballArray[number]);

            }
        });
    }
}
