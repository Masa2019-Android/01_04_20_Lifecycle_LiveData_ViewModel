package com.telran.a01_04_20;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class DataModel {
    public String name;

    public MutableLiveData<String> liveData = new MutableLiveData<>();


    public void onCLick(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                liveData.setValue(name);
                liveData.postValue(name);
            }
        }).start();
//        liveData.setValue(name);
    }
}
