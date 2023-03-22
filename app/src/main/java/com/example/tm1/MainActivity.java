package com.example.tm1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.example.tm1.databinding.ActivityMainBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

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
//                try {
//                    URL url = new URL("https://harber.mimoapps.xyz/api/getaccess.php");
//                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//                    InputStream inputStream = httpURLConnection.getInputStream();
//
//
//
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }

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