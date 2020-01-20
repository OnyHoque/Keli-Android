package com.hoque.keli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit_Input;
    TextView text_Output;
    Button done;

    String main_in = "";
    String main_out = "";

    String [][]check= {
            {"hi","hello","ola","salam","hey"},
            {"good morning","good night","good evening","good afternoon"},
            {"how are you","how are u","how r you","how r u"},
            {"what is your name","who are you","what are you","are you a human","are you a robot","are you a bot","are you a chat bot"},
            {"what","why","when","how","who"},
            {"bye","goodbye","later","see you later"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_Input = (EditText)findViewById(R.id.text_Input);
        text_Output = (TextView) findViewById(R.id.text_Output);
        done = (Button)findViewById(R.id.done);

        main_out += "Hi!\n";
        Update();

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_in = Read();
                main_out += "You: "+main_in+"\n";

            }
        });


    }

    private void Update()
    {
        text_Output.setText(main_out);
    }
    public String Read()
    {
        String str = edit_Input.getText().toString();
        return str;
    }
}
