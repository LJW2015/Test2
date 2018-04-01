package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    static final String TAG = MainActivity.class.getSimpleName();
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "Activity is onCreate");
        // The activity is being created.
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Activity is onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Activity is onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Activity is onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Activity is onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Activity is onDestroy");
    }

}
