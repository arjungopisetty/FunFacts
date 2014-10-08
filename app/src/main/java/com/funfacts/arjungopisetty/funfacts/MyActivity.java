package com.funfacts.arjungopisetty.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MyActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        // Declare a View variable and assign them the Views form the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout background = (RelativeLayout) findViewById(R.id.relativeLayout);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                // Update the label with the dynamic fact
                factLabel.setText(fact);

                // Update the background color
                int color = mColorWheel.getColor();
                background.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        });
    }


}
