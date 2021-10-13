package com.example.attentuators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tnet extends AppCompatActivity {

    TextView Ett1,Ett2,Ett3,T1,T2,T3;
    Button Btnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnet);

        Ett1 = (TextView)findViewById(R.id.ett1);
        Ett2 = (TextView)findViewById(R.id.ett2);
        Ett3 = (TextView)findViewById(R.id.ett3);
        T1 = (TextView)findViewById(R.id.t1);
        T2 = (TextView)findViewById(R.id.t2);
        T3 = (TextView)findViewById(R.id.t3);
        Btnt = (Button)findViewById(R.id.btnt);

        Btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double in = Integer.parseInt(Ett1.getText().toString());
                double ot = Integer.parseInt(Ett2.getText().toString());
                double at = Integer.parseInt(Ett3.getText().toString());
                double y = Math.pow(10,at/20);
                double te = Math.sqrt(in*ot);
                double r1 = (in*((y*y)+1)/((y*y)-1)) - (2*te*y/((y*y)-1));
                double r2 = 2*te*y/((y*y)-1);
                double r3 = (ot*((y*y)+1)/((y*y)-1)) - (2*te*y/((y*y)-1));
                T1.setText(String.valueOf(r1));
                T2.setText(String.valueOf(r2));
                T3.setText(String.valueOf(r3));
            }
        });
    }
}