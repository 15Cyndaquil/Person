package com.example.cynda.person;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import org.w3c.dom.Text;

import Person.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Person y00001 = new Person();
        final Person y00002 = new Person("John", 21);
        y00001.setNameAge("Lisa", 19);

        final TextView text1 = (TextView) findViewById(R.id.textView1);
        final TextView text2 = (TextView) findViewById(R.id.textView2);
        final TextView text3 = (TextView) findViewById(R.id.textView3);
        final TextView text4 = (TextView) findViewById(R.id.textView4);
        final TextView text5 = (TextView) findViewById(R.id.textView5);

        final EditText nameText = (EditText) findViewById(R.id.nameText);
        final EditText ageText = (EditText) findViewById(R.id.ageText);

        Button name1Button = (Button) findViewById(R.id.name1Button);
        Button name2Button = (Button) findViewById(R.id.name2Button);
        Button age1Button = (Button) findViewById(R.id.age1Button);
        Button age2Button = (Button) findViewById(R.id.age2Button);
        Button run = (Button) findViewById(R.id.run);

        age1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                y00001.setAge(Integer.parseInt(ageText.getText().toString()));
            }
        });

        age2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                y00002.setAge(Integer.parseInt(ageText.getText().toString()));
            }
        });

        name2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                y00002.setName(nameText.getText().toString());
            }
        });

        name1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                y00001.setName(nameText.getText().toString());
            }
        });

        run.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(y00001.toString().equals(y00002.toString())){
                    text1.setText(y00001.getName()+" is the same as "
                            +y00002.getName());
                }
                else{
                    text1.setText(y00001.getName()+" is different from "
                            +y00002.getName());
                }
                if(y00001.getName().equals(y00002.getName())){
                    text2.setText(y00001.getName()+" has the same "
                            + "name as "+y00002.getName());
                }
                else{
                    text2.setText(y00001.getName()+" and "
                            +y00002.getName()+" have different names");
                }
                if(y00001.getAge()==y00002.getAge()){
                    text3.setText(y00001.getName()+" and "
                            +y00002.getName()+" have the same age");
                    text5.setText("");
                    text4.setText("");
                }
                else{
                    text3.setText(y00001.getName()+" and "
                            +y00002.getName()+" have different ages");
                }
                if(y00001.getAge()>y00002.getAge()){
                    text4.setText(y00001.getName()+" is older than "
                            +y00002.getName());
                }
                if(y00001.getAge()<y00002.getAge()){
                    text4.setText(y00002.getName()+" is older than "
                            +y00001.getName());
                }
                if(y00001.getAge()>y00002.getAge()){
                    text5.setText(y00002.getName()+" is younger than "
                            +y00001.getName());
                }
                if(y00001.getAge()<y00002.getAge()){
                    text5.setText(y00001.getName()+" is younger than "
                            +y00002.getName());
                }
            }
        });

        if(y00001.toString().equals(y00002.toString())){
            text1.setText(y00001.getName()+" is the same as "
                    +y00002.getName());
        }
        else{
            text1.setText(y00001.getName()+" is different from "
                    +y00002.getName());
        }
        if(y00001.getName().equals(y00002.getName())){
            text2.setText(y00001.getName()+" has the same "
                    + "name as "+y00002.getName());
        }
        else{
            text2.setText(y00001.getName()+" and "
                    +y00002.getName()+" have different names");
        }
        if(y00001.getAge()==y00002.getAge()){
            text3.setText(y00001.getName()+" and "
                    +y00002.getName()+" have the same age");
            text5.setText("");
            text4.setText("");
        }
        else{
            text3.setText(y00001.getName()+" and "
                    +y00002.getName()+" have different ages");
        }
        if(y00001.getAge()>y00002.getAge()){
            text4.setText(y00001.getName()+" is older than "
                    +y00002.getName());
        }
        if(y00001.getAge()<y00002.getAge()){
            text4.setText(y00002.getName()+" is older than "
                    +y00001.getName());
        }
        if(y00001.getAge()>y00002.getAge()){
            text5.setText(y00002.getName()+" is younger than "
                    +y00001.getName());
        }
        if(y00001.getAge()<y00002.getAge()){
            text5.setText(y00001.getName()+" is younger than "
                    +y00002.getName());
        }
    }
}
