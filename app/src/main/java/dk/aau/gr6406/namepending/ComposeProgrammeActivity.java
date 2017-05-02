package dk.aau.gr6406.namepending;



import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;
import java.util.ArrayList;

public class ComposeProgrammeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_programme);
        // Construct the data source
        ArrayList<Exercise> arrayOfExercises = new ArrayList<Exercise>();
        // Create the adapter to convert the array to views
        ComposeProgrammeAdapter adapter = new ComposeProgrammeAdapter(this, arrayOfExercises);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.exerciseLV);
        listView.setAdapter(adapter);
    }
}

