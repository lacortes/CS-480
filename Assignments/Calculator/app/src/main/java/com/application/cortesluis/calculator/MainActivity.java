package com.application.cortesluis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.TypedValue;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button  zeroButton,
                    oneButton,
                    twoButton,
                    threeButton,
                    fourButton,
                    fiveButton,
                    sixButton,
                    sevenButton,
                    eightButton,
                    nineButton,
                    clearButton,
                    divideButton,
                    multiplyButton,
                    subtractButton,
                    addButton,
                    equalsButton;

    private TextView answerTextView;
    private float answer = 0;
    private boolean isClear, isDivide, isMultiply, isSubtract, isAdd, isEquals;
    private boolean operatorPressed = false;

    private boolean leadingZero = true; // By default a zero will be displayed to the answer window

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerTextView = (TextView) findViewById(R.id.answer_text_view);

        zeroButton = (Button) findViewById(R.id.zero_button);
        oneButton = (Button) findViewById(R.id.one_button);
        twoButton = (Button) findViewById(R.id.two_button);
        threeButton = (Button) findViewById(R.id.three_button);
        fourButton = (Button) findViewById(R.id.four_button);
        fiveButton = (Button) findViewById(R.id.five_button);
        sixButton = (Button) findViewById(R.id.six_button);
        sevenButton = (Button) findViewById(R.id.seven_button);
        eightButton = (Button) findViewById(R.id.eight_button);
        nineButton = (Button) findViewById(R.id.nine_button);
        clearButton = (Button) findViewById(R.id.ac_button);
        divideButton  = (Button) findViewById(R.id.division_button);
        multiplyButton = (Button) findViewById(R.id.multiplication_button);
        subtractButton = (Button) findViewById(R.id.subtraction_button);
        addButton = (Button) findViewById(R.id.addition_button);
        equalsButton = (Button) findViewById(R.id.equals_button);

        /*  Answer Window   */
        answerTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (s.toString().trim().length() > 8 && s.toString().trim().length() < 12) {
                    changeTextSizeSmaller();
                }  else if (s.toString().trim().length() <= 8 ) {
                    changeTextSizeDefault();
                    setNumberButtonsEnabled(true);
                } else if (s.toString().trim().length() >= 12) {
                    setNumberButtonsEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        /*  Number Buttons  */
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(zeroButton.getText());

            }
        });

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(oneButton.getText());

            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(twoButton.getText());

            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(threeButton.getText());

            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(fourButton.getText());

            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(fiveButton.getText());

            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(sixButton.getText());
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(sevenButton.getText());
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(eightButton.getText());
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLeadingZero();
                updateAnswerView(nineButton.getText());
            }
        });

        /*  Arithmetic Buttons  */

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateAnswerView("0");
                leadingZero = true;
                answer = 0.00f;
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPressed = true;
                answer += Float.parseFloat(answerTextView.getText().toString());

            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    private void clearLeadingZero() {
        if (leadingZero)
            answerTextView.setText("");
        leadingZero = false;
    }

    private void changeTextSizeSmaller() {
        answerTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 60);
    }

    private void changeTextSizeDefault() {
        answerTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 88);
    }

    private void setNumberButtonsEnabled(boolean toggle) {
        zeroButton.setClickable(toggle);
        oneButton.setClickable(toggle);
        twoButton.setClickable(toggle);
        threeButton.setClickable(toggle);
        fourButton.setClickable(toggle);
        fiveButton.setClickable(toggle);
        sixButton.setClickable(toggle);
        sevenButton.setClickable(toggle);
        eightButton.setClickable(toggle);
        nineButton.setClickable(toggle);
    }

    private void updateAnswerView(CharSequence input) {
        answerTextView.append(input);
    }

    private float performOperation(float valueOne, float valueTwo, char operator) {
        float answer = 0.00f;
        switch(operator) {
            case '+':
                break;
            case '-':
                break;
            case '*':
                break;
            case '/':
                break;
            default:

        }
        return answer;
    }
}
