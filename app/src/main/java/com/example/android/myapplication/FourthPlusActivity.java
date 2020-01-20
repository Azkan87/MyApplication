package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class FourthPlusActivity extends AppCompatActivity {
    private EditText mEditText;
    private ImageButton mBackSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("ADD POINTS");
        mEditText = findViewById(R.id.editTxtActivity);



        //implementing backspace button

        mBackSpace = findViewById(R.id.backSpaceButton);
        mBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = mEditText.getText().toString();
                if (str.length() > 0) {
                    str = str.substring(0, str.length() - 1);
                    mEditText.setText(str);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i3 = new Intent();
        i3.putExtra("message3", mEditText.getText().toString());
        setResult(RESULT_OK, i3);
        Toast.makeText(this, "back key is pressed", Toast.LENGTH_SHORT).show();
        finish();

    }

}

