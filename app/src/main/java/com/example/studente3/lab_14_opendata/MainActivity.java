package com.example.studente3.lab_14_opendata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.studente3.lab_14_opendata.api.TaipeiOpenDataUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TaipeiOpenDataUtil.loadTaipeiAttractions();
    }
}
