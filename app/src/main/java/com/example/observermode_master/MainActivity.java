package com.example.observermode_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private Button bt1,bt2,bt_xiaoming,bt_xiaohong;
    private ShuZhou shuZhou1;
    private Beijing bj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        bt_xiaoming.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                shuZhou1 = new ShuZhou(tv1);
                ZhiXingTrainTicket.buyService(shuZhou1);

            }
        });
        bt_xiaoming.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ZhiXingTrainTicket.cancleService(shuZhou1);
                return true;
            }
        });

        bt_xiaohong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bj = new Beijing(tv2);
                ZhiXingTrainTicket.buyService(bj);

            }
        });
        bt_xiaohong.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ZhiXingTrainTicket.cancleService(bj);
                return true;
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZhiXingTrainTicket.notifyTicketInfo(1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZhiXingTrainTicket.notifyTicketInfo(0);
            }
        });

    }

    private void initView() {
            tv1 = findViewById(R.id.tv1);
            tv2 = findViewById(R.id.tv2);
            bt1 = findViewById(R.id.bt1);
            bt2 = findViewById(R.id.bt2);
            bt_xiaoming = findViewById(R.id.bt_xiaoming);
            bt_xiaohong = findViewById(R.id.bt_xiaohong);
    }
}
