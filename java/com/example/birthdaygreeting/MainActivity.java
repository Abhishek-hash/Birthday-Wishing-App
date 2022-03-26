package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.birthdaygreeting.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createBirthdayCard(View view) {

        // TO GET THE name FROM EDITTEXT BOX.
        EditText name =  findViewById(R.id.enter_name);

        // TO SHOW A TOAST MSG HAVING name
       // Toast.makeText(this, "Your name is: "+name.getText().toString(), Toast.LENGTH_SHORT).show();

        // BUILD AN INTENT
        Intent intent = new Intent(MainActivity.this, BirthdayGreetingActivity.class);
        String message = name.getText().toString();

        // PASS THE name TO THIS INTENT
        intent.putExtra(EXTRA_MESSAGE,message);

        // TO JUMP TO A NEW ACTIVITY FROM MainActivity
        startActivity(intent);
    }
}