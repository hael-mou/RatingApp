package com.elmoudden.ratingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RatingBar ratingBar;
    private TextView textStars;
    private String Value;
    private Button button;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ratingBar = findViewById(R.id.Stars);
         imageView = findViewById(R.id.heroImage);
         textStars = findViewById(R.id.starsText);
         layout = findViewById(R.id.layout_thanks);
         button = findViewById(R.id.button);
         imageView.setImageResource(R.drawable.hero1);

         RatingStars();
    }

    public void RatingStars(){
        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            Value = "" + (int)ratingBar.getRating();
            switch (Value) {
                case "1":
                    imageView.setImageResource(R.drawable.hero2);
                    textStars.setText(R.string.Poor);
                    break;
                case "2":
                    imageView.setImageResource(R.drawable.hero3);
                    textStars.setText(R.string.Fair);
                    break;
                case "3":
                    imageView.setImageResource(R.drawable.hero1);
                    textStars.setText(R.string.good);
                    break;
                case "4":
                    imageView.setImageResource(R.drawable.hero5);
                    textStars.setText(R.string.Very_Good);
                    break;
                case "5":
                    imageView.setImageResource(R.drawable.hero6);
                    textStars.setText(R.string.Excellent);
                    break;
                default:
                    imageView.setImageResource(R.drawable.hero4);
                    textStars.setText(R.string.pff);
                    break;
            }
        });
    }

    public void clicker(View view) {
         layout.setVisibility(View.VISIBLE);
         button.setEnabled(false);
         ratingBar.setIsIndicator(true);
    }
}