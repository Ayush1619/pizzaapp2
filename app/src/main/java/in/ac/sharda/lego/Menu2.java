package in.ac.sharda.lego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu2 extends AppCompatActivity {
    private ImageButton butn1,butn2,butn3,butn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        butn1 = (ImageButton) findViewById(R.id.btn2);
        butn2 = (ImageButton) findViewById(R.id.btn3);
        butn3 = (ImageButton) findViewById(R.id.btn1);
        butn4 = (ImageButton) findViewById(R.id.btn4);
        butn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact();
            }
        });
        butn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                special();
            }
        });
        butn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                facilities();
            }
        });
        butn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list();
            }
        });
    }
    public  void list(){
        Intent intent=new Intent(this,list.class);
        startActivity(intent);
    }
    public void facilities(){
        Intent intent=new Intent(this,facilities.class);
        startActivity(intent);
    }
    public void special(){
        Intent intent=new Intent(this,special.class);
        startActivity(intent);
    }
    public void contact(){
        Intent intent=new Intent(this,contact.class);
    }
}
