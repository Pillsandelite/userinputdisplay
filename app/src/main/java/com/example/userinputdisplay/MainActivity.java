package com.example.userinputdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtAge;
    TextView display;
    Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.name);
        txtAge = findViewById(R.id.age);

        display = findViewById(R.id.tvDisplay);
        btnDisplay = findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtName.getText().toString().isEmpty() || txtAge.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                }else{
                    String name = txtName.getText().toString();
                    String age = txtAge.getText().toString();
                    display.setText(name + "\n" + age);
                }
            }
        });
    }
}