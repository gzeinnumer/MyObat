package com.gzeinnumer.myobat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InsertDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        TextView textView = findViewById(R.id.textview);
        EditText editText = findViewById(R.id.editTex);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //you add code
                Toast.makeText(getApplicationContext(), "Data ditambah", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
