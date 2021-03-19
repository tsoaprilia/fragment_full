package com.example.viewmodel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HalammanUtama extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button pindah = findViewById(R.id.btn_satu1);
        pindah.setOnClickListener(this);

        Button pindah2 = findViewById(R.id.btn_satu2);
        pindah2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_satu1:
                Intent pindah = new Intent(HalammanUtama.this, MainActivity.class);
                startActivity(pindah);
                break;
            case R.id.btn_satu2:
                Intent pindah2 = new Intent(HalammanUtama.this, MainActivity2.class);
                startActivity(pindah2);
                break;
        }
    }
}
