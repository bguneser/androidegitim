package com.fordotosan.user.activitygecis;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    Button btnGecis ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("A oncreate","A on create'e giriyor");

        btnGecis = findViewById(R.id.btn2activitygecis);

        btnGecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                intent.putExtra("name","Birgun");
                intent.putExtra("age",30) ;
                intent.putExtra("married",true);

                Employee e1 = new Employee("Efe",28) ;

                intent.putExtra("emp",e1) ;

                startActivity(intent);

            }
        });
    }

    @Override
    public void onBackPressed() {

      super.onBackPressed();



    }
}
