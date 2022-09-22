package com.example.zadaniedomowe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        ConstraintLayout mainLayout = (ConstraintLayout) findViewById(R.id.mainLay);

        Button previous = (Button) findViewById(R.id.Prev);
        previous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String imgDescription = String.valueOf(image.getContentDescription());
                if(imgDescription.equals("kot1")){
                    image.setImageResource(R.drawable.kot4);
                    image.setContentDescription("kot4");
                } else if(imgDescription.equals("kot2")){
                    image.setImageResource(R.drawable.kot1);
                    image.setContentDescription("kot1");
                } else if(imgDescription.equals("kot3")){
                    image.setImageResource(R.drawable.kot2);
                    image.setContentDescription("kot2");
                } else if(imgDescription.equals("kot4")){
                    image.setImageResource(R.drawable.kot3);
                    image.setContentDescription("kot3");
                }

            }
        });

        Button next = (Button) findViewById(R.id.Next);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String imgDescription = String.valueOf(image.getContentDescription());
                if(imgDescription.equals("kot1")){
                    image.setImageResource(R.drawable.kot2);
                    image.setContentDescription("kot2");
                } else if(imgDescription.equals("kot2")){
                    image.setImageResource(R.drawable.kot3);
                    image.setContentDescription("kot3");
                } else if(imgDescription.equals("kot3")){
                    image.setImageResource(R.drawable.kot4);
                    image.setContentDescription("kot4");
                } else if(imgDescription.equals("kot4")){
                    image.setImageResource(R.drawable.kot1);
                    image.setContentDescription("kot1");
                }
            }
        });

        EditText number = (EditText) findViewById(R.id.editTextNumber);
        number.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                String numberFromInput = number.getText().toString();

                if (numberFromInput.equals("1")){
                    image.setImageResource(R.drawable.kot1);
                    image.setContentDescription("kot1");
                }else if(numberFromInput.equals("2")) {
                    image.setImageResource(R.drawable.kot2);
                    image.setContentDescription("kot2");
                }else if(numberFromInput.equals("3")){
                    image.setImageResource(R.drawable.kot3);
                    image.setContentDescription("kot3");
                }else if(numberFromInput.equals("4")){
                    image.setImageResource(R.drawable.kot4);
                    image.setContentDescription("kot4");
                }
            }
        });

        Switch colorSwitch = (Switch) findViewById(R.id.switch1);
        colorSwitch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(colorSwitch.isChecked()){
                    mainLayout.setBackgroundColor(getResources().getColor(R.color.bgBlue));
                }else{
                    mainLayout.setBackgroundColor(getResources().getColor(R.color.bgGreen));
                }
            }
        });


    }
}