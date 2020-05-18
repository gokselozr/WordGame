package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Chronometer;
import android.widget.TextView;

public class Results extends AppCompatActivity {
    TextView txtlv1pt,txtlv2pt,txtlv3pt,txtpt;
    Integer lv1,lv2,lv3,all;
    long elapsed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        txtlv1pt=findViewById(R.id.textView35);
        txtlv2pt=findViewById(R.id.textView36);
        txtlv3pt=findViewById(R.id.textView37);
        txtpt=findViewById(R.id.textView38);
        Intent lv3=getIntent();
        String lv3pt=lv3.getStringExtra("level3");
        String[] levels=lv3pt.split(":");
        txtlv3pt.setText(levels[0]);
        txtlv2pt.setText(levels[1]);
        txtlv1pt.setText(levels[2]);
        Integer all=Integer.parseInt(levels[0])+Integer.parseInt(levels[1])+Integer.parseInt(levels[2]);
        txtpt.setText(String.valueOf(all));
    }
}
