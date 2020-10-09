package com.example.empty1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.io.LineNumberInputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static ArrayList<record> aL = new ArrayList<record>();
    final int numInt =(int) (1+(Math.random() * 100));
    public static final String EXTRA_MESSAGE = "Mensaje";
    int cont=0;
    int inputNum ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.toastButton);
        final EditText et = findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button


                inputNum = Integer.parseInt(et.getText().toString());

                cont++;

                if(inputNum==numInt){
                    Context context = getApplicationContext();
                    CharSequence text = "Eureka, El número era "+numInt+", "+cont+" intents totals";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    et.setText("");

                }else if(inputNum>numInt){
                    

                    Context context = getApplicationContext();
                    CharSequence text = "El numero donat es mes gran que el que es busca ";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    et.setText("");


                }else if(inputNum<numInt){
                    Context context = getApplicationContext();
                    CharSequence text = "El numero donat es mes petit que el que es busca ";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    et.setText("");
                }




            }
        });



}

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RankingActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        String message = String.valueOf(cont);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}

