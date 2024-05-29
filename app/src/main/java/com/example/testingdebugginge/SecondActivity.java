package com.example.testingdebugginge;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private EditText angkaPertama;
    private EditText angkaKedua;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        angkaPertama = findViewById(R.id.angkapertama);
        angkaKedua = findViewById(R.id.angkakedua);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        hasilTextView = findViewById(R.id.hasil);

        btnSubmit.setOnClickListener(v -> hitungDanTampilkanHasil());
    }
    public void hitungDanTampilkanHasil() {
        String angkaPertamaStr = angkaPertama.getText().toString();
        String angkaKeduaStr = angkaKedua.getText().toString();

        int angkaPertama = Integer.parseInt(angkaPertamaStr);
        int angkaKedua = Integer.parseInt(angkaKeduaStr);

        int hasil = hitung(angkaPertama, angkaKedua);
        hasilTextView.setText("Hasil: " + hasil);
    }

    public int hitung(int a, int b){
        return a + b;
    }

}