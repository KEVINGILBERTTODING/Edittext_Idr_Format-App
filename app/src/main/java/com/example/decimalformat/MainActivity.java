package com.example.decimalformat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    EditText et_number;

    TextView tv_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_number = findViewById(R.id.edt_number);
        tv_value = findViewById(R.id.tv_value);


        et_number.addTextChangedListener(new MoneyTextWatcher(et_number));
        et_number.setText("0");
    }

    public void submit(View view) {
        BigDecimal value = MoneyTextWatcher.parseCurrencyValue(et_number.getText().toString());
        tv_value.setText(String.valueOf(value));
    }
}