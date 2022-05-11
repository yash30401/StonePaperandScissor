package com.DevYash.stonepaperandscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView cmoption,scoreview,windandloose;
    ImageView cmimage,primage;
    int score=0;
    int randNumber;
    Button stone,paper,scissor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cmoption=findViewById(R.id.cmoption);
        cmimage=findViewById(R.id.cmImage);
        primage=findViewById(R.id.prImage);
        scoreview=findViewById(R.id.score);
        windandloose=findViewById(R.id.winandloose);
        stone=findViewById(R.id.stone);
        paper=findViewById(R.id.paper);
        scissor=findViewById(R.id.scissor);


        stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=generateRandom();


                if(num==1){
                    score-=1;
                    windandloose.setText("Loose");
                }else if(num==2){
                    score+=1;
                    windandloose.setText("Win");
                }

                primage.setImageResource(R.drawable.stone);
                scoreview.setText("Score: "+ score);
            }
        });


        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=generateRandom();

                if(num==0){
                    score+=1;
                    windandloose.setText("Win");
                }else if(num==2){
                    score-=1;
                    windandloose.setText("Loose");
                }
                primage.setImageResource(R.drawable.paper);
                scoreview.setText("Score: "+ score);
            }
        });

        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=generateRandom();

                if(num==0){
                    score-=1;
                    windandloose.setText("Loose");
                }else if(num==1){
                    score+=1;
                    windandloose.setText("Win");
                }
                primage.setImageResource(R.drawable.scissor);
                scoreview.setText("Score: "+ score);
            }
        });

    }

    public int generateRandom(){
        Random random=new Random();

        randNumber=random.nextInt(3);

        if(randNumber==0){
            cmoption.setText("Stone");
            cmimage.setImageResource(R.drawable.stone);
        }else  if(randNumber==1){
            cmoption.setText("Paper");
            cmimage.setImageResource(R.drawable.paper);
        }else if(randNumber==2){
            cmoption.setText("Scissor");
            cmimage.setImageResource(R.drawable.scissor);
        }

        return randNumber;
    }




}