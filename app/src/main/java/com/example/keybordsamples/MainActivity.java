package com.example.keybordsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextMain ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMain = (EditText) findViewById(R.id.editText_main);
    }

    public void showText(View view) {
        if (editTextMain.getText() != null){
            Toast.makeText(this,editTextMain.getText().toString(),Toast.LENGTH_SHORT).show();
        }

    }
}