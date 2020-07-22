package com.example.androidshaper.onetimeworkrequesttoworkmanagerbyandroidjetpack;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {

    final String TAG="MyWorker";
    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        int a=10,b=20,c;
        c=a+b;
        Log.d(TAG, "doWork: "+String.valueOf(c));

        return Result.success();
    }
}
