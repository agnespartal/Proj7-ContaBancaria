package com.example.proj7_contabancaria.model;

import androidx.annotation.NonNull;

public class ContaBancaria {

    public String cliente;
    public int num_conta;
    public float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String Sacar (float valor){

        if(valor > saldo){
            return "Valor a sacar não pode ser maior que o saldo em conta.";
        }
        else {
            saldo -= valor;
            return valor + " sacado com sucesso";
        }
    }

    public String Depositar(float valor){
        if (valor <= 0){
            return "Valor inválido";
        }
        else {
            saldo += valor;
            return "Depósito realizado. Saldo atual: " + saldo;
        }
    }

    @NonNull
    @Override
    public String toString() {
        return "Cliente: " + cliente + "\n Nº conta: " + num_conta + "\n Saldo: " + saldo;
    }
}
