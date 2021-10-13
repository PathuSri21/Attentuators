package com.example.attentuators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pinet extends AppCompatActivity {

    TextView Etp1,Etp2,Etp3,P1,P2,P3;
    Button Btnp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinet);

        Etp1 = (TextView)findViewById(R.id.etp1);
        Etp2 = (TextView)findViewById(R.id.etp2);
        Etp3 = (TextView)findViewById(R.id.etp3);
        P1 = (TextView)findViewById(R.id.p1);
        P2 = (TextView)findViewById(R.id.p2);
        P3 = (TextView)findViewById(R.id.p3);
        Btnp = (Button)findViewById(R.id.btnp);

        Btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double in = Integer.parseInt(Etp1.getText().toString());
                double ot = Integer.parseInt(Etp2.getText().toString());
                double at = Integer.parseInt(Etp3.getText().toString());
                double y = Math.pow(10,at/20);
                double te = Math.sqrt((in/ot));
                double te1 = Math.sqrt(in*ot);
                double r1 = (in*((y*y)-1))/((y*y)-(2*y*te)+1);
                double r2 = (te1*((y*y)-1))/(2*y);
                double r3 = (ot*((y*y)-1))/((y*y)-(2*y/te)+1);
                String.format("%.0f",r1);
                String.format("%.0f",r2);
                String.format("%.0f",r3);
                P1.setText(String.valueOf(r1));
                P2.setText(String.valueOf(r2));
                P3.setText(String.valueOf(r3));
            }
        });
    }
}