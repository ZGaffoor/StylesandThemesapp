package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void moneyGen(View view){
        EditText nameText = (EditText)findViewById(R.id.nameText);
        TextView result = (TextView)findViewById(R.id.result);
        int money = (int)(Math.random()*1000000) + 1;
        result.setText(nameText.getText().toString() + " has just won $" + money);
    }

    public void gamble(View view){
        EditText nameText = (EditText)findViewById(R.id.nameText);
        TextView result2 = (TextView)findViewById(R.id.result2);
        int newMoney = 0;
        result2.setText(nameText.getText().toString() + " has $" + newMoney + " and lost all their money :(");
    }

}