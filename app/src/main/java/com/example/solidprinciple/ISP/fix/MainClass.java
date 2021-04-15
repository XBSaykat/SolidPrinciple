package com.example.solidprinciple.ISP.fix;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.solidprinciple.R;

public class MainClass extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = new EditText(this);

        MainTextWatcher mainTextWatcher= new MainTextWatcher();

        /*
         * We can call this class from our Activity/Fragment like this:
         * This only has one method, which we are using in the app
         */
        mainTextWatcher.registerEditText(editText).setCallback(new TextWatcherWithInstance() {
            @Override
            public void onTextChanged(EditText editText, CharSequence s, int start, int before, int count) {

            }
        });

    }


}
