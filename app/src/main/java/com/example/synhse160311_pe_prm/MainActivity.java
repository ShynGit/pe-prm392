package com.example.synhse160311_pe_prm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button nhanVienBtn;
    private Button phongBanBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nhanVienBtn = findViewById(R.id.btn_nhanvien);
        phongBanBtn = findViewById(R.id.btn_phongban);

        nhanVienBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NhanVienActivity.class);
                startActivity(intent);
            }
        });

        phongBanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PhongBanActivity.class);
                startActivity(intent);
            }
        });
    }
}