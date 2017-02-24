package com.ema.ema.emmy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView tr;
    Button t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView=(TextView) findViewById(R.id.programming_text_view);
         t=(Button)findViewById(R.id.shw);
        tr=(TextView)findViewById(R.id.ty);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tr.setText("WELCOME TO ANDROID STUDIO");

            }
        });
    }


}
