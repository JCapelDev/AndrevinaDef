package com.example.empty1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String num = "3";

        final Button button = findViewById(R.id.toastButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                final TextInputEditText tiet = findViewById(R.id.textInput1);
                if(tiet.getText().toString().contentEquals((String) num)){
                    Context context = getApplicationContext();
                    CharSequence text = "Eureka";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else{
                    
                    /*
                    Context context = getApplicationContext();
                    CharSequence text = "Numero incorrecte";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();


                     */
                }




            }
        });



}
}