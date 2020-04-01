package com.telran.a01_04_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.telran.a01_04_20.databinding.ActivityMainBinding;
import com.telran.a01_04_20.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_second);
//        SecondActivityViewModel model = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(SecondActivityViewModel.class);
//        SecondActivityViewModel model = new ViewModelProvider(this,new MyFactory("Default value")).get(SecondActivityViewModel.class);
        SecondActivityViewModel model = new ViewModelProvider(this,new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(SecondActivityViewModel.class);
        binding.setModel(model);
    }
}
