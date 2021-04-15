package com.example.solidprinciple.ISP.fix;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* We create a custom class called MainTextWatcher.
 * And pass the interface here
 */

public class MainTextWatcher extends Activity {

    public TextWatcherWithInstance callback;


    public MainTextWatcher setCallback(TextWatcherWithInstance callback) {
        this.callback = callback;
        return this;
    }

    public MainTextWatcher registerEditText(final EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                callback.onTextChanged(editText, s, start, before, count);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        return this;
    }

}
