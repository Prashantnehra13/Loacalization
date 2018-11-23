package com.example.prashant.localizationex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.Locale;

public class LocaleChangeBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String locale=Locale.getDefault().getCountry();
        Toast.makeText( context,"System language changed to:"+locale,Toast.LENGTH_LONG ).show();
    }
}
