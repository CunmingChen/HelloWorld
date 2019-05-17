package com.example.HelloWorld;


//test
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","调用 onCreate()");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivityLife","调用 onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivityLife","调用 onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivityLife","调用 onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivityLife","调用 onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivityLife","调用 onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MainActivityLife","调用 onRestart()");
    }
}
