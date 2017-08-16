package com.example.zach.fragtofragcommunicationdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by zhangwenpurdue on 8/15/2017.
 */

public class ServerFragment extends Fragment {
    OnFragmentSelectedListener mCallback;
    Button button;
    EditText editText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.server, container, false);
        button = (Button) view.findViewById(R.id.btn);
        editText = (EditText) view.findViewById(R.id.info);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallback.onFragmentSelected(editText.getText().toString());
            }
        });
        return view;
    }

    public interface OnFragmentSelectedListener {
        public void onFragmentSelected(String info);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mCallback = (OnFragmentSelectedListener)context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "Mush implement OnFragmentSelectedListener ");
        }
    }
}
