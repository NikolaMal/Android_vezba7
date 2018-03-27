package nikola.secondapp.nestoslistom;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CharacterAdapter adapter = new CharacterAdapter(this);
        adapter.addCharacter(new ListClass("Name", getResources().getDrawable(R.drawable.butters_stotch)));

        ListView list = (ListView) findViewById(R.id.listID);
        list.setAdapter(adapter);
    }
}
