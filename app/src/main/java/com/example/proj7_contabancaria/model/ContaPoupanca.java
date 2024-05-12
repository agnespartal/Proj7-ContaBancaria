package com.example.proj7_contabancaria.model;

import androidx.annotation.NonNull;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria{

    private float diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, float diaRendimento){
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public String NovoSaldo(float diaRendimento){

        saldo += saldo * (diaRendimento/100);
        return "Novo saldo: " + saldo;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + "\n Rendimento: " + diaRendimento + "%";
    }
}
