package com.example.practical3task1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity {
    int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Counter App (02, 14, 43)");
        Button increment_btn = findViewById(R.id.increment_btn), decrement_btn = findViewById(R.id.decrement_btn), reset_btn = findViewById(R.id.reset_btn);
        TextView txt = findViewById(R.id.counter_view);
        value = Integer.parseInt(txt.getText().toString());
        increment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value < 10)
                {
                    value ++;
                    if(value == 10)
                        txt.setText("Overflow");
                    else
                        txt.setText(String.valueOf(value));
                }
            }
        });
        decrement_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value >= 0)
                {
                    value --;
                    if(value == -1)
                        txt.setText("Underflow");
                    else
                        txt.setText(String.valueOf(value));
                }
            }
        });
        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = 0;
                txt.setText(String.valueOf(value));
            }
        });
    }
}