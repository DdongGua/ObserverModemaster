package com.example.observermode_master;

import android.widget.TextView;

/**
 * Created by 亮亮 on 2017/11/9.
 */

public class Beijing extends TicketInfoListener {
    TextView tv;

    public Beijing(TextView tv) {
        this.tv = tv;
    }

    @Override
    protected void dosomething(int tag) {
        if (tag == 1) {
            tv.setText("我买到beijing的票了");
        } else {
            tv.setText("回不了家了");
        }

    }
}
