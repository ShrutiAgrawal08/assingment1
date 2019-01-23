package e.admin.assingment1;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText1,editText2;
    Button button;
    int c=3;
    String s,s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button);
        editText1=findViewById(R.id.edt);
        editText2=findViewById(R.id.edt2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s=editText1.getText().toString();
                s1=editText2.getText().toString();





                if(s.equals(s1)){
                    Toast.makeText(MainActivity.this,"password and username is correct",Toast.LENGTH_LONG).show();



                }

                else{

                    if(c>0){

                        Toast.makeText(MainActivity.this, "wrong password "+c+" attempt left", Toast.LENGTH_SHORT).show();
                        c--;
                    }
                    else if(c==0){
                        button.setEnabled(false);
                    }

                }







            }
        });










    }
}