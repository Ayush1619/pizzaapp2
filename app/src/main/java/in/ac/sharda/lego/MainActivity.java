package in.ac.sharda.lego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText txt,password;
    String GetEditText,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(EditText)findViewById(R.id.edittext);
        password=(EditText)findViewById(R.id.pass);
        button=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    public  void  openActivity(){
        Intent intent=new Intent(MainActivity.this,Menu2.class);
        startActivity(intent);
    }
    public void onClick(View v) {
        // TODO Auto-generated method stub

        GetEditText = txt.getText().toString();

        if(TextUtils.isEmpty(GetEditText)){

            Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();

        }
        else {

            Toast.makeText(MainActivity.this, "EditText is Not Empty", Toast.LENGTH_LONG).show();

        }
        pwd = password.getText().toString();

        if(TextUtils.isEmpty(pwd)){

            Toast.makeText(MainActivity.this, "Password is Empty", Toast.LENGTH_LONG).show();

        }
        else {

            Toast.makeText(MainActivity.this, "Password is Not Empty", Toast.LENGTH_LONG).show();

        }

    }
}

