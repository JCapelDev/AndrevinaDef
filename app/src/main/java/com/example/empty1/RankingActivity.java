package com.example.empty1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import static com.example.empty1.MainActivity.aL;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        this.setTitle("Ranking");
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text

        TextView textView = findViewById(R.id.textView2);
//        textViewName.setText("Proba");
//        textViewTime.setText("0.0");
//        textViewPoints.setText("aL.get(i).getPoints()");
        TableLayout tableLayout1 = (TableLayout)findViewById(R.id.tableLayout1);
        for (int i = 0; i < MainActivity.aL.size(); i++) {


//            textViewName.setText(aL.get(i).getName());
//            textViewTime.setText(aL.get(i).getTime().toString());
//            textViewPoints.setText(aL.get(i).getPoints().toString());
        }

        /*
        aL.add(message);

        for (String array:aL) {
            textView.setText(array);
        }

         */



    }
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}