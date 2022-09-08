package com.example.test;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * 화면에 텍스트 표시(w/o layout XML)
         */
//        TextView textView = new TextView(this);
//        textView.setText("안녕하세요");
//        textView.setTextSize(30);
//        textView.setGravity(Gravity.CENTER);
//
//        setContentView(textView);

        /**
         * 화면에 텍스트 표시(w/ layout XML):
         * LinearLayout, TextView
         */

//        setContentView(R.layout.activity_main);

        /**
         * 화면에 텍스트 표시(w/o layout XML):
         * LinearLayout, TextView
         */
        LinearLayout linearLayout = new LinearLayout(this);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);

        TextView textView1 = new TextView(this);
        textView1.setText("안녕하세요");
        textView1.setTextSize(30);
        textView1.setGravity(Gravity.CENTER);

        TextView textView2 = new TextView(this);
        textView2.setText("방갑습니다");
        textView2.setTextSize(30);
        textView2.setGravity(Gravity.CENTER);

        linearLayout.addView(textView1);
        linearLayout.addView(textView2);

        setContentView(linearLayout);
    }
}