package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.annotation.SuppressLint;
import android.nfc.Tag;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1 , num2;
    View add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.e("sctivity Lifecyce", "create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.editTextTextPersonName5);
        num2 = findViewById(R.id.editTextTextPersonName7);
        add = findViewById(R.id.button3);

        add.setOnClickListener( view -> {
            Intent in=new Intent(MainActivity.this,Activity2.class);
            startActivity(in);

        });
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "OnStart MyActivity", Toast.LENGTH_SHORT).show();
        Log.e("sctivity Lifecyce", "start");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "OnStop MyActivity", Toast.LENGTH_SHORT).show();
        Log.e("sctivity Lifecyce", "stop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "OnPause MyActivity", Toast.LENGTH_SHORT).show();

        Log.e("sctivity Lifecyce", "pause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "OnResume MYActivity", Toast.LENGTH_SHORT).show();
        Log.e("sctivity Lifecyce", "resume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.e("sctivity Lifecyce", "destory ");
        Toast.makeText(this, "onDestroy phase MainActivity", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}







