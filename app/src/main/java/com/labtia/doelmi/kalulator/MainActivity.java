package com.labtia.doelmi.kalulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorView {
    private TextView display;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;

    private Button btnKali;
    private Button btnTambah;
    private Button btnKurang;

    private Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisilisasi view
        display  = (TextView)findViewById(R.id.display);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        //btn0 = (Button)findViewById(R.id.btn0);
        btnKali = (Button)findViewById(R.id.btnKali);
        btnTambah = (Button)findViewById(R.id.btnTambah);
        btnKurang = (Button)findViewById(R.id.btnKurang);
        btnHitung = (Button)findViewById(R.id.btnHitung);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(1);
            }
        });
    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showHasil(double hasil) {

    }

    @Override
    public void showDisplay(int angka) {
        display.setText(angka);
    }
}
