package com.yoga.jc.yogademo;

import android.app.Application;
import android.view.LayoutInflater;

import com.facebook.soloader.SoLoader;
import com.facebook.yoga.android.YogaViewLayoutFactory;

/**
 * Created by chenzujie on 2020/6/21.
 */

public class YogaApplication extends Application{

   public void onCreate(){
       super.onCreate();
       SoLoader.init(this, false);
       LayoutInflater.from(this).setFactory(YogaViewLayoutFactory.getInstance());
   }
}
