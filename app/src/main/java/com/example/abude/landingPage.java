package com.example.abude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class landingPage extends AppCompatActivity {
    private Button btn_keluar;
    private Button btn_tmbhbrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        btn_keluar = findViewById(R.id.btn_keluar);
        btn_tmbhbrg = findViewById(R.id.btn_tmbhbrg);

        btn_keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit();
            }
        });
        btn_tmbhbrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambah();
            }
        });
    }public void tambah(){
        startActivity(new Intent(landingPage.this, inputPage.class));
    }
    public void exit(){
        startActivity(new Intent(landingPage.this, loginActivity.class));
    }
}