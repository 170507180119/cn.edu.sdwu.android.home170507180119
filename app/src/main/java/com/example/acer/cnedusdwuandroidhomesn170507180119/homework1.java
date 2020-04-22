package com.example.acer.cnedusdwuandroidhomesn170507180119;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class homework1 extends AppCompatActivity  implements View.OnClickListener{
    EditText num_1,num_2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework1);

        num_1=(EditText) findViewById(R.id.num1);
        num_2=(EditText) findViewById(R.id.num2);
        final TextView result=(TextView) findViewById(R.id.homework1_tv1);
        Button add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String et1=num_1.getText().toString();
                String et2=num_2.getText().toString();
                float num1=Integer.valueOf(et1).floatValue();
                float num2=Integer.valueOf(et2).floatValue();
                num1=num1+num2;
                et1=String.valueOf(num1);
                result.setText(et1);
            }
        });

        Button sub=(Button)findViewById(R.id.subtract);
        sub.setOnClickListener(new MyClickListener());

        Button mul=(Button)findViewById(R.id.multiply);
        mul.setOnClickListener(this);
    }

    public class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            num_1=(EditText) findViewById(R.id.num1);
            num_2=(EditText) findViewById(R.id.num2);
            final TextView result=(TextView) findViewById(R.id.homework1_tv1);
            String et1=num_1.getText().toString();
            String et2=num_2.getText().toString();
            float num1=Integer.valueOf(et1).floatValue();
            float num2=Integer.valueOf(et2).floatValue();
            num1=num1-num2;
            et1=String.valueOf(num1);
            result.setText(et1);
        }
    }
    public void onClick(View view) {
        num_1=(EditText) findViewById(R.id.num1);
        num_2=(EditText) findViewById(R.id.num2);
        final TextView result=(TextView) findViewById(R.id.homework1_tv1);
        String et1=num_1.getText().toString();
        String et2=num_2.getText().toString();
        float num1=Integer.valueOf(et1).floatValue();
        float num2=Integer.valueOf(et2).floatValue();
        num1=num1*num2;
        et1=String.valueOf(num1);
        result.setText(et1);
    }
    public void chu(View view) {
        num_1=(EditText) findViewById(R.id.num1);
        num_2=(EditText) findViewById(R.id.num2);
        final TextView result=(TextView) findViewById(R.id.homework1_tv1);
        String et1=num_1.getText().toString();
        String et2=num_2.getText().toString();
        float num1=Integer.valueOf(et1).floatValue();
        float num2=Integer.valueOf(et2).floatValue();
        num1=num1/num2;
        et1=String.valueOf(num1);
        result.setText(et1);
    }
}

