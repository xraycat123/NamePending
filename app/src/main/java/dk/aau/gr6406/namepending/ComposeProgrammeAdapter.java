package dk.aau.gr6406.namepending;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rolf Oberlin on 02-05-2017.
 */

public class ComposeProgrammeAdapter extends ArrayAdapter<Exercise> {
    public ComposeProgrammeAdapter(Context context, ArrayList<Exercise> exercises) {
        super(context, 0, exercises);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Exercise exercise = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.single_exercise, parent, false);
        }
        // Lookup view for data population
        TextView tvExerciseName = (TextView) convertView.findViewById(R.id.tvExerciseName);
        TextView tvRepetitions = (TextView) convertView.findViewById(R.id.tvVideopath);
        TextView tvVideopath = (TextView) convertView.findViewById(R.id.tvRepetitions);
        TextView tvCategory = (TextView) convertView.findViewById(R.id.tvCategory);
        // Populate the data into the template view using the data object
        tvExerciseName.setText(exercise.exerciseName);
        tvVideopath.setText(exercise.videopath);
        tvRepetitions.setText(exercise.repetitions);
        tvCategory.setText(exercise.category);
        // Return the completed view to render on screen
        return convertView;
    }
}
