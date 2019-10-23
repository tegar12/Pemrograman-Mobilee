package com.example.myviewandviews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonatActivity extends AppCompatActivity {
    private Button btr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donat);

        btr = findViewById(R.id.cukk);
        btr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showDialog();

        }
    });
}
private void showDialog() {
    AlertDialog.Builder alarm = new AlertDialog.Builder(this);
    alarm.setTitle("Terimkasih Cuy Donasimu Sangaat berguna");
    alarm

            .setMessage("Matursuwun Donasine Bos")
            .setIcon(R.drawable.logo)
            .setCancelable(false)
            .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    DonatActivity.this.finish();
                }
            })
            .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
    AlertDialog alerm = alarm.create();
    alerm.show();
}
}
