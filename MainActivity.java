package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.et1);
        e2= (EditText) findViewById(R.id.et2);
        textView= (TextView) findViewById(R.id.tv1);
    }


    public void addition(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int c=a+b;
        textView.setText(""+c);
    }

    public void diff(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int c=a-b;
        textView.setText(""+c);
    }

    public void multi(View view) {int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int c=a*b;
        textView.setText(""+c);
    }

    public void divide(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int c=a/b;
        textView.setText(""+c);
    }

    public void modulus(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int c=a%b;
        textView.setText(""+c);
    }
}