package org.eenie.cartoonist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.bmob.v3.AsyncCustomEndpoints;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.CloudCodeListener;

public class MainActivity extends AppCompatActivity {

    Button btnGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        btnGet = (Button) findViewById(R.id.btnGet);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remoteMethod("debug");
            }
        });
    }


    private void remoteMethod(String method) {
        AsyncCustomEndpoints ace = new AsyncCustomEndpoints();
        ace.callEndpoint(method, new CloudCodeListener() {
            @Override
            public void done(Object o, BmobException e) {
                System.out.println(o.toString());
            }
        });
    }


}
