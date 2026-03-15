package com.example.projectseluler;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvDosen = findViewById(R.id.tvDosen);
        TextView tvRingkasan = findViewById(R.id.tvRingkasan);
        TextView tvHasilLoop = findViewById(R.id.tvHasilLoop);
        Button btnKembali = findViewById(R.id.btnKembali);

        // 1. Terima Data dari MainActivity
        String namaDosen = getIntent().getStringExtra("DOSEN_NAME");
        String jumlahStr = getIntent().getStringExtra("TOTAL_ROWS");
        String rataNilai = getIntent().getStringExtra("AVG_SCORE");

        int jumlah = Integer.parseInt(jumlahStr);
        double nilai = Double.parseDouble(rataNilai);

        String statusKelas;
        if (nilai >= 80) {
            statusKelas = "Sangat Baik";
        } else if (nilai >= 60) {
            statusKelas = "Cukup";
        } else {
            statusKelas = "Perlu Perhatian";
        }

        String ringkasan = "=== Ringkasan Data ===\n" +
                "Jumlah Mahasiswa : " + jumlah + "\n" +
                "Rata-rata Nilai : " + rataNilai + "\n" +
                "Status Kelas : " + statusKelas;
        tvRingkasan.setText(ringkasan);

        StringBuilder hasil = new StringBuilder("Daftar Absen:\n");
        for (int i = 1; i <= jumlah; i++) {
            hasil.append("Mahasiswa ").append(i).append(" : ..........\n");
        }
        tvHasilLoop.setText(hasil.toString());

        btnKembali.setOnClickListener(v -> finish());
    }
}