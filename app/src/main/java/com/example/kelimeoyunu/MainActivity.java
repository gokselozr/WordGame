package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.util.RangeValueIterator;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView txto,txtk,txty,txtu,txtRes,txtPt;
    EditText edt1,edt2,edt3,edt4,edt5,edt6,edt7,edt8;
    String result="";
    Button btnOnay,btnSil;
    Integer level=1;
    Methods methods=new Methods();
    Integer o=1,y=1,k=1,u=1,point=0,koy=1,oyku=1,yuk=1;
    Chronometer chronometer;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txto=findViewById(R.id.textView2);
        txtk=findViewById(R.id.textView);
        txtu=findViewById(R.id.textView3);
        txty=findViewById(R.id.textView4);
        txtRes=findViewById(R.id.textView5);
        edt1=findViewById(R.id.koyK);
        edt2=findViewById(R.id.oykuO);
        edt3=findViewById(R.id.koyY);
        edt4=findViewById(R.id.oykuY);
        edt5=findViewById(R.id.oykuK);
        edt6=findViewById(R.id.oykuU);
        edt7=findViewById(R.id.yukY);
        edt8=findViewById(R.id.yukK);
        btnOnay=findViewById(R.id.button);
        btnSil=findViewById(R.id.button2);
        txtPt=findViewById(R.id.textView7);
        chronometer=findViewById(R.id.chronometer);
        methods.time(chronometer);

        txto.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(o,txto,txtRes,result);
                    o--;
                }
                return true;
            }
        });

       txty.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(y,txty,txtRes,result);
                    y--;
                }
                return true;
            }
        });
        txtk.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(k,txtk,txtRes,result);
                    k--;
                }
                    return true;

            }
        });
        txtu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction()==MotionEvent.ACTION_DOWN) {
                        result=methods.cont(u,txtu,txtRes,result);
                        u--;
                    }
                        return true;

            }
        });
        btnOnay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     if(txtRes.getText().equals("KÖY")&&koy==1)
                     {
                         edt1.setText("K");
                         edt2.setText("Ö");
                         edt3.setText("Y");
                         point+=10;
                         point=methods.countTime(chronometer,point,level);
                         koy--;
                     }
                     else if (txtRes.getText().equals("ÖYKÜ")&&oyku==1)
                     {
                         edt2.setText("Ö");
                         edt4.setText("Y");
                         edt5.setText("K");
                         edt6.setText("Ü");
                         point+=10;
                         point=methods.countTime(chronometer,point,level);
                         oyku--;
                     }
                     else if (txtRes.getText().equals("YÜK")&&yuk==1)
                     {
                         edt7.setText("Y");
                         edt6.setText("Ü");
                         edt8.setText("K");
                         point+=10;
                         point=methods.countTime(chronometer,point,level);
                         yuk--;
                     }
                     else{
                         if (point>=10) {
                             point -= 10;
                         }
                         else{
                             point=0;
                         }
                     }

                clear();
                String pt=point.toString();
                txtPt.setText(pt);
                EditText[] edtArr = { edt1, edt2, edt3, edt4, edt5, edt6, edt7, edt8 };
                int count=0;
                for (int i=0;i<=7;i++){
                    if (!edtArr[i].getText().toString().equals("")){
                        count++;
                    }
                    if (count==8){
                        chronometer.stop();
                        next();
                    }
                }
            }
        });
        btnSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }
    protected void next(){
        Intent intent =new Intent(MainActivity.this, Level2.class);
        intent.putExtra("level1",txtPt.getText().toString());
        startActivityForResult(intent,0);
    }
    protected void clear(){
        k=1;
        o=1;
        u=1;
        y=1;
        result="";
        txtRes.setText("");
    }
    /**protected void cont(int ck,TextView txt,TextView res){
        if (ck==1) {
            result += txt.getText();
            res.setText(result);
            }
    }
    protected void time(){
    chronometer.start();
    }
    protected void countTime(Chronometer chro,int poin){
        long elapsedMillis = SystemClock.elapsedRealtime() - chro.getBase();
        if (elapsedMillis<=15000)
        {
            poin+=10;
        }
        else if (elapsedMillis<=30000){
            poin+=5;
        }
    }**/
}
