package com.williamkwao.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class FunFactsActivity extends ActionBarActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        //declaring vie variables and assign views from from the layout file
        final TextView factLabel =(TextView)findViewById(R.id.factTextView);
        final Button showFactButton= (Button) findViewById(R.id.showFactButton);
        final RelativeLayout mLayout = (RelativeLayout) findViewById(R.id.mainView);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //button was clicked update fact label with new fact
                factLabel.setText(mFactBook.getFact());
                //update color
                int color = mColorWheel.getColorWheel();
                mLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);
       // Toast.makeText(this,"William Kwao created this",Toast.LENGTH_LONG).show();
        Log.d(TAG,"Activity is running");
    }

}
