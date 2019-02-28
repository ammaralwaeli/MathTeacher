package com.ammar.simplegame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        co = 0;

    }



    @Override
    public void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("Choose one of these");

        builder.setItems(listItemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int itemIndex) {
                // x=itemIndex;
                Toast.makeText(getApplicationContext(), listItemArr[itemIndex], Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, Operations.class);
                i.putExtra("Choice", itemIndex);
                startActivity(i);
            }
        });
        builder.setCancelable(true);
        builder.show();

    }

    final String listItemArr[] = {"Choice", "Quiz"};
    int co;
    Button alertDialogButton;

    private void showSimpleListItemsInAlertDialog() {

        alertDialogButton = (Button) findViewById(R.id.button);
        alertDialogButton.setOnClickListener(this);

    }
}
