package com.example.projectseluler;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etUser = findViewById(R.id.etUsername);
        Button btnMasuk = findViewById(R.id.btnMasuk);

        btnMasuk.setOnClickListener(v -> {
            String nama = etUser.getText().toString();
            if (!nama.isEmpty()) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("USER_NAME", nama);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Masukkan Nama Dosen!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}