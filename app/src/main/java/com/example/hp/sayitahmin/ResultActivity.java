package com.example.hp.sayitahmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    ImageView imgResult;
    TextView txtResult;
    Button btnResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        imgResult=findViewById(R.id.imgResult);
        txtResult=findViewById(R.id.txtResult);
        btnResult=findViewById(R.id.btnResult);
        boolean sonuc=getIntent().getBooleanExtra("result",false);
        if (sonuc){
            imgResult.setImageResource(R.drawable.smile);
            txtResult.setText("Kazandınız...");
        }
        else {
            imgResult.setImageResource(R.drawable.sad);
            txtResult.setText("Kaybettiniz");
        }



        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ResultActivity.this,SecondActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
