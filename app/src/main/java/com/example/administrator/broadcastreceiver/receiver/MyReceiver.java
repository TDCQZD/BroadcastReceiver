package com.example.administrator.broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * BroadcastReceiver
 *普通广播
 * @author ZD
 *         created at 2017/8/7 17:28
 *         description：
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,
                "接收到的Intent的Action为：" + intent.getAction()
                        + "\n消息内容是：" + intent.getStringExtra("msg")
                , Toast.LENGTH_LONG).show();

    }
}
