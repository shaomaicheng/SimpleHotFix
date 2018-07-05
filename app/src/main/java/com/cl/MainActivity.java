package com.cl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        new BugTest().getBug(MainActivity.this);
    }

    private void init() {
        btnFix = findViewById(R.id.btnFix);
    }
}
