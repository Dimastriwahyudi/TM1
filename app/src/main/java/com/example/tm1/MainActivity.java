package com.example.tm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnexit, btnsubmit;
    EditText txtmsg,txtstatus,txtcomment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmsg = (EditText) findViewById(R.id.txtMsg);
        txtstatus = (EditText) findViewById(R.id.txtStatus);
        txtcomment = (EditText) findViewById(R.id.txtComment);

        btnsubmit = (Button) findViewById(R.id.btnSubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmsg.setText("data received");
                txtstatus.setText("halo siswa algo2");
                txtcomment.setText("anda sudah terkoneksi ke server mimoapps");


            }
        });

        btnexit = (Button) findViewById(R.id.btnExit);
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }
}