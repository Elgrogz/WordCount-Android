package com.example.user.wordcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class WordCountActivity extends AppCompatActivity {

    EditText inputEditText;
    Button countButton;
    TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = (EditText)findViewById(R.id.input_text);
        countButton = (Button)findViewById(R.id.count_button);
        outputText = (TextView)findViewById(R.id.output_text);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputEditText.getText().toString();
                WordCount wordCount = new WordCount();
                int output = wordCount.getWordCount(input);
                String totalCount = Integer.toString(output);
                outputText.setText(totalCount);
            }
        });
    }


}
