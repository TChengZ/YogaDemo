package com.yoga.jc.yogademo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.soloader.SoLoader;
import com.facebook.yoga.android.YogaViewLayoutFactory;

public class YogaActivity extends Activity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflater.from(this).setFactory(YogaViewLayoutFactory.getInstance());
        super.onCreate(savedInstanceState);
        SoLoader.init(this, false);
        setContentView(R.layout.activity_yoga);

        TextView tvTop = (TextView) findViewById(R.id.top);
        tvTop.setText(stringFromJNI("top"));

        TextView tvMiddle = (TextView) findViewById(R.id.middle);
        tvMiddle.setText(stringFromJNI("middle"));

        TextView tvMiddleLeft = (TextView) findViewById(R.id.middle_left);
        tvMiddleLeft.setText(stringFromJNI("left"));

        TextView tvMiddleRight = (TextView) findViewById(R.id.middle_right);
        tvMiddleRight.setText(stringFromJNI("right"));

        TextView tvBottom = findViewById(R.id.bottom);
        tvBottom.setText(stringFromJNI("bottom"));

        TextView tvAbsolute = findViewById(R.id.absolute);
        tvAbsolute.setText(stringFromJNI("absolute"));
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI(String s);
}
