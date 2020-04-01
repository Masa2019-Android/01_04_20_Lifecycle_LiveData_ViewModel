package com.telran.a01_04_20;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class MyWorker implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void startWork(){
        Log.d("MY_TAG", "startWork: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stopWork(){
        Log.d("MY_TAG", "stopWork: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onStateChanged(LifecycleOwner owner, Lifecycle.Event event){
        Log.d("MY_TAG", "onStateChanged: " + event);
    }
}
