package com.neat.cattle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.widget.AppCompatImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MapImageView extends AppCompatImageView {
    private Drawable drawable;
    private int viewWidth, viewHeight;

    public MapImageView(Context context) {
        super(context);
        init(context);
    }

    public MapImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MapImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {
        // Instantiate an ImageView and define its properties
        final ImageView imageView = this;
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/3/35/Neckertal_20150527-6384.jpg").into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                drawable = imageView.getDrawable();
                System.out.println("Success");
            }

            @Override
            public void onError(Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        });
    }

    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.setScaleType(ScaleType.CENTER);
        this.setScaleX(2.5F);
        this.setScaleY(2.5F);

//        drawable = this.getDrawable();
//        drawable.setBounds(50, 50, 300, 500);
//        drawable.draw(canvas);
    }
}
