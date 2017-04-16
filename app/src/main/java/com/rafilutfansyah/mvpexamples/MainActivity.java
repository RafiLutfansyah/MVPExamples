package com.rafilutfansyah.mvpexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ProsesView{

    EditText editTextAngka;
    Button buttonProses;
    TextView textViewHasil;

    ProsesPresenter prosesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAngka = (EditText) findViewById(R.id.edittext_angka);
        buttonProses = (Button) findViewById(R.id.button_proses);
        textViewHasil = (TextView) findViewById(R.id.textview_hasil);

        prosesPresenter = new ProsesPresenterImp(this);

        buttonProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesPresenter.proses(Integer.parseInt(editTextAngka.getText().toString()));
            }
        });
    }

    @Override
    public void bilanganGanjil() {
        textViewHasil.setText(editTextAngka.getText()+" adalah Bilangan Ganjil");
    }

    @Override
    public void bilanganGenap() {
        textViewHasil.setText(editTextAngka.getText()+" adalah bilangan Genap");
    }
}
