package com.example.proj7_contabancaria.model;

import androidx.annotation.NonNull;

public class ContaEspecial extends ContaBancaria{

    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public String Sacar(float valor) {
        if (valor > (saldo + limite)){
            return "Saldo insuficientes para saque.";
        }
        else{
            saldo = (saldo + limite) - valor;
            return "Saque realizado. Saldo atual: " + saldo;
        }
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + "\n Limite: " + limite;
    }
}
