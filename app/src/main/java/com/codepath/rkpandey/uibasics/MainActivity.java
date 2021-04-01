package com.codepath.rkpandey.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textStranger;
    private EditText editTextUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.helloButton);
        btnHello.setOnClickListener(this);

        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Long pressed hello button", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        textStranger = findViewById(R.id.textStranger);
        editTextUser = findViewById(R.id.userName);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.helloButton:
                Toast.makeText(this, "Hello Button Clicked", Toast.LENGTH_LONG).show();
                textStranger.setText("Hello "+ editTextUser.getText().toString());
                break;
            default:
                break;

        }
    }
}