package com.telran.a01_04_20;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MyFactory extends ViewModelProvider.NewInstanceFactory {
    String input;

    public MyFactory(String input) {
        this.input = input;
    }

//    @NonNull
//    @Override
//    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
//        if(modelClass == SecondActivityViewModel.class){
//            return (T) new SecondActivityViewModel(input);
//        }
//        return null;
//    }
}
