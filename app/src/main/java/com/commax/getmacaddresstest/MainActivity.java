package com.commax.getmacaddresstest;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMacAddress();


    }

    private void showMacAddress() {
        TextView macAddress = (TextView) findViewById(R.id.macAddress);
        macAddress.setText(getMacAddress());
    }

    private String getMacAddress() {
        return MacAddressFinder.getMacAddress();
    }


}
