package in.ac.sharda.lego;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;import android.widget.ListView;

public class Veg extends Activity
{
    // Array of strings...
    ListView simpleList;
    String countryList[] = {"Veg Sandwich", "Veg Burger", "Veg Pizza", "Veg Roll", "French Fry", "Aalu Paratha","Chola Vatora","Paneer Pizza"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);
        simpleList = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_veg, R.id.textview, countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}



