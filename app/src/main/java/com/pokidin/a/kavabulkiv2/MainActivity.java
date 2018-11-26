package com.pokidin.a.kavabulkiv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pokidin.a.kavabulkiv2.kava.MainPresenter;

public class MainActivity extends AppCompatActivity {

    Button menuButton;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        menuButton = findViewById(R.id.button_menu);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.openMenuScreen();
            }
        });
    }
}
