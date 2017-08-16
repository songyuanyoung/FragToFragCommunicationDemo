package com.example.zach.fragtofragcommunicationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by zhangwenpurdue on 8/16/2017.
 */

public class ClientFragment extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.client, container, false);
        textView = (TextView) view.findViewById(R.id.infoFromFrag);
        Bundle args = new Bundle();
        args = getArguments();
        
       textView.setText(args.getString("info") + "");
        return view;
    }
}
