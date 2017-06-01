package com.example.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyIntentService extends IntentService {
    private final static String TAG = "MyIntentService";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "IntentService created" );
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand ~ startId: " + startId);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "IntentService destroyed");
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        int data = intent.getIntExtra("data", -1);
        Log.d(TAG, "onHandleIntent ~ received data: " + data);
    }

}
