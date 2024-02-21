package com.pax.paxwidthheightautosize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.main_1)).setText(Build.MODEL.toUpperCase());
        ((TextView)findViewById(R.id.main_2)).setText(Build.MODEL.toUpperCase());
        ((TextView)findViewById(R.id.main_3)).setText(Build.MODEL.toUpperCase());
        ((TextView)findViewById(R.id.main_4)).setText(Build.MODEL.toUpperCase());
        ((TextView)findViewById(R.id.main_5)).setText(Build.MODEL.toUpperCase());
        ((TextView)findViewById(R.id.main_6)).setText(Build.MODEL.toUpperCase());
        ((TextView)findViewById(R.id.main_7)).setText(Build.MODEL.toUpperCase());
        ((TextView)findViewById(R.id.main_8)).setText(Build.MODEL.toUpperCase());
        ((TextView)findViewById(R.id.main_9)).setText(Build.MODEL.toUpperCase());
        getScreenSize();
    }

    private void getScreenSize(){
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width = metrics.widthPixels;//宽度 px
        int height = metrics.heightPixels;//高度 px
        float density = metrics.density;//密度 0.75/1.0/1.5
        int densityDpi = metrics.densityDpi;//密度dpi(120/160/240)
        int screenW = (int)(width/density);//屏幕宽度(dp)
        int screenH = (int)(height/density);//屏幕高度(dp)
        Log.i("yuzhizhe","width:"+width+"   height:"+height+"   density:"+density+"  densityDpi:"+densityDpi+"  screenW:"+screenW+"  screenH:"+screenH);
    }
}