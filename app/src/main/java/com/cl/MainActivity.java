package com.cl;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        if (FIxDexUtil.isGoingToFix(this)) {
            FIxDexUtil.loadFixDex(this, Environment.getExternalStorageDirectory());
        }

        btnFix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new BugTest().getBug(MainActivity.this);
            }
        });

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(MainActivity.this, TestActivity.class));
//            }
//        }).start();
    }

    private void init() {
        btnFix = findViewById(R.id.btnFix);
    }
}
