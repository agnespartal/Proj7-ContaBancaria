package com.example.proj7_contabancaria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.proj7_contabancaria.model.ContaBancaria;
import com.example.proj7_contabancaria.model.ContaEspecial;
import com.example.proj7_contabancaria.model.ContaPoupanca;

public class MainActivity extends AppCompatActivity {

    private EditText txtSaque,txtDeposito;
    private TextView txtDados, txtSaida;
    private ContaBancaria conta;
    private Button btnSaque;
    private Button btnDeposito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RadioButton rbPoupanca = findViewById(R.id.rbPoupanca);

        RadioButton rbEspecial = findViewById(R.id.rbEspecial);

        rbPoupanca.setChecked(true);
        rbEspecial.setChecked(false);

        txtSaque = findViewById(R.id.txtSaque);
        txtDeposito = findViewById(R.id.txtDeposito);
        txtSaida = findViewById(R.id.txtSaida);
        txtDados = findViewById(R.id.txtDados);

        Button btnDados = findViewById(R.id.btnDados);
        btnDeposito = findViewById(R.id.btnDeposito);
        btnSaque = findViewById(R.id.btnSaque);

        btnDados.setOnClickListener(op -> MostrarDados());
        btnSaque.setOnClickListener(op -> RealizarSaque());
        btnDeposito.setOnClickListener(op -> RealizarDeposito());

        RadioGroup rgConta = findViewById(R.id.rgContaBnacaria);

        //txtSaque.setVisibility(View.GONE);
        //btnSaque.setVisibility(View.GONE);

        rbPoupanca.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                conta = new ContaPoupanca("Cliente", 123456789, 0, 1.5f);
            }
        });

        rbEspecial.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                conta = new ContaEspecial("Cliente", 987654321, 100, 500);
            }
        });

        rgConta.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.rbPoupanca) {
                txtDeposito.setVisibility(View.VISIBLE);
                btnDeposito.setVisibility(View.VISIBLE);
                txtSaque.setVisibility(View.GONE);
                btnSaque.setVisibility(View.GONE);
            } else if (checkedId == R.id.rbEspecial) {
                txtSaque.setVisibility(View.VISIBLE);
                btnSaque.setVisibility(View.VISIBLE);
                txtDeposito.setVisibility(View.GONE);
                btnDeposito.setVisibility(View.GONE);
            }
        });


    }

    private void RealizarDeposito() {
        float valor = Float.parseFloat(txtDeposito.getText().toString());
        String saida = conta.Depositar(valor);
        txtSaida.setText(saida);
    }

    private void RealizarSaque() {
        float valor = Float.parseFloat(txtSaque.getText().toString());
        String saida = conta.Sacar(valor);
        txtSaida.setText(saida);
    }

    private void MostrarDados() {
        txtDados.setText(conta.toString());
    }
}
