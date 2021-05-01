package com.mervegundogmus.durakmap;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static Bitmap selectedimage;
    ListView lw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lw=(ListView)findViewById(R.id.lw_otobusler);

        final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("19Nolu-Toki-Bahattingazi-Üniversite-100.Yıl-5000Evler");
        arrayList.add("30Nolu-Katip Çelebi KyK Yurtları-Üniversite-5000Evler");

        Bitmap toki= BitmapFactory.decodeResource(getApplication().getResources(),R.drawable.otobus19);
        Bitmap kyk=BitmapFactory.decodeResource(getApplication().getResources(),R.drawable.otobus30);

        final ArrayList<Bitmap> Resimler=new ArrayList<>();
        Resimler.add(toki);
        Resimler.add(kyk);

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        lw.setAdapter(arrayAdapter);

        lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                selectedimage=Resimler.get(position);
                intent.putExtra("name",arrayList.get(position));

                startActivity(intent);

            }
        });




    }
}
