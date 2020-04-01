package com.telran.a01_04_20;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

public class SecondActivityViewModel extends AndroidViewModel {
    public String input;
    public ObservableBoolean isProgress = new ObservableBoolean();
    public ObservableField<String> name = new ObservableField<>();

    public SecondActivityViewModel(@NonNull Application application) {
        super(application);
    }


    //    public SecondActivityViewModel(String input) {
//        this.input = input;
//    }

    public void onBtnClick(){
        Context context = getApplication();
        isProgress.set(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isProgress.set(false);
                name.set(input);
            }
        }).start();
    }
}
