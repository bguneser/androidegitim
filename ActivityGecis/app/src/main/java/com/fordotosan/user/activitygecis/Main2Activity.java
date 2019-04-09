package com.fordotosan.user.activitygecis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    TextView txtName ;
    TextView txtAge ;
    TextView txtMarried ;

    Button btnVeriGoster ;

    Employee e1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtName = findViewById(R.id.txtName) ;
        txtAge = findViewById(R.id.txtAge) ;
        txtMarried = findViewById(R.id.txtMarried) ;

        btnVeriGoster=findViewById(R.id.btnVeriGoster);

        String name = getIntent().getStringExtra("name") ;
        int age = getIntent().getIntExtra("age",0) ;
        boolean married = getIntent().getBooleanExtra("married" ,false);

        txtName.setText(name);
        txtAge.setText(String.valueOf(age));
        txtMarried.setText(String.valueOf(married));



        e1= (Employee) getIntent().getSerializableExtra("emp");

      btnVeriGoster.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(btnVeriGoster==view) {

            txtName.setText(e1.getName());
            txtAge.setText(String.valueOf(e1.getAge()));

            Intent i = new Intent(this,Main3Activity.class);
            startActivity(i);

        }
    }
}
