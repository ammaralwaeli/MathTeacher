package com.ammar.simplegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Operations extends AppCompatActivity {

    ListView simpleList;
    String List[] = {"Addition", "Subtraction", "Multiplication", "Divisiom"};
    int flags[] = {R.drawable.addi, R.drawable.sub, R.drawable.mul, R.drawable.div};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations);

    }

    public void adding(View v){
        Intent in=new Intent(Operations.this,Adding.class);
        in.putExtra("Operation",'+');
        startActivity(in);
    }

    public void sub(View v){
        Intent in=new Intent(Operations.this,Adding.class);
        in.putExtra("Operation",'-');
        startActivity(in);
    }

    public void mul(View v){
        Intent in=new Intent(Operations.this,Adding.class);
        in.putExtra("Operation",'*');
        startActivity(in);
    }

    public void div(View v){
        Intent in=new Intent(Operations.this,Adding.class);
        in.putExtra("Operation",'/');
        startActivity(in);
    }
}
