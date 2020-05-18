package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

public class Level3 extends AppCompatActivity {
    TextView txtm,txti,txtl,txty,txto,txtn,txtRes,txtPt;
    EditText edt1,edt2,edt3,edt4,edt5,edt6,edt7,edt8,edt9,edt10,edt11,edt12,edt13,edt14,edt15,edt16,edt17,edt18,edt19;
    String result="";
    Button btnOnay,btnSil;
    Integer level=3;
    Methods methods=new Methods();
    Integer m=1,i=1,l=1,y=1,o=1,n=1,point=0,milyon=1,limon=1,mil=1,nil=1,iyon=1,yol=1;
    Chronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        txtm=findViewById(R.id.textView15);
        txti=findViewById(R.id.textView16);
        txtl=findViewById(R.id.textView17);
        txty=findViewById(R.id.textView18);
        txto=findViewById(R.id.textView24);
        txtn=findViewById(R.id.textView25);
        txtRes=findViewById(R.id.textView14);
        edt1=findViewById(R.id.milyonM);
        edt2=findViewById(R.id.milyonI);
        edt3=findViewById(R.id.milyonL);
        edt4=findViewById(R.id.milyonY);
        edt5=findViewById(R.id.milyonO);
        edt6=findViewById(R.id.milyonN);
        edt7=findViewById(R.id.limonI);
        edt8=findViewById(R.id.limonM);
        edt9=findViewById(R.id.limonO);
        edt10=findViewById(R.id.limonN);
        edt11=findViewById(R.id.milI);
        edt12=findViewById(R.id.milL);
        edt13=findViewById(R.id.nilN);
        edt14=findViewById(R.id.nilL);
        edt15=findViewById(R.id.iyonI);
        edt16=findViewById(R.id.iyonY);
        edt17=findViewById(R.id.iyonN);
        edt18=findViewById(R.id.yolY);
        edt19=findViewById(R.id.yolL);
        btnOnay=findViewById(R.id.button4);
        btnSil=findViewById(R.id.button3);
        txtPt=findViewById(R.id.textView10);
        chronometer=findViewById(R.id.chronometer);
        methods.time(chronometer);

        txtm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(m,txtm,txtRes,result);
                    m--;
                }
                return false;
            }
        });
        txti.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(i,txti,txtRes,result);
                    i--;
                }
                return false;
            }
        });
        txtl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(l,txtl,txtRes,result);
                    l--;
                }
                return false;
            }
        });
        txty.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(y,txty,txtRes,result);
                    y--;
                }
                return false;
            }
        });
        txto.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(o,txto,txtRes,result);
                    o--;
                }
                return false;
            }
        });
        txtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(n,txtn,txtRes,result);
                    n--;
                }
                return false;
            }
        });
        btnOnay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtRes.getText().equals("MİLYON")&&milyon==1)
                {
                    edt1.setText("M");
                    edt2.setText("İ");
                    edt3.setText("L");
                    edt4.setText("Y");
                    edt5.setText("O");
                    edt6.setText("N");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    milyon--;
                }
                else if (txtRes.getText().equals("MİL")&&mil==1)
                {
                    edt1.setText("M");
                    edt11.setText("İ");
                    edt12.setText("L");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    mil--;
                }
                else if (txtRes.getText().equals("NİL")&&nil==1)
                {
                    edt13.setText("N");
                    edt15.setText("İ");
                    edt14.setText("L");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    nil--;
                }
                else if (txtRes.getText().equals("LİMON")&&limon==1)
                {
                    edt3.setText("L");
                    edt7.setText("İ");
                    edt8.setText("M");
                    edt9.setText("O");
                    edt10.setText("N");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    limon--;
                }
                else if (txtRes.getText().equals("İYON")&&iyon==1)
                {
                    edt15.setText("İ");
                    edt16.setText("Y");
                    edt5.setText("O");
                    edt17.setText("N");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    iyon--;
                }
                else if (txtRes.getText().equals("YOL")&&yol==1)
                {
                    edt18.setText("Y");
                    edt9.setText("O");
                    edt19.setText("L");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    yol--;
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
                EditText[] edtArr = { edt1, edt2, edt3, edt4, edt5, edt6, edt7, edt8 , edt9, edt10, edt11, edt12, edt13, edt14, edt15, edt16, edt17, edt18, edt19};
                int count=0;
                for (int i=0;i<=18;i++){
                    if (!edtArr[i].getText().toString().equals("")){
                        count++;
                    }
                    if (count==19){
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
        Intent lv2=getIntent();
        String lv2pt=txtPt.getText().toString()+":"+lv2.getStringExtra("level2");
        Intent intent =new Intent(Level3.this, Results.class);
        intent.putExtra("level3",lv2pt);
        startActivityForResult(intent,0);

    }
    protected void clear(){
        m=1;
        i=1;
        l=1;
        y=1;
        o=1;
        n=1;
        result="";
        txtRes.setText("");
    }
}
