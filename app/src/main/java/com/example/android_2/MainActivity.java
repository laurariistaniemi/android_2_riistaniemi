package com.example.android_2;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });


        Button button = (Button) findViewById(R.id.button);
        //button.setOnClickListener(v -> UpdateResults());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void ButtonPress(View v) {
        //TextView tvResults_Text = (TextView) findViewById(R.id.tvResults_Text);

    }

        //final EditText tvInput_Name = (EditText) findViewById(R.id.tvInput_Name);
        //final EditText tvInput_Month = (EditText) findViewById(R.id.tvInput_Month);
        //final String strResults = (String) findViewById(R.id.tvResults_Text);




    public class TextChange implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
        }


        public void UpdateResults() {
            try {
                EditText tvInput_Name = findViewById(R.id.tvInput_Name);
                EditText tvInput_Month = findViewById(R.id.tvInput_Month);
                EditText tvResults_Text = findViewById(R.id.tvResults_Text);


                //String strInput_Name = getString(R.string.kerro_nimesi);
                //String strInput_Month = getString(R.string.kerro_syntym_kuukautesi);
                String strResults = tvInput_Name.getText().toString() + tvInput_Month.getText().toString();
                //EditText tvResults_Text = strResults.toString();
                //tvResults_Text += strResults;
                tvResults_Text.setText(strResults);
                //EditText tvResults_Text = strResults.getText().getString();

            } catch (NumberFormatException e) {
                return;
            }
        }

    }
    public class TextChangeImpl extends TextChange {
        @Override
        public void UpdateResults() {
            super.UpdateResults();
        }
    }



}