package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton ;
    RadioButton radioButton2 ;
    RadioGroup radioGroup2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioGroup3);
        textView= findViewById(R.id.textView2);
        radioGroup2=findViewById(R.id.radioGroup4);
    }
    public void ShowSelection(View view)
    {
        int checked=radioGroup.getCheckedRadioButtonId();
        int checked2=radioGroup2.getCheckedRadioButtonId();
        radioButton=findViewById(checked);
        radioButton2=findViewById(checked2);

        textView.setText(radioButton.getText()+" and "+radioButton2.getText());
    }

}