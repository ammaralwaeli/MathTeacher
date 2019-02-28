package com.ammar.simplegame;

import android.graphics.Color;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Choice extends AppCompatActivity {

    public float right,wr1,wr2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        int jj;
        TextView t = (TextView) findViewById(R.id.textView3);
        RadioButton r1 = (RadioButton) findViewById(R.id.radioButton), r2 = (RadioButton) findViewById(R.id.radioButton2), r3 = (RadioButton) findViewById(R.id.radioButton3);
        do {
            wr1 = new Random().nextInt(20);
            wr2 = new Random().nextInt(20);
        }while ((wr1==wr2)||(right==wr2)||(wr1==right));
        int x = new Random().nextInt(20), y = new Random().nextInt(20);

        switch (getIntent().getCharExtra("Operation", '+')) {
            case '+':
                t.setText(x + " +" + y + " = ");
                right = x + y;
                jj=new Random().nextInt(100);
                if(jj<33){
                    r1.setText(right+"");
                    r2.setText(wr1+"");
                    r3.setText(wr2+"");
                }
                else if(jj<66){
                    r1.setText(wr1+"");
                    r2.setText(right+"");
                    r3.setText(wr2+"");
                }else{
                    r1.setText(wr2+"");
                    r2.setText(wr1+"");
                    r3.setText(right+"");
                }
                break;
            case '*':
                t.setText(x + " * " + y + " = ");
                right = x * y;
                jj=new Random().nextInt(100);
                if(jj<33){
                    r1.setText(right+"");
                    r2.setText(wr1+"");
                    r3.setText(wr2+"");
                }
                else if(jj<66){
                    r1.setText(wr1+"");
                    r2.setText(right+"");
                    r3.setText(wr2+"");
                }else{
                    r1.setText(wr2+"");
                    r2.setText(wr1+"");
                    r3.setText(right+"");
                }
                break;
            case '/':
                t.setText(x + " / " + y + " = ");
                right = x / y;
                jj=new Random().nextInt(100);
                if(jj<33){
                    r1.setText(right+"");
                    r2.setText(wr1+"");
                    r3.setText(wr2+"");
                }
                else if(jj<66){
                    r1.setText(wr1+"");
                    r2.setText(right+"");
                    r3.setText(wr2+"");
                }else{
                    r1.setText(wr2+"");
                    r2.setText(wr1+"");
                    r3.setText(right+"");
                }
                break;
            case '-':
                t.setText(x + " - " + y + " = ");
                right = x - y;
                jj=new Random().nextInt(100);
                if(jj<33){
                    r1.setText(right+"");
                    r2.setText(wr1+"");
                    r3.setText(wr2+"");
                }
                else if(jj<66){
                    r1.setText(wr1+"");
                    r2.setText(right+"");
                    r3.setText(wr2+"");
                }else{
                    r1.setText(wr2+"");
                    r2.setText(wr1+"");
                    r3.setText(right+"");
                }
                break;
        }
        RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rr=(RadioButton)findViewById(checkedId);
                TextView text=(TextView)findViewById(R.id.textView);
                if(rr.getText().toString().equals(right+"")){
                    text.setText("Correct");
                    text.setTextColor(Color.GREEN);
                }
                else{
                    text.setText("Incorrect");
                    text.setTextColor(Color.RED);
                }
            }
        });
    }
}
