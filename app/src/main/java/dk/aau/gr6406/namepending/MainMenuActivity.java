package dk.aau.gr6406.namepending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void clickButton(View view){

        Toast.makeText(MainMenuActivity.this,"BØHH",Toast.LENGTH_LONG).show();

    }
}
