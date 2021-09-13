package com.example.agrocraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
    }
    
    public  void buyer (View view ){
        Toast toast = Toast.makeText(this, "buyer", Toast.LENGTH_LONG);
        toast.show();
        Intent intent = new Intent(this,buyerlogin.class);
        startActivity(intent);
    }

    public  void farmer (View view ){
        Toast toast = Toast.makeText(this, "farmer", Toast.LENGTH_LONG);
        toast.show();    }
}
