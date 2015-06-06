package com.example.mystia04.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    int number1,number2,ope,answer;
    TextView num1Text,opeText,num2Text,answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = 0;
        number2 = 0;
        ope = 0;
        answer = 0;
        num1Text = (TextView)findViewById(R.id.num1);
        num2Text = (TextView)findViewById(R.id.num2);
        opeText = (TextView)findViewById(R.id.ope);
        answerText = (TextView)findViewById(R.id.answer);

        num1Text.setText("0");
        num2Text.setText("");
        opeText.setText("");
        answerText.setText("");
    }

    public void bt1(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 1;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 1;
            num2Text.setText(number2 + "");
        }
    }

    public void bt2(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 2;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 2;
            num2Text.setText(number2 + "");
        }
    }

    public void bt3(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 3;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 3;
            num2Text.setText(number2 + "");
        }
    }

    public void bt4(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 4;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 4;
            num2Text.setText(number2 + "");
    }
    }

    public void bt5(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 5;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 5;
            num2Text.setText(number2 + "");
        }
    }

    public void bt6(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 6;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 6;
            num2Text.setText(number2 + "");
        }
    }

    public void bt7(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 7;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 7;
            num2Text.setText(number2 + "");
        }
    }

    public void bt8(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 8;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 8;
            num2Text.setText(number2 + "");
        }
    }

    public void bt9(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 9;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 9;
            num2Text.setText(number2 + "");
        }
    }

    public void bt0(View v){
        if(ope == 0) {
            number1 = number1 * 10 + 0;
            num1Text.setText(number1 + "");
        }else if(ope > 0){
            number2 = number2 * 10 + 0;
            num2Text.setText(number2 + "");
        }
    }

    public void btplus(View v){
        ope = 1;
        opeText.setText("+");
        num2Text.setText("");
    }

    public void btequal(View v){
        if(ope == 1){
            answer = number1 + number2;
            answerText.setText(" = "+ answer + "");
            ope = -1;
        }else if(ope > 1){
            answerText.setText("未実装です♡");
        }else{
            answerText.setText("何かがおかしいよ");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
