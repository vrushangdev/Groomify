package com.example.medico.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.medico.R;

public class PreliminariesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preliminaries);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(PreliminariesActivity.this, HomeActivity.class));

    }
}
