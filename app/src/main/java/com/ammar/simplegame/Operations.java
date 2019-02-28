package com.ammar.simplegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Operations extends AppCompatActivity {

    ListView simpleList;
    String List[] = {"Addition", "Subtraction", "Multiplication", "Division"};
    int flags[] = {R.drawable.addi, R.drawable.sub, R.drawable.mul, R.drawable.div};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations);
        Toast.makeText(getApplicationContext(), getIntent().getStringExtra("Choice"), Toast.LENGTH_LONG).show();
    }

    public void adding(View v){
        Intent in=null;
        switch (getIntent().getIntExtra("Choice",0)){
            case 0:
                in=new Intent(Operations.this, Choice.class);
                in.putExtra("Operation",v.getTag().toString().charAt(0));
                break;
            case 1:
                in=new Intent(Operations.this, Quiz.class);
                in.putExtra("Operation",v.getTag().toString().charAt(0));
                break;
            case 2:
                in=new Intent(Operations.this, Quiz.class);
                in.putExtra("Operation",v.getTag().toString().charAt(0));
                break;
            case 3:
                in=new Intent(Operations.this, Choice.class);
                in.putExtra("Operation",'c');
                break;
        }
        startActivity(in);

    }

}
