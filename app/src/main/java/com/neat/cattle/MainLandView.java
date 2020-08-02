package com.neat.cattle;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainLandView extends View {
    Context context;
    private BitmapDrawable drawable;
    private int viewWidth, viewHeight;

    public MainLandView(Context context) {
        super(context);
        init(context);
    }

    public MainLandView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MainLandView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
//        try {
//            URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/3/35/Neckertal_20150527-6384.jpg");
//            InputStream inputStream = url.openStream();
//
//            File storagePath = Environment.getExternalStorageDirectory();
//            File imgFile = new File(storagePath, "map.png");
//            OutputStream imgOutputStream = new FileOutputStream(imgFile);
//
//            byte[] buf = new byte[1024];
//            int n = -1;
//            while ((n = inputStream.read(buf)) >= 0) {
//                imgOutputStream.write(buf, 0, n);
//            }
//            imgOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Files.copy(inputStream, imgFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

//        ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
//        final View view = this;
//        if (viewTreeObserver.isAlive()) {
//            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//                @Override
//                public void onGlobalLayout() {
//                    viewWidth = view.getWidth();
//                    viewHeight = view.getHeight();
//                }
//            });
//        }

//        int x = 10;
//        int y = 10;
//        int width = 300;
//        int height = 50;
//        setContentDescription(context.getResources().getString(
//                R.string.my_image_desc));
//
//        drawable = new ShapeDrawable(new OvalShape());
        // If the color isn't set, the shape uses black as the default.
//        drawable.getPaint().setColor(0xff74AC23);
        // If the bounds aren't set, the shape can't be drawn.
//        drawable.setBounds(x, y, x + width, y + height);


//        drawable = (BitmapDrawable) ResourcesCompat.getDrawable(resources, R.drawable.picture1, null);
    }

    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
//        Paint paint = new Paint();
//        paint.setColor(Color.YELLOW);
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawPaint(paint);
//
//        paint.setColor(Color.BLUE);
//        canvas.drawLine(0, 0, viewWidth, viewHeight, paint);
//        canvas.drawLine(viewWidth, 0, 0, viewHeight, paint);
//
//        paint.setColor(Color.WHITE);
//        paint.setTextSize(300);
//        canvas.drawText("0 kal", 0, 500, paint);
//        canvas.save();

        new Thread() {
            @Override
            public void run() {
                Resources resources = context.getResources();
                try {
                    URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/3/35/Neckertal_20150527-6384.jpg");
                    InputStream inputStream = url.openStream();
//            File storagePath = Environment.getExternalStorageDirectory();
//            File imgFile = new File(storagePath, "map.png");
//            OutputStream imgOutputStream = new FileOutputStream(imgFile);
//
//            byte[] buf = new byte[1024];
//            int n = -1;
//            while ((n = inputStream.read(buf)) >= 0) {
//                imgOutputStream.write(buf, 0, n);
//            }
//            imgOutputStream.close();
                    drawable = new BitmapDrawable(resources, inputStream);
                    drawable.draw(canvas);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();


    }
}
