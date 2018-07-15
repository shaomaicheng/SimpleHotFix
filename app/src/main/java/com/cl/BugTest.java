package com.cl;

import android.content.Context;
import android.widget.Toast;

/**
 * create by chenglei at 2018/7/5
 */
public class BugTest {
    public static void getBug(Context context) {
        // mock a bug
        int i = 10;
        int a = 0;
//        int a = 1;
        Toast.makeText(context, "Hello, Minuit: " + i / a, Toast.LENGTH_SHORT).show();
        Empty.show();
    }
}
