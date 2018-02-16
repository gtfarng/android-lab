package com.gtfarng.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button next = (Button)findViewById(R.id.btnap);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
        Button nexts = (Button)findViewById(R.id.btnbk);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j =  new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(j);
            }
        });

    }


}
