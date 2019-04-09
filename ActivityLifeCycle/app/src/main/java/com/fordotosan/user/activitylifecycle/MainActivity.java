package com.fordotosan.user.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("OnCreate","MainActivity Created") ;
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("OnStart","MainActivity Started") ;
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("OnResume","MainActivity OnResume") ;
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("OnPause","MainActivity OnPause") ;
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("OnStop","MainActivity OnStop") ;
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("OnRestart","MainActivity OnRestart") ;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("OnDestroy","MainActivity OnDestroy") ;
    }
}
