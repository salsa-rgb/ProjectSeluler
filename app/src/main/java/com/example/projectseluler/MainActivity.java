package com.example.projectseluler;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvSapaan = findViewById(R.id.tvSapaan);
        EditText etJumlah = findViewById(R.id.etJumlahMahasiswa);
        EditText etNilai = findViewById(R.id.etRataNilai);
        Button btnProses = findViewById(R.id.btnProses);

        String namaDosen = getIntent().getStringExtra("USER_NAME");
        if (namaDosen != null)


        btnProses.setOnClickListener(v -> {
            String jumlahStr = etJumlah.getText().toString();
            String nilaiStr = etNilai.getText().toString();

            if (jumlahStr.isEmpty() || nilaiStr.isEmpty()) {
                Toast.makeText(MainActivity.this, "Mohon isi semua data!", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("DOSEN_NAME", namaDosen);
                intent.putExtra("TOTAL_ROWS", jumlahStr);
                intent.putExtra("AVG_SCORE", nilaiStr);
                startActivity(intent);
            }
        });
    }
}