package com.example.solidprinciple.ISP.fix;

import android.widget.EditText;

/* We create an interface with one method  */
public interface TextWatcherWithInstance {
    void onTextChanged(EditText editText, CharSequence s, int start, int before, int count);
}
