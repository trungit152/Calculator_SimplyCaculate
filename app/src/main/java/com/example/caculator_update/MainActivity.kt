package com.example.caculator_update

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.TextView
import android.util.Log
import android.view.View
import android.widget.Button
import android.graphics.Color

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textReuslt: TextView
    lateinit var textExpression: TextView
    var state: Int = 1
    var isAns = false;
    var op: Int = 0
    var op1: Int = 0
    var op2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textReuslt = findViewById(R.id.text_result)
        textExpression = findViewById(R.id.text_expression)

        findViewById<Button>(R.id.btn0).setOnClickListener(this)
        findViewById<Button>(R.id.btn1).setOnClickListener(this)
        findViewById<Button>(R.id.btn2).setOnClickListener(this)
        findViewById<Button>(R.id.btn3).setOnClickListener(this)
        findViewById<Button>(R.id.btn4).setOnClickListener(this)
        findViewById<Button>(R.id.btn5).setOnClickListener(this)
        findViewById<Button>(R.id.btn6).setOnClickListener(this)
        findViewById<Button>(R.id.btn7).setOnClickListener(this)
        findViewById<Button>(R.id.btn8).setOnClickListener(this)
        findViewById<Button>(R.id.btn9).setOnClickListener(this)
        findViewById<Button>(R.id.btnCE).setOnClickListener(this)
        findViewById<Button>(R.id.btnC).setOnClickListener(this)
        findViewById<Button>(R.id.btnBS).setOnClickListener(this)
        findViewById<Button>(R.id.btnAdd).setOnClickListener(this)
        findViewById<Button>(R.id.btnEqual).setOnClickListener(this)
        findViewById<Button>(R.id.btnDivide).setOnClickListener(this)
        findViewById<Button>(R.id.btnSubtract).setOnClickListener(this)
        findViewById<Button>(R.id.btnMultiply).setOnClickListener(this)
        findViewById<Button>(R.id.btnAddOrSubTract).setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        val id = p0?.id;
        if (id == R.id.btn0) {
            addDigit(0);
        } else if (id == R.id.btn1) {
            addDigit(1);
        } else if (id == R.id.btn2) {
            addDigit(2);
        } else if (id == R.id.btn3) {
            addDigit(3);
        }
        else if (id == R.id.btn4) {
            addDigit(4);
        }
        else if (id == R.id.btn5) {
            addDigit(5);
        }
        else if (id == R.id.btn6) {
            addDigit(6);
        }
        else if (id == R.id.btn7) {
            addDigit(7);
        }
        else if (id == R.id.btn8) {
            addDigit(8);
        }
        else if (id == R.id.btn9) {
            addDigit(9)
        }
        else if (id == R.id.btnAdd) {
            isAns = false;
            if(state == 1){
                if(op!=1){
                    textExpression.text = StringBuilder(textExpression.text).append(" + ").toString()
                }
                op = 1;
                state = 2;
            }
            else if(state == 2){
                var result = 0;
                if (op == 1) {
                    result = op1 + op2;
                }
                else if (op == 2) {
                    result = op1 - op2;
                }
                else if (op == 3) {
                    result = op1 * op2;
                }
                else if (op == 4) {
                    result = op1 / op2;
                }
                textReuslt.text = "$result";
                textExpression.text = "$result"
                textExpression.text = StringBuilder(textExpression.text).append(" + ").toString()
                state = 2;
                op1 = result;
                op2 = 0;
                op = 1;
            }
        }
        else if (id == R.id.btnSubtract) {
            isAns = false;
            if(state == 1){
                if(op!=2){
                    textExpression.text = StringBuilder(textExpression.text).append(" - ").toString()
                }
                op = 2;
                state = 2;
            }
            else if(state == 2){
                var result = 0;
                if (op == 1) {
                    result = op1 + op2;
                }
                else if (op == 2) {
                    result = op1 - op2;
                }
                else if (op == 3) {
                    result = op1 * op2;
                }
                else if (op == 4) {
                    result = op1 / op2;
                }
                textReuslt.text = "$result";
                textExpression.text = "$result"
                textExpression.text = StringBuilder(textExpression.text).append(" - ").toString()
                state = 2;
                op1 = result;
                op2 = 0;
            }
        }
        else if (id == R.id.btnMultiply) {
            isAns = false;
            if(state == 1){
                if(op!=3){
                    textExpression.text = StringBuilder(textExpression.text).append(" * ").toString()
                }
                op = 3;
                state = 2;
            }
            else if(state == 2){
                var result = 0;
                if (op == 1) {
                    result = op1 + op2;
                }
                else if (op == 2) {
                    result = op1 - op2;
                }
                else if (op == 3) {
                    result = op1 * op2;
                }
                else if (op == 4) {
                    result = op1 / op2;
                }
                textReuslt.text = "$result";
                textExpression.text = "$result"
                textExpression.text = StringBuilder(textExpression.text).append(" * ").toString()
                state = 2;
                op1 = result;
                op2 = 0;
                op = 3;
            }
        }
        else if (id == R.id.btnDivide) {
            isAns = false;
            if(state == 1){
                if(op!=4){
                    textExpression.text = StringBuilder(textExpression.text).append(" / ").toString()
                }
                op = 4;
                state = 2;
            }
            else if(state == 2){
                var result = 0;
                if (op == 1) {
                    result = op1 + op2;
                }
                else if (op == 2) {
                    result = op1 - op2;
                }
                else if (op == 3) {
                    result = op1 * op2;
                }
                else if (op == 4) {
                    result = op1 / op2;
                }
                textReuslt.text = "$result";
                textExpression.text = "$result"
                textExpression.text = StringBuilder(textExpression.text).append(" / ").toString()
                state = 2;
                op1 = result;
                op2 = 0;
                op = 4;
            }
        }
        else if (id == R.id.btnCE) {
            if(state == 1){
                op1 = 0;
                op2 = 0;
                op = 0;
                textReuslt.text = "0";
                textExpression.text = "0";
            }
            else if(state == 2){
                op2 = 0;
                textReuslt.text = "0";
                if(op == 1){
                    textExpression.text = StringBuilder("$op1").append(" + ").toString();
                }
                else if(op == 2){
                    textExpression.text = StringBuilder("$op1").append(" - ").toString();
                }
                else if(op == 3){
                    textExpression.text = StringBuilder("$op1").append(" * ").toString();
                }
                else if(op == 4){
                    textExpression.text = StringBuilder("$op1").append(" / ").toString();
                }
            }
        }
        else if (id == R.id.btnC) {
            state = 1;
            op1 = 0;
            op2 = 0;
            op = 0;
            textReuslt.text = "$op1";
            textExpression.text = "$op1";
        }
        else if (id == R.id.btnBS) {
            if(isAns){
                state = 1;
                op1 = 0;
                op2 = 0;
                op = 0;
                textReuslt.text = "$op1";
                textExpression.text = "$op1";
            }
            if(state == 1){
                if(op1 != 0){
                    op1 = op1 / 10;
                    textReuslt.text = "$op1";
                    removeLastCharacter(textExpression);
                }
            }
            else if(state == 2){
                if(op2 != 0){
                    op2 = op2 / 10;
                    textReuslt.text = "$op2";
                    removeLastCharacter(textExpression);
                }
            }
        }
        else if (id == R.id.btnAddOrSubTract) {
            if(state == 1){
                if(op==0){
                    op1 = -op1;
                    textReuslt.text = "$op1";
                    textExpression.text = "$op1";
                }
            }
            if(state == 2){
                op2 = -op2;
                textReuslt.text = "$op2";
                if(op == 1){
                    textExpression.text = "$op1 + $op2"
                }
                else if(op == 2){
                    textExpression.text = "$op1 - $op2"
                }
                else if(op == 2){
                    textExpression.text = "$op1 * $op2"
                }
                else if(op == 2){
                    textExpression.text = "$op1 / $op2"
                }
            }
        }
        else if (id == R.id.btnEqual) {
            var result = 0
            if (op == 1) {
                result = op1 + op2;
            }
            else if (op == 2) {
                result = op1 - op2;
            }
            else if (op == 3) {
                result = op1 * op2;
            }
            else if (op == 4) {
                result = op1 / op2;
            }
            else if(op == 0){
                result = op1;
            }
            textReuslt.text = "$result";
            textExpression.text = "$result";
            isAns = true;
            state = 1;
            op1 = result;
            op2 = 0;
            op = 0;
        }

    }

    fun addDigit(c: Int) {
        if(isAns){
            state = 1;
            op1 = 0;
            op2 = 0;
            op = 0;
            isAns = false;
        }
        if (state == 1) {
            op1 = op1 * 10 + c;
            textReuslt.text = "$op1";
            textExpression.text = "$op1";
        } else {
            op2 = op2 * 10 + c;
            textReuslt.text = "$op2";
            textExpression.text = StringBuilder(textExpression.text).append("$c").toString();
        }
    }
    fun removeLastCharacter(textView: TextView) {
        val currentText = textView.text.toString()
        if (currentText.isNotEmpty()) {
            val newText = currentText.dropLast(1)
            textView.text = newText
        }
    }
}