package com.example.empty1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import static com.example.empty1.MainActivity.aL;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        final Button b = findViewById(R.id.btnBack);
        final ListView l = findViewById(R.id.lstRanking);

        ArrayAdapter<record> adapter = new ArrayAdapter<record>(this, R.layout.lst_item, MainActivity.aL) {
            @Override
            public View getView(int pos, View convertView, ViewGroup container)
            {
                if( convertView==null ) {
                    convertView = getLayoutInflater().inflate(R.layout.lst_item, container, false);
                }
                ((TextView) convertView.findViewById(R.id.txtvName)).setText(getItem(pos).getName());
                ((TextView) convertView.findViewById(R.id.txtvScore)).setText(("Intents: " + getItem(pos).getPoints()));
                ((ImageView) convertView.findViewById(R.id.imageView)).setImageURI(getItem(pos).getFileUri());
                return convertView;
            }
        };

        l.setAdapter(adapter);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RankingActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

}