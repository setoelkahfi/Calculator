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
                if (isDataValid()) {
                    double theResult = getNumber1() + getNumber2();
                    textResult.setText(Double.toString(theResult));
                }
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDataValid()) {
                    double theResult = getNumber1() - getNumber2();
                    textResult.setText(Double.toString(theResult));
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDataValid()) {
                    double theResult = getNumber1() / getNumber2();
                    textResult.setText(Double.toString(theResult));
                }
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDataValid()) {
                    double theResult = getNumber1() * getNumber2();
                    textResult.setText(Double.toString(theResult));
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearInput();
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

    private double getNumber1() {
        return Double.parseDouble(operand1.getText().toString());
    }
    private double getNumber2() {
        return Double.parseDouble(operand2.getText().toString());
    }

    private boolean isDataValid() {
        if (operand1.getText().length() > 0 && operand2.getText().length()>0)
            return true;

        Toast.makeText(MainActivity.this, getString(R.string.validation_text), Toast.LENGTH_LONG).show();
        return false;
    }

    private void clearInput(){
        operand1.setText("");
        operand2.setText("");
        textResult.setText("0.00");

        operand1.requestFocus();
    }
}
