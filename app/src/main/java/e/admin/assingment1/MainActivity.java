package e.admin.assingment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText,editText2;
    TextView textView;
    Button button;
    int i,n,k;
    String s,e="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText=findViewById(R.id.edt);
        textView=findViewById(R.id.text);
        button=findViewById(R.id.button);
        editText2=findViewById(R.id.key);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                k=Integer.parseInt(editText2.getText().toString().trim());
                s=editText.getText().toString();


                for(i=0;i<s.length();i++){

                    n=s.charAt(i);
                    n=n-97;
                    n=((n+k)%26)+97;
                    char c=(char)n;

                    e=e+c;



                }



                textView.setText(e);


                e="";




            }
        });



























    }
}
