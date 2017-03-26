package com.example.android.phonebookdump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.name_text_view);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CallingDetails.class);

                //TODO : We will intent it to calling Activity
            }
        });

        Button dial = (Button) findViewById(R.id.call_Button);

        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO : We will take permission from calling API
            }
        });

        TextView number = (TextView) findViewById(R.id.number_text_view);


    }
}
