package com.example.training;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * With Layout XML
         */
//        setContentView(R.layout.activity_main);

        /**
         * Without Layout XML
         */
        LinearLayout linearLayout = new LinearLayout(this);
        TextView textView = new TextView(this);
        textView.setText("이름: 홍길동\n프로그래밍 능력: Java(중), Python(상)\n국적: 대한민국\n연락처: gdhong@example.com\n");
        linearLayout.addView(textView);

        setContentView(linearLayout);

    }
}