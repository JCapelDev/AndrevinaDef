package com.example.empty1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
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

       // TextView textView = findViewById(R.id.textView2);
//        textViewName.setText("Proba");
//        textViewTime.setText("0.0");
//        textViewPoints.setText("aL.get(i).getPoints()");
       // TableLayout tableLayout1 = (TableLayout)findViewById(R.id.tableLayout1);
      //  for (int i = 0; i < MainActivity.aL.size(); i++) {


//            textViewName.setText(aL.get(i).getName());
//            textViewTime.setText(aL.get(i).getTime().toString());
//            textViewPoints.setText(aL.get(i).getPoints().toString());
    //    }

        /*
        aL.add(message);

        for (String array:aL) {
            textView.setText(array);
        }

         */
        //make sure that the lists contain data or else display will be blank screen

        TableRow.LayoutParams  params1=new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT,1.0f);
        TableRow.LayoutParams params2=new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT);
        TableLayout tbl=(TableLayout) findViewById(R.id.tlMarksTable);

       for (int i = 0; i < MainActivity.aL.size() ; i++) {

            //Creating new tablerows and textviews
            TableRow row=new TableRow(this);
            TextView txt1=new TextView(this);
            TextView txt2=new TextView(this);
            TextView txt3=new TextView(this);
            //setting the text
            txt1.setText(aL.get(i).getName());
            txt2.setText(aL.get(i).getPoints().toString());
            txt3.setText(aL.get(i).getTime().toString());
            txt1.setLayoutParams(params1);
            txt2.setLayoutParams(params1);
            txt3.setLayoutParams(params1);
            //the textviews have to be added to the row created
            row.addView(txt1);
            row.addView(txt2);
            row.addView(txt3);
            row.setLayoutParams(params2);
            tbl.addView(row);
        }



    }


    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}