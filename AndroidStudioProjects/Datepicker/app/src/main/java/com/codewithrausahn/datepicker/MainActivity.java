package com.codewithrausahn.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.DateKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.view);
        datePicker = findViewById(R.id.date);
        button = findViewById(R.id.btn);
        textView.setText("automatic date:" + pickdate());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("select date:" + pickdate());
            }
        });

    }

    public String pickdate() {
        StringBuilder builder = new StringBuilder();
        builder.append((datePicker.getDayOfMonth() + "/"));
        builder.append((datePicker.getMonth() + 1 + "/"));
        builder.append((datePicker.getYear() ));
return builder.toString();
    }
}
