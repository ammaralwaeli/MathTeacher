package com.ammar.simplegame;

import android.content.Intent;
import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Adding extends AppCompatActivity {

    EditText n1, n2, r;
    TextView text;
    char op;
    int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);
        Intent in = getIntent();
        op = in.getCharExtra("Operation", '+');
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        r = (EditText) findViewById(R.id.r);
        TextView ope = (TextView) findViewById(R.id.Op);
        ope.setText(op + "");
        int nu1 = new Random().nextInt(20), nu2 = new Random().nextInt(20);
        n1.setText(nu1 + "");
        n2.setText(nu2 + "");
        switch (op) {
            case '+':
                res = (Integer.parseInt(n1.getText().toString())) + Integer.parseInt(n2.getText().toString());
                break;
            case '*':
                res = (Integer.parseInt(n1.getText().toString())) * Integer.parseInt(n2.getText().toString());
                break;
            case '-':
                res = (Integer.parseInt(n1.getText().toString())) - Integer.parseInt(n2.getText().toString());
                break;
            case '/':
                res = (Integer.parseInt(n1.getText().toString())) / Integer.parseInt(n2.getText().toString());
                break;
        }
    }

    public void submit(View v) {
        res=getResult();
        text = (TextView) findViewById(R.id.textView5);
        if (r.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Please Enter number", Toast.LENGTH_LONG).show();
            return;
        } else {
            if (res == Integer.parseInt(r.getText().toString())) {
                text.setTextColor(Color.GREEN);
                text.setText("Correct");
            } else {
                if (res > Integer.parseInt(r.getText().toString())) {
                    text.setTextColor(Color.RED);
                    text.setText("The Correct Number is Greater Than "+r.getText().toString());
                }
                else {
                    text.setTextColor(Color.RED);
                    text.setText("The Correct Number is Less Than "+r.getText().toString());
                }
            }
        }
    }

    public int getResult(){
        switch (op) {
            case '+':
                res = (Integer.parseInt(n1.getText().toString())) + Integer.parseInt(n2.getText().toString());
                break;
            case '*':
                res = (Integer.parseInt(n1.getText().toString())) * Integer.parseInt(n2.getText().toString());
                break;
            case '-':
                res = (Integer.parseInt(n1.getText().toString())) - Integer.parseInt(n2.getText().toString());
                break;
            case '/':
                res = (Integer.parseInt(n1.getText().toString())) / Integer.parseInt(n2.getText().toString());
                break;
        }
        return res;
    }
}
