package com.example.aprilandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    EditText edtmobileNo, edtpassword;
    Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        edtmobileNo = findViewById(R.id.edtmobileNo);
        edtpassword = findViewById(R.id.edtpassword);
        button = findViewById(R.id.btnlogin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mobileNo = edtmobileNo.getText().toString();
                String password = edtpassword.getText().toString();
                if (mobileNo.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Details",Toast.LENGTH_SHORT).show();
                }
                else if (mobileNo.length() != 10)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Valid Mobile No",Toast.LENGTH_SHORT).show();
                }
                else if (mobileNo.equals("9876543210") && password.equals("12345"))
                {
                    Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(intent);
                   // Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}