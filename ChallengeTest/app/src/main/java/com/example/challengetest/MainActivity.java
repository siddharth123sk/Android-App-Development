package com.example.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {

        TextView txtFirstName = findViewById(R.id.textViewFirstName);
        EditText edtTxtFirstName = findViewById(R.id.edtTextFirstName);
        String inputFirstName = edtTxtFirstName.getText().toString();
        txtFirstName.setText("First name: " + inputFirstName);



        TextView txtLastName = findViewById(R.id.textViewLastName);
        EditText edtTxtLastName = findViewById(R.id.edtTextLastName);
        String inputLastName = edtTxtLastName.getText().toString();
        txtLastName.setText("Last name: " + inputLastName);



        TextView txtEmail = findViewById(R.id.textViewEmail);
        EditText edtTxtEmail = findViewById(R.id.edtTextEmail);
        String inputEmail = edtTxtEmail.getText().toString();
        txtEmail.setText("Email: " + inputEmail);






    }

}