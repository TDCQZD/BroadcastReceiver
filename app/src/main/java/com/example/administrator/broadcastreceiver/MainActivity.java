package com.example.administrator.broadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * 发送广播
 *
 * @author ZD
 *         created at 2017/8/7 17:31
 *         description：
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        // 创建Intent对象
        Intent intent = new Intent();
        // 设置Intent的Action属性
        intent.setAction("org.crazyit.action.CRAZY_BROADCAST");
        intent.putExtra("msg", "普通广播的消息");
        // 发送广播
        sendBroadcast(intent);
    }

    public void sendOrder(View v) {
        // 创建Intent对象
        Intent intent = new Intent();
        // 设置Intent的Action属性
        intent.setAction("org.administrator.action.CRAZY_BROADCAST");
        intent.putExtra("msg", "有序广播的消息");
        // 发送有序广播
        sendOrderedBroadcast(intent, null);
    }

    public void startService(View view) {
        Toast.makeText(MainActivity.this, "开机自动运行的Service", Toast.LENGTH_SHORT).show();
    }

    public void smsRemind(View view) {
        Toast.makeText(MainActivity.this, "短信提醒", Toast.LENGTH_SHORT).show();
    }

    public void batteryRemind(View view) {
        Toast.makeText(MainActivity.this, "手机电量提示", Toast.LENGTH_SHORT).show();
    }
}
