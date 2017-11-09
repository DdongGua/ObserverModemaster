package com.example.observermode_master;

import android.util.Log;

/**
 * Created by 亮亮 on 2017/11/9.
 */

public abstract class TicketInfoListener {
    private static final String TAG = "TicketInfoListener";
    //显示到底有没有票
    void showTicketInfo(int tag){
        if(tag==1){
            Log.e(TAG, "showTicketInfo: 有票啦" );
        }else {
            Log.e(TAG, "showTicketInfo: 没票了");
        }
        dosomething(tag);

    }
    protected abstract void dosomething(int tag);

}
