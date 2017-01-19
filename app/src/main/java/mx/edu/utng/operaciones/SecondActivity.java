package mx.edu.utng.operaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText edtNumber1;
    private EditText edtNumber2;
    private Button btnCalculate;
    private TextView txvResult;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edtNumber1 = (EditText)findViewById(R.id.edt_number1);
        edtNumber2 = (EditText) findViewById(R.id.edt_number2);
        btnCalculate = (Button)findViewById(R.id.btn_calculate);
        txvResult = (TextView)findViewById(R.id.txv_result);
        btnNext = (Button)findViewById(R.id.btn_next);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float numberX = Float.parseFloat(edtNumber1.getText().toString());
                float numberY = Float.parseFloat(edtNumber2.getText().toString());
                float result=0;

                result = 4*(2*numberX+3*numberY)+2*(5*numberY+3*numberX);

                txvResult.setText(String.valueOf(result));
            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });
    }
}
