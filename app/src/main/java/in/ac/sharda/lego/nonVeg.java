package in.ac.sharda.lego;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;import android.widget.ListView;

public class nonVeg extends Activity
{
    // Array of strings...
    ListView simpleList;
    String countryList[] = {"Chicken Sandwich", "Chicken Burger", "Chicken Pizza", "Chicken Roll", "Chicken Fry", "Chicken Paratha","Egg roll","Chicken Tikka","Chicken Tandoori","Chicken Kabaf"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);
        simpleList = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_non_veg, R.id.textview, countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}



