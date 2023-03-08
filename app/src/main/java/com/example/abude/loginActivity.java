package com.example.abude;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                open();
            }
        });
    }
    public void open(){
        startActivity(new Intent(loginActivity.this, landingPage.class));
    }
}