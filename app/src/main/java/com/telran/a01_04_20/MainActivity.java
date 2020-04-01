package com.telran.a01_04_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.telran.a01_04_20.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MyWorker worker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        worker = new MyWorker();

//        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        TextView myTxt = binding.myTxt;
//        Button button = binding.button;
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        DataModel model = new DataModel();

        model.liveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                binding.myTxt.setText(s);
            }
        });

        binding.setModel(model);
        Lifecycle lifecycle = getLifecycle();
        lifecycle.addObserver(worker);
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        worker.startWork();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        worker.stopWork();
//    }
}
