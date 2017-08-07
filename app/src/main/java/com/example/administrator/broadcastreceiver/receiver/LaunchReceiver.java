package com.example.administrator.broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.administrator.broadcastreceiver.service.LaunchService;

/**
 * 开机自动运行的Service
 */

public class LaunchReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent tIntent = new Intent(context
                , LaunchService.class);
        // 启动指定Service
        context.startService(tIntent);
    }
}
