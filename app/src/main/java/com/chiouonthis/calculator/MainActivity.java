package com.chiouonthis.calculator;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private Button btnClear;
    private TextView textResult;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        textResult = (TextView) findViewById(R.id.textResult);
        btnClear = (Button) findViewById(R.id.btnClear);


        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 + oper2;

                    textResult.setText(Double.toString(theResult));
                }else {
                    Toast.makeText(MainActivity.this,"Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
            }
            }
        });



        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());
                double theResult = oper1 - oper2;

                textResult.setText(Double.toString(theResult));
                }else {
                    Toast.makeText(MainActivity.this,"Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });


        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());
                double theResult = oper1 / oper2;

                textResult.setText(Double.toString(theResult));
            }else {
                Toast.makeText(MainActivity.this,"Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
            }
            }
        });



        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());
                double theResult = oper1 * oper2;

                textResult.setText(Double.toString(theResult));
        }else {
            Toast.makeText(MainActivity.this,"Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
        }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                textResult.setText("0.0");
                operand1.requestFocus();
            }
        });

    }

    }
