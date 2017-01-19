package mx.edu.utng.operaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private EditText edtNumberX;
    private EditText edtNumberY;
    private Button btnCalculate;
    private TextView txvResult;
    //private Button btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        edtNumberX = (EditText)findViewById(R.id.edt_number_1);
        edtNumberY = (EditText) findViewById(R.id.edt_number_2);
        btnCalculate = (Button)findViewById(R.id.btn_calculate);
        txvResult = (TextView)findViewById(R.id.txv_results);
       // btnInicio = (Button)findViewById(R.id.btn_inicio);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float simpleX = Float.parseFloat(edtNumberX.getText().toString());
                float simpleY = Float.parseFloat(edtNumberY.getText().toString());
                float result=0;

                result = 2*(simpleX-4*simpleY)+3*(2*simpleX+3*simpleY);

                txvResult.setText(String.valueOf(result));
            }
        });


    }
}
