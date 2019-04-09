package com.fordotosan.user.dynamicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCounter ;
    private TextView txtCounter ;
    private int counter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCounter = (Button) findViewById(R.id.btnCounter);
        txtCounter = findViewById(R.id.txtCounter);

        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("Benjamin Button","Button clicked") ;

                counter++ ;

                if(counter==5) {

                    Toast.makeText(getApplicationContext(),"Merhaba",Toast.LENGTH_LONG).show();
                }
                txtCounter.setText(String.valueOf(counter));

            }
        });

    }
}
