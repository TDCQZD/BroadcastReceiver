package com.example.administrator.broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * 有序广播—two
 *
 * @author ZD
 *         created at 2017/8/7 17:37
 *         description：
 */
public class MyOrderlyTwoReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = getResultExtras(true);
        // 解析前一个BroadcastReceiver所存入的key为first的消息
        String first = bundle.getString("first");
        Log.i("TAG", "前一个BroadcastReceiver所存入的消息:" + first);
        Toast.makeText(context, "第一个Broadcast存入的消息为："
                + first, Toast.LENGTH_LONG).show();
    }
}
