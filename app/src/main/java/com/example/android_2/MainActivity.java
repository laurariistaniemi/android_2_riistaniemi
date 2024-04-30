package com.example.android_2;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    //the start  that comes with all projects
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
    }

    //method that listens when the button has been clicked, it does the onClick method, and
    //does the updateresults method, where the text is altered
    public void ButtonPress(View v) {

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateResults();
                }
        });
    }


    //method where the method finds the input name that user has given, and with it
    //gives the automatic text vappu before the new, making a new vappu name
    //the birthmonth is there to just be an extra input and to kindly confuse the user
    public void UpdateResults() {
        try {
            //i knowingly have variables here that are not being used
            //it was just to make it more clear to me what i wanted to use
            EditText tvInput_Name = findViewById(R.id.tvInput_Name);
            EditText tvInput_Month = findViewById(R.id.tvInput_Month);
            TextView tvName = findViewById(R.id.tvName);
            TextView tvMonth = findViewById(R.id.tvMonth);
            TextView tvResults_Text = findViewById(R.id.tvResults_Text);
            TextView tvNew_name = findViewById(R.id.tvNew_Name);
            //join the automatic text vappu and users name together in a string
            String strResults = "VAPPU" + tvInput_Name.getText().toString();
            //add that name to the textview new name
            tvNew_name.append(strResults);
            tvNew_name.setText(strResults);

            //exception catch
        } catch (NumberFormatException e) {
            return;
        }
    }

    //class i originally used for the updateResults method, but it turned out to not be useful
    //i still wanted to it show here that i know what it is
    /*
    public class TextChange implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {}

        @Override
        public void afterTextChanged(Editable s) { UpdateResults();}
    }

     */
}