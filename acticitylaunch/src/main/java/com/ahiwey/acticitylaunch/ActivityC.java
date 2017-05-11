package com.ahiwey.acticitylaunch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

/**
 * Created by ahiwey on 2017/3/1.
 */

public class ActivityC extends AppCompatActivity implements View.OnClickListener{
    private Button buttonA,buttonB,buttonC,buttonD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        buttonA= (Button) findViewById(R.id.btn_a);
        buttonB= (Button) findViewById(R.id.btn_b);
        buttonC= (Button) findViewById(R.id.btn_c);
        buttonD= (Button) findViewById(R.id.btn_d);
        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_a:{
                Intent intent =new Intent(getApplicationContext(),ActivityA.class);
                startActivity(intent);
                break;}
            case R.id.btn_b:{
                Intent intent = new Intent(getApplicationContext(), ActivityB.class);
                intent.addFlags(FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;}
            case R.id.btn_c:{
                Intent intent =new Intent(getApplicationContext(),ActivityC.class);
                startActivity(intent);
                break;}
            case R.id.btn_d:{
                Intent intent =new Intent(getApplicationContext(),ActivityD.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                break;}
        }
    }
}
