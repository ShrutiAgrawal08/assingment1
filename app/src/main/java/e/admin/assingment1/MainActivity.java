package e.admin.assingment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText editText1,editText2;
    Button button;
    int c=3;
    String s,s1;


    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText1 = findViewById(R.id.edit);
        editText2 = findViewById(R.id.edit2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=editText1.getText().toString();
            }
        });



         {
            @Override
            public void onClick(View v) {










            }
        });
    }
}
