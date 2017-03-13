package com.shellcore.android.broadcastsender.main.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shellcore.android.broadcastsender.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSendBroadcast)
    public void onClickSendBroadcast() {
        Intent intent = new Intent();
        intent.setAction("com.shellcore.android.broadcastsender.NEW_BROADCAST");
        intent.putExtra("broadcast", "Hello");
        sendBroadcast(intent);
    }
}
