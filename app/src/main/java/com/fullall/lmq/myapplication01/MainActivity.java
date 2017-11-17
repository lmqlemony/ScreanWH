package com.fullall.lmq.myapplication01;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn ;
    private View bg;
    private Integer kd,gd,k,g,btn_kg,l,m,q;
    private String t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        bg = (View)findViewById(R.id.bg);
        btn_kg = 80;
        t = "lmq";
        DisplayMetrics metric = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metric);
        k = metric.widthPixels;     // 屏幕宽度（像素）
        g = metric.heightPixels;   // 屏幕高度（像素）
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kd = (int)(Math.random()*(k-btn_kg));
                gd = (int)(Math.random()*(g-btn_kg));
                setTitle(kd+":"+gd);
//                btn.setText(kd+":"+gd);  //不会跳了
                btn.setTop(gd);
                btn.setLeft(kd);
                btn.setBottom(btn_kg + gd);
                btn.setRight(btn_kg + kd);
                Random random = new Random();
                l = (int)random.nextInt(256);
                m = (int)random.nextInt(256);
                q = (int)random.nextInt(256);
                btn.setBackgroundColor(Color.rgb(l,m,q));
                bg.setBackgroundColor(Color.rgb(255-l,255-m,255-q));
//                kd.toString()+":"+gd.toString()
//                Toast.makeText(MainActivity.this,kd.toString()+":"+gd.toString(),Toast.LENGTH_SHORT).show();
//                btn.setText(ra.toString());
            }
        });
    }

//    private void onClick(View view){
//        Toast.makeText(this,"click",Toast.LENGTH_LONG).show();
//    }
}
