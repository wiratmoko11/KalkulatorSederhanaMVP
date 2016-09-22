package com.labtia.doelmi.kalulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorView {
    String angka ="";
    int op;
    double hasil = 0;

    CalculatorPresenter calculatorPresenter;

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
        calculatorPresenter = new CalculatorPresenterImp(this);

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

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDisplay(9);
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 1;
                clearDisplay();
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op != 0){
                    calculatorPresenter.hitung(""+hasil, angka, op);
                }
            }
        });
    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showHasil(double hasil) {
        display.setText(""+hasil);
    }

    @Override
    public void showDisplay(int angka) {
        this.angka = this.angka+""+angka;
        hasil = Double.parseDouble(this.angka);
        display.setText(this.angka);
    }

    @Override
    public void clearDisplay() {
        this.angka = "";
        display.setText("");
    }
}
