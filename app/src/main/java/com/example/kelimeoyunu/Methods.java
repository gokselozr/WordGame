package com.example.kelimeoyunu;

import android.os.SystemClock;
import android.widget.Chronometer;
import android.widget.TextView;

public class Methods {
    public int countTime(Chronometer chro, int poin,int level){
        long elapsedMillis = SystemClock.elapsedRealtime() - chro.getBase();
        if (level==1) {
            if (elapsedMillis <= 15000) {
                poin += 10;
            } else if (elapsedMillis <= 30000) {
                poin += 5;
            }
        }
        else if (level==2)
        {
            if (elapsedMillis <= 20000) {
                poin += 10;
            } else if (elapsedMillis <= 40000) {
                poin += 5;
            }
        }
        else if (level==3)
        {
            if (elapsedMillis <= 30000) {
                poin += 10;
            } else if (elapsedMillis <= 60000) {
                poin += 5;
            }
        }
        return poin;
    }
    public void time(Chronometer chro){
        chro.start();
    }
    public String cont(int ck, TextView txt, TextView res,String rest){
        if (ck==1) {
            rest += txt.getText();
            res.setText(rest);
        }
        return rest;
    }
}
