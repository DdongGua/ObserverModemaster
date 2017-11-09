package com.example.observermode_master;

import android.util.Log;
import android.widget.TextView;

/**
 * Created by 亮亮 on 2017/11/9.
 */

public class ShuZhou extends TicketInfoListener{
    private static final String TAG = "ShuZhou";

    TextView tv;

    public ShuZhou(TextView tv) {
        this.tv = tv;
    }

    @Override
    protected void dosomething(int tag) {
        if(tag==1){
           tv.setText("我买到苏州的票了");
        }else {
            tv.setText("我没法去游玩了");
        }
    }
}
