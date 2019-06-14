package in.ac.sharda.lego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class list extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);

        desert();
        drinks();
        neg_noveg();
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 1:Intent i=new Intent(list.this,Veg.class);
                        startActivity(i);
                        break;
                    case 2:Intent i1=new Intent(list.this,nonVeg.class);
                        startActivity(i1);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    // add items into spinner dynamically

    public void drinks(){

        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("Drinks and Shakes");
        list.add("Oreo Shake");
        list.add("Kitkat Chocolate Shake");
        list.add("Cookie Cake Milkshake");
        list.add("Pinincolada");
        list.add("Orange Dreamcicrcle Shake");
        list.add("Fizz");
        list.add("Punch");
        list.add("Gunner");
        ArrayAdapter<String> dataAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);



    }


    public void neg_noveg() {

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        List<String> list = new ArrayList<String>();
        list.add("Select");
        list.add("Non-Veg");
        list.add("Veg");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(dataAdapter);
    }

    public void desert() {

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list = new ArrayList<String>();
        list.add("Deserts");
        list.add("Mint Oreo Cake");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }




    // get the selected dropdown list value
    public void addListenerOnButton() {


        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(list.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) +
                                "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem())+
                                "\nSpinner 3 : "+ String.valueOf(spinner3.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
}

