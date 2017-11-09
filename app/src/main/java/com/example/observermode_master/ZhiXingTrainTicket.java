package com.example.observermode_master;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by 亮亮 on 2017/11/9.
 *///智行火车票

public class ZhiXingTrainTicket {
    private static final String TAG = "ZhiXingTrainTicket";
    //是用来管理预定了我查票业务人的名单，要想预定的人必须遵循TicketInfoListener的规则
    static ArrayList<TicketInfoListener> lists = new ArrayList<>();

    //预定查票业务
    public static void buyService(TicketInfoListener person) {
        lists.add(person);

    }

    public static void cancleService(TicketInfoListener person) {
        if (lists == null || lists.isEmpty()) {
            Log.e(TAG, "cancleService:  本来就没有订阅者，怎么取消~~~");
            return;
        } else {
            if (lists.contains(person)) {
                lists.remove(person);
                Log.e(TAG, "cancleService: 取消成功");
            } else {
                Log.e(TAG, "cancleService: 没有这个订阅者");
            }
        }
    }

    public static void notifyTicketInfo(int tag) {
        //如果传入是1的话，说明有票，如果传入是0的话，说明无票
        if (lists == null || lists.isEmpty()) {
            Log.e(TAG, "notifyTicketInfo: 没有订阅者");
            return;
        }
        for (TicketInfoListener listener : lists) {
            listener.showTicketInfo(tag);

        }
    }
}
