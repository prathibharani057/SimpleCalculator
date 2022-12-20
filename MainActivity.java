package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button
            button00, button0, button1, button2,
            button3, button4, button5, button6,
            button7, button8, button9, buttonAdd,
            buttonSub, buttonDivision, buttonMul, buttonpoint,
            buttonC, buttonAC, buttonEqual, buttonback;
    EditText tb1, tb2;
    TextView result;
    Double ValueOne, ValueTwo;
    boolean Addition, Subtract, Multiplication, Division;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button00 = (Button) findViewById(R.id.button00);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonpoint = (Button) findViewById(R.id.point);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonback = (Button) findViewById(R.id.back);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        tb1 = (EditText) findViewById(R.id.edt1);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    tb1.setText(tb1.getText() + "1");
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "2");
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "3");
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "4");
                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "5");
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "7");
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "8");
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "9");
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "0");
                }
            });

            button00.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null)
                        tb1.setText(" ");
                    else
                        tb1.setText(tb1.getText() + "00");
                }
            });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tb1 == null) {
                        tb1.setText("");
                    } else {
                        ValueOne = Double.parseDouble(tb1.getText() + "");
                        Addition = true;
                        tb1.setText(null);
                    }
                }
            });
            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Double.parseDouble(tb1.getText() + "");
                    Subtract = true;
                    tb1.setText(null);
                }
            });
            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Double.parseDouble(tb1.getText() + "");
                    Multiplication = true;
                    tb1.setText(null);
                }
            });
            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Double.parseDouble(tb1.getText() + "");
                    Division = true;
                    tb1.setText(null);
                }
            });
            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueTwo = Double.parseDouble(tb1.getText() + "");
                    if (Addition == true) {
                        tb1.setText(ValueOne + ValueTwo + "");
                        Addition = false;
                    }
                    if (Subtract == true) {
                        tb1.setText(ValueOne - ValueTwo + "");
                        Subtract = false;
                    }
                    if (Multiplication == true) {
                        tb1.setText(ValueOne * ValueTwo + "");
                        Multiplication = false;
                    }
                    if (Division == true) {
                        tb1.setText(ValueOne / ValueTwo + "");
                        Division = false;
                    }
                }
            });

            buttonback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String newstring = " ";
                    newstring = String.valueOf(tb1.getText());
                    int n = newstring.length();
                    newstring = newstring.substring(0, n - 1);
                    tb1.setText(newstring);
                }


            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tb1.setText("0");
                }
            });

            buttonAC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    tb1.setText("");

                }
            });


            buttonpoint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    tb1.setText(tb1.getText() + ".");
                }
            });


    }

}
