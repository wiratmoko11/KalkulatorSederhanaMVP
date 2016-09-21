package com.labtia.doelmi.kalulator;

/**
 * Created by LabTIA on 21/09/2016.
 */
public class CalculatorPresenterImp implements CalculatorPresenter {
    private CalculatorView calculatorView;
    private double hasil = 0;
    private String op = null;

    @Override
    public void hitung(String angka1, String angka2) {
        if(angka1 != null && angka2 != null){
            switch (op){
                case "+":
                    hasil = Double.parseDouble(angka1) + Double.parseDouble(angka1);
                    break;
                case "-":
                    hasil = Double.parseDouble(angka1) - Double.parseDouble(angka1);
                    break;
                case "*":
                    hasil = Double.parseDouble(angka1) * Double.parseDouble(angka1);
                    break;
            }
            calculatorView.showHasil(hasil);
        }
    }
}
