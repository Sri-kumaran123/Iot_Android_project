package com.example.iot;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;




public class MainActivity extends AppCompatActivity {

    private EditText ipxx1;
    private static Button led;

    public static String texr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        led=(Button) findViewById(R.id.click);
        ipxx1=(EditText) findViewById(R.id.ipadd);

        led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texr=ipxx1.getText().toString();
                Intent ht1 = new Intent(MainActivity.this,LED_activity.class);
                startActivity(ht1);
            }
        });
    }
}