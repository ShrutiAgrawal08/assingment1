package e.admin.assingment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText editText;
    Button button;
    TextView textView;


    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.TextView);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {










            }
        });
    }
}
