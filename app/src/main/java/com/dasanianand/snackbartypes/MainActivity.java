package com.dasanianand.snackbartypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button defaultSB, buttonSB, customSB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultSB = findViewById(R.id.defaultSB);
        buttonSB = findViewById(R.id.buttonSB);
        customSB = findViewById(R.id.customSB);

        defaultSB.setOnClickListener(this);
        buttonSB.setOnClickListener(this);
        customSB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.defaultSB:
                Snackbar.make(v, "This is Default SnackBar", Snackbar.LENGTH_SHORT).show();
                break;

            case R.id.buttonSB:
                Snackbar snackbar = Snackbar.make(v, "No Internet :(", Snackbar.LENGTH_SHORT);
                snackbar.setAction("retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retrying...", Toast.LENGTH_SHORT).show();
                    }
                }).show();

                break;

            case R.id.customSB:
                Snackbar snackbar1 = Snackbar.make(v, "This is Custom SnackBar", Snackbar.LENGTH_SHORT);
                snackbar1.setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retrying...", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar1.setBackgroundTint(getResources().getColor(R.color.teal_700));
                snackbar1.setActionTextColor(getResources().getColor(R.color.black));
                snackbar1.show();
                break;
        }
    }
}
