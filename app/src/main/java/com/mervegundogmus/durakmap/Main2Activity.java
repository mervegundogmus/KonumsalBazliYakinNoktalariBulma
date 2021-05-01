package com.mervegundogmus.durakmap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    ImageView iv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iv=(ImageView)findViewById(R.id.ivv);
        tv=(TextView)findViewById(R.id.tw);
        Intent intent=getIntent();
        iv.setImageBitmap(MainActivity.selectedimage);
String name=intent.getStringExtra("name");

        int min = 20;
        int max = 60;

        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        String kalanSure= String.valueOf(i1);
        tv.setText(name+" otobusune "+kalanSure+" dk kaldı");

    }
}
