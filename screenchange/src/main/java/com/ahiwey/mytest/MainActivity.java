package com.ahiwey.mytest;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    private static String TAG = MainActivity.class.getSimpleName();
    private MyFrament frament;
    private Button button;
    private AA aa;
    private BB bb;
    private BB cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_change);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });
        FragmentManager fragmentManager = getSupportFragmentManager();
        frament = (MyFrament) fragmentManager.findFragmentByTag("data");
        if (frament == null) {
            frament = new MyFrament();
            fragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE).add(frament,
                    "data").commit();
            frament.setData(new MyData());
        } else {
            frament.getData();
        }
        aa = new AA();
        int i= Intent.FLAG_ACTIVITY_TASK_ON_HOME;
    }

    @Override
    protected void onStart() {
        super.onStart();
        bb = new BB();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        cc=new BB();
    }

    @Override
    protected void onPause() {
        super.onPause();
        BB cc = new BB();
    }

    @Override
    protected void onStop() {
        super.onStop();
        AA dd = new AA();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        frament.setData(new MyData());
        aa = (AA) bb;
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
//        outState.putString("key","value");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
//        savedInstanceState.getString("key");
    }

}
