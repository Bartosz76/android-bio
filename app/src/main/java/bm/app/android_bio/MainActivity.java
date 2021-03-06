package bm.app.android_bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText enterHobbies;
    private TextView hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterHobbies = findViewById(R.id.enterHobbies);
        hobbies = findViewById(R.id.hobbiesText);
    }

    public void addHobbies(View view) {
        hobbies.setText(String.format("Hobbies: %s", enterHobbies.getText().toString().trim()));
        hobbies.setVisibility(View.VISIBLE);

        //Hiding the keyboard.
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}