package com.gks.samplesdk;

import android.content.Context;
import android.widget.Toast;

public class LogDebug {

    public static void debug(Context cxt, String msg) {
        Toast.makeText(cxt, msg, Toast.LENGTH_SHORT).show();
    }
}
