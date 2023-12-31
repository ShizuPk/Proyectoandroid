package com.databit.merka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultadoText = findViewById(R.id.resultadoText);
        EditText editText = findViewById(R.id.textproducto);
        Button button = findViewById(R.id.button);
        Button botonlimpiar = findViewById(R.id.button2);

        botonlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                resultadoText.setText("");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String datos = editText.getText().toString();


                Intent intent = new Intent(MainActivity.this, activitylista.class);
                intent.putExtra("datos", datos);
                startActivity(intent);
            }
        });
    }
}
