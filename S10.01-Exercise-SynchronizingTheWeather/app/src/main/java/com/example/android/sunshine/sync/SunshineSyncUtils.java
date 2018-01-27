package com.example.android.sunshine.sync;

// completed (9) Create a class called SunshineSyncUtils
//  completed (10) Create a public static void method called startImmediateSync
//  completed (11) Within that method, start the SunshineSyncIntentService

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public class SunshineSyncUtils {

    public static void startImmediateSync(@NonNull Context context) {
        Intent intentToSyncImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentToSyncImmediately);
    }
}