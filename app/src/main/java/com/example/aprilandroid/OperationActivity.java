package com.example.aprilandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OperationActivity extends AppCompatActivity {
    EditText edno1,edno2;
    Button btnadd;
    TextView tvresult;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_operation);
        edno1=findViewById(R.id.edtno1);
        edno2=findViewById(R.id.edtno2);
        btnadd=findViewById(R.id.btnadd);
        tvresult=findViewById(R.id.tvresult);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no1=edno1.getText().toString();
                String no2=edno2.getText().toString();
                String result=add(no1,no2);
                tvresult.setText(result);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public String add(String no1,String no2){
        int num1=Integer.parseInt(no1);
        int num2=Integer.parseInt(no2);
        int result=num1+num2;
        return String.valueOf(result);
    }
}