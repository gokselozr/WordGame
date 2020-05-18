package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Level2 extends AppCompatActivity {

    TextView txtb,txta,txtl,txti,txtk,txtRes,txtPt;
    EditText edt1,edt2,edt3,edt4,edt5,edt6,edt7,edt8,edt9,edt10,edt11,edt12,edt13,edt14,edt15,edt16;
    String result="";
    Button btnOnay,btnSil;
    Integer level=2;
    Methods methods=new Methods();
    Chronometer chronometer;
    Integer b=1,a=1,l=1,i=1,k=1,balik=1,bal=1,akil=1,kal=1,kil=1,bak=1,point=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        txtb=findViewById(R.id.textView19);
        txta=findViewById(R.id.textView20);
        txtl=findViewById(R.id.textView21);
        txti=findViewById(R.id.textView22);
        txtk=findViewById(R.id.textView23);
        txtRes=findViewById(R.id.txtRes2);
        txtPt=findViewById(R.id.txtPoint2);
        edt1=findViewById(R.id.balıkB);
        edt2=findViewById(R.id.balıkA);
        edt3=findViewById(R.id.balıkL);
        edt4=findViewById(R.id.balıkI);
        edt5=findViewById(R.id.balıkK);
        edt6=findViewById(R.id.bakB);
        edt7=findViewById(R.id.bakA);
        edt8=findViewById(R.id.bakK);
        edt9=findViewById(R.id.kalA);
        edt10=findViewById(R.id.balA);
        edt11=findViewById(R.id.balL);
        edt12=findViewById(R.id.akılA);
        edt13=findViewById(R.id.akılI);
        edt14=findViewById(R.id.akılL);
        edt15=findViewById(R.id.kılK);
        edt16=findViewById(R.id.kılI);
        btnOnay=findViewById(R.id.btnOnay2);
        btnSil=findViewById(R.id.btnSil2);
        chronometer=findViewById(R.id.chronometer2);
        methods.time(chronometer);
        txtb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(b,txtb,txtRes,result);
                    b--;
                }
                return false;
            }
        });
        txta.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(a,txta,txtRes,result);
                    a--;
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
        txtk.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    result=methods.cont(k,txtk,txtRes,result);
                    k--;
                }
                return false;
            }
        });
        btnOnay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtRes.getText().equals("BALIK")&&balik==1)
                {
                    edt1.setText("B");
                    edt2.setText("A");
                    edt3.setText("L");
                    edt4.setText("I");
                    edt5.setText("K");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    balik--;
                }
                else if(txtRes.getText().equals("BAL")&&bal==1)
                {
                    edt1.setText("B");
                    edt10.setText("A");
                    edt11.setText("L");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    bal--;
                }
                else if(txtRes.getText().equals("BAK")&&bak==1)
                {
                    edt6.setText("B");
                    edt7.setText("A");
                    edt8.setText("K");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    bak--;
                }
                else if(txtRes.getText().equals("KAL")&&kal==1)
                {
                    edt8.setText("K");
                    edt9.setText("A");
                    edt3.setText("L");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    kal--;
                }
                else if(txtRes.getText().equals("AKIL")&&akil==1)
                {
                    edt12.setText("A");
                    edt5.setText("K");
                    edt13.setText("I");
                    edt14.setText("L");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    akil--;
                }
                else if(txtRes.getText().equals("KIL")&&kil==1)
                {
                    edt15.setText("K");
                    edt16.setText("I");
                    edt14.setText("L");
                    point+=10;
                    point=methods.countTime(chronometer,point,level);
                    kil--;
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
                EditText[] edtArr = { edt1, edt2, edt3, edt4, edt5, edt6, edt7, edt8, edt9, edt10, edt11, edt12, edt13, edt14, edt15, edt16 };
                int count=0;
                for (int i=0;i<=15;i++){
                    if (!edtArr[i].getText().toString().equals("")){
                        count++;
                    }
                    if (count==16){
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
    protected void clear(){
        b=1;
        a=1;
        l=1;
        i=1;
        k=1;
        result="";
        txtRes.setText("");
    }
    protected void next(){
        Intent lv1=getIntent();
        String lv1pt=txtPt.getText().toString()+":"+lv1.getStringExtra("level1");
        Intent intent =new Intent(Level2.this, Level3.class);
        intent.putExtra("level2",lv1pt);
        startActivityForResult(intent,0);
    }
    /**protected void cont(int ck,TextView txt,TextView res){
        if (ck==1) {
            result += txt.getText();
            res.setText(result);
        }
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
    }
    protected void time(){
        chronometer.start();
    }**/

}
