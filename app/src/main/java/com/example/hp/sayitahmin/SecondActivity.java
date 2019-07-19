package com.example.hp.sayitahmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    Button btnTahmin;
    EditText edtTahmin;
    TextView txtTahmin,txtSayac;
    int sayi;
    int sayac=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnTahmin=findViewById(R.id.btnTahmin);
        edtTahmin=findViewById(R.id.edtTahmin);
        txtSayac=findViewById(R.id.txtSayac);
        txtTahmin=findViewById(R.id.txtTahmin);
        Random random=new Random();
        sayi=random.nextInt(101);
        Log.e("Rastgele Sayi:",String.valueOf(sayi));
        txtSayac.setText("sayac:"+sayac);
        btnTahmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac=sayac-1;
                int  tahmin=Integer.parseInt(edtTahmin.getText().toString());

               if (sayac!=0){

                   if (sayi==tahmin){
                       Intent i=new Intent(SecondActivity.this,ResultActivity.class);
                       i.putExtra("result",true);
                       startActivity(i);
                   }
                   if (sayi<tahmin){
                        txtTahmin.setText("AZALT");
                   }
                   if (sayi>tahmin){
                       txtTahmin.setText("ARTTIR");

                   }
                    txtSayac.setText("sayac:"+sayac);
               }
               else{
                   Intent i=new Intent(SecondActivity.this,ResultActivity.class);
                   i.putExtra("result",false);
                   startActivity(i);

               }
                edtTahmin.setText("");

            }


        });

    }
}
