package com.example.ariev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.example.ariev.darushnisayon.MainActivity;
import com.example.ariev.darushnisayon.R;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    BootstrapButton btnEnter;
    ImageView ivEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnEnter = (BootstrapButton) findViewById(R.id.btnEnter);
        ivEnter = (ImageView) findViewById(R.id.ivEnter);

        btnEnter.setOnClickListener(this);
        ivEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
