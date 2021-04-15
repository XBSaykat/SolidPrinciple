package com.example.solidprinciple.ISP.violation;


import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.solidprinciple.R;

/*
 * There are 3 methods to the TextWatcher interface.
 * But in most scenarios we need to use only one method.
 * This means ideally the remaining two methods have no use and should
 * not be part of the interface. This is in violation of the ISP principle
 */
public class MainClass extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = new EditText(this);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                /* In most of the scenarios this is the only method we use. The other methods are pointless in these cases. */
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


}
