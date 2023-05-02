package com.example.menutextbox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView selectionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectionText = findViewById(R.id.selection_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option1:
                selectionText.setText("Option 1 selected");
                return true;
            case R.id.option2:
                selectionText.setText("Option 2 selected");
                return true;
            case R.id.option3:
                selectionText.setText("Option 3 selected");
                return true;
            case R.id.option4:
                selectionText.setText("Option 4 selected");
                return true;
            case R.id.option5:
                selectionText.setText("Option 5 selected");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}


