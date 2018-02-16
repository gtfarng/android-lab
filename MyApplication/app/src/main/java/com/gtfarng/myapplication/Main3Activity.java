package com.gtfarng.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button next = (Button)findViewById(R.id.btnbk);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        Button nexts = (Button)findViewById(R.id.btnGo);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j =  new Intent(Main3Activity.this,MainActivity.class);
                startActivity(j);
            }
        });

    }


}