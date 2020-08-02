package com.neat.cattle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.os.StrictMode;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);

        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
        // Create a ConstraintLayout in which to add the ImageView
        constraintLayout = new ConstraintLayout(this);

        // Instantiate an ImageView and define its properties
        ImageView i = new ImageView(this);
//        i.setImageResource(R.drawable.picture1);
        Picasso.get().load("http://www.pngall.com/wp-content/uploads/2016/03/Butterfly-PNG-3.png").into(i, new Callback() {
            @Override
            public void onSuccess() {
                System.out.println("Success");
            }

            @Override
            public void onError(Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        });
        i.setContentDescription(getResources().getString(R.string.my_image_desc));

        // set the ImageView bounds to match the Drawable's dimensions
        i.setAdjustViewBounds(true);
        i.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // Add the ImageView to the layout and set the layout as the content view.
        constraintLayout.addView(i);
        setContentView(constraintLayout);

    }
}