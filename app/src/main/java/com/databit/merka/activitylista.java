package com.databit.merka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activitylista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        TextView listaTextView = findViewById(R.id.datoText);

        if (getIntent().hasExtra("datos")) {
            String datos = getIntent().getStringExtra("datos");
            listaTextView.setText(datos);
        }
    }
}
