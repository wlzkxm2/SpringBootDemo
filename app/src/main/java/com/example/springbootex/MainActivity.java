package com.example.springbootex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button join_btn, login_btn;

    EditText id_edit, pw_edit;

    View.OnClickListener cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        join_btn = (Button) findViewById(R.id.join_btn);
        login_btn = (Button) findViewById(R.id.login_btn);

        id_edit = (EditText) findViewById(R.id.id_edit);
        pw_edit = (EditText) findViewById(R.id.pw_edit);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.join_btn:
                        Intent intent = new Intent(MainActivity.this, join.class);
                        startActivity(intent);
                        finish();
                        break;

                    case R.id.login_btn:
                        Intent intent2 = new Intent(MainActivity.this, login.class);
                        startActivity(intent2);
                        finish();
                        break;
                }
            }
        };

        join_btn.setOnClickListener(cl);
        login_btn.setOnClickListener(cl);
    }

}