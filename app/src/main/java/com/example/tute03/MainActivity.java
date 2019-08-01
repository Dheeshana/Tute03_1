package com.example.tute03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NUMBER_1 = "1";
    public static final String NUMBER_2 = "2";

    private EditText num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
    }

    public void onClick(View view){
        String no1 = num1.getText().toString();
        String no2 = num2.getText().toString();

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(NUMBER_1, no1);
        intent.putExtra(NUMBER_2, no2);

        startActivity(intent);
    }
}
