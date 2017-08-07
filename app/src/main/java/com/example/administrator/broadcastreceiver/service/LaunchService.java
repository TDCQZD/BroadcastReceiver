package com.example.administrator.broadcastreceiver.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 开机自动运行的Service
 */

public class LaunchService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        // 定义1秒执行一行输出
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("-----"
                        + new Date() + "-----");
            }
        }, 0, 1000);

    }
}
