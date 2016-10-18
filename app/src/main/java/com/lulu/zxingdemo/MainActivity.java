package com.lulu.zxingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lulu.zxing.decoding.Intents;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnZXing(View view) {
        Intent intent = new Intent( Intents.Scan.ACTION);
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0) {
            if (data != null) {
                String str = data.getStringExtra("result");
                Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
