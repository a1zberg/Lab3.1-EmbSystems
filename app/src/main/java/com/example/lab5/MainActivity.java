package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView narutoHello;
   private EditText getText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        narutoHello = findViewById(R.id.textView);
        getText = findViewById(R.id.editText);
        };

    public void onClick(View view) {
        if(getText.getText().length() == 0) narutoHello.setText("Input the odd number.");
        else{
        narutoHello.setText(Calculation.Ferma(String.valueOf(getText.getText())));
        }
    }
}
