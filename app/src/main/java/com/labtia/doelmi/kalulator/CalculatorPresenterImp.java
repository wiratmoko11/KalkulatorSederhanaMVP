package com.labtia.doelmi.kalulator;

import android.util.Log;

/**
 * Created by LabTIA on 21/09/2016.
 */
public class CalculatorPresenterImp implements CalculatorPresenter {
    private CalculatorView calculatorView;
    private double hasil = 0;

    public CalculatorPresenterImp(CalculatorView calculatorView) {
        this.calculatorView = calculatorView;
    }

    @Override
    public void hitung(String angka1, String angka2, int op) {
        Log.v("angka 1", ""+angka1);
        Log.v("angka 2", ""+angka2);
        if(angka1 != null && angka2 != null){
            switch (op){
                case 1:
                    hasil = Double.parseDouble(angka1) + Double.parseDouble(angka2);
                    break;
                case 2:
                    hasil = Double.parseDouble(angka1) - Double.parseDouble(angka2);
                    break;
                case 3:
                    hasil = Double.parseDouble(angka1) * Double.parseDouble(angka2);
                    break;
            }
            Log.v("hasil", ""+hasil);
            calculatorView.showHasil(hasil);
        }
    }
}
