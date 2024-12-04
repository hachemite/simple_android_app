package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextWatcher;
import android.widget.Toast;
import android.text.Editable;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find TextView by ID
        TextView helloText = findViewById(R.id.helloText);

        // Set a click listener
        helloText.setOnClickListener(view ->
                helloText.setText("Hachem hehe 😘😘")

        );

        // Find EditText and TextView by their IDs
        EditText editText = findViewById(R.id.textinput);
        TextView textView = findViewById(R.id.textoutput);
        Button button = findViewById(R.id.button);    // Replace with your Button ID
        CheckBox checkBox = findViewById(R.id.checkBox);


        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);//pour entrer
            startActivity(intent);

            String inputText = editText.getText().toString();

            textView.setText(inputText);
            if(inputText.length() >= 8) {
                Toast.makeText(getApplicationContext(), inputText, Toast.LENGTH_SHORT).show();
                checkBox.setChecked(true);

            }
            else {
                Toast.makeText(getApplicationContext(), "Input must be at least 8 characters", Toast.LENGTH_SHORT).show();
                checkBox.setChecked(false);

            }
        });


    }
}