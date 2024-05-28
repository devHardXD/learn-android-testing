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

        // Inisialisasi view
        angkaPertama = findViewById(R.id.angkapertama);
        angkaKedua = findViewById(R.id.angkakedua);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        hasilTextView = findViewById(R.id.hasil);

        // Set onClickListener untuk button submit
        btnSubmit.setOnClickListener(v -> hitungDanTampilkanHasil());
    }

    // Method untuk melakukan penjumlahan dan menampilkan hasilnya
    public void hitungDanTampilkanHasil() {
        // Ambil nilai dari EditText
        String angkaPertamaStr = angkaPertama.getText().toString();
        String angkaKeduaStr = angkaKedua.getText().toString();

        // Konversi nilai dari string ke integer
        int angkaPertama = Integer.parseInt(angkaPertamaStr);
        int angkaKedua = Integer.parseInt(angkaKeduaStr);

        // Penjumlahan
        int hasil = hitung(angkaPertama, angkaKedua);

        // Tampilkan hasil
        hasilTextView.setText("Hasil: " + hasil);
    }

    public int hitung(int a, int b){
        return a + b;
    }

}