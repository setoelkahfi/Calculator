package id.web.setoelkahfi.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button buttonAddition;
    private Button buttonSubtraction;
    private Button buttonDivision;
    private Button buttonMultiplication;
    private Button buttonClear;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        buttonAddition = (Button) findViewById(R.id.buttonAddition);
        buttonSubtraction = (Button) findViewById(R.id.buttonSubtraction);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        textResult = (TextView) findViewById(R.id.textResult);

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operand1.getText().length() > 0 && operand2.getText().length()>0) {
                    double number1 = Double.parseDouble(operand1.getText().toString());
                    double number2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = number1 + number2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter number in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operand1.getText().length() > 0 && operand2.getText().length()>0) {
                    double number1 = Double.parseDouble(operand1.getText().toString());
                    double number2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = number1 - number2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter number in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operand1.getText().length() > 0 && operand2.getText().length()>0) {
                    double number1 = Double.parseDouble(operand1.getText().toString());
                    double number2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = number1 / number2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter number in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operand1.getText().length() > 0 && operand2.getText().length()>0) {
                    double number1 = Double.parseDouble(operand1.getText().toString());
                    double number2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = number1 * number2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter number in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand1.setText("");
                operand2.setText("");
                textResult.setText("0.00");

                operand1.requestFocus();
            }
        });
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
