package com.example.zach.fragtofragcommunicationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ServerFragment.OnFragmentSelectedListener{
    ServerFragment serverFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, new ServerFragment()).commit();

    }

    @Override
    public void onFragmentSelected(String info) {
        ClientFragment clientFragment  = new ClientFragment();
        Bundle args = new Bundle();
        args.putString("info", info);
        clientFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, clientFragment).commit();

    }
}
