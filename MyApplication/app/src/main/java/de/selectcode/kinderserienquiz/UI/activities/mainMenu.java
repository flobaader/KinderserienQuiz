package de.selectcode.kinderserienquiz.UI.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.selectcode.kinderserienquiz.DataManagment.Serie;
import de.selectcode.kinderserienquiz.R;
import de.selectcode.kinderserienquiz.UI.components.SeriesRectangleView;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void goToLevelMenu(View view){
        Intent nextScreen = new Intent(mainMenu.this, levelMenu.class);
        startActivity(nextScreen);
    }

    public void goToSettings(View view){
        Intent nextScreen = new Intent(mainMenu.this, settingsView.class);
        startActivity(nextScreen);
    }
}
