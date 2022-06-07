package com.demo.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.demo.fit.databinding.ActivityIndexBinding;

public class IndexActivity extends AppCompatActivity {
    ActivityIndexBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIndexBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(IndexActivity.this, UserInfoActivity.class);
                startActivity(intent);

            }
        });
        binding.btnProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndexActivity.this, ProjectListActivity.class);
                startActivity(intent);
            }
        });
        binding.btnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndexActivity.this, ProjectListActivity.class);
                intent.putExtra("type", 2);
                startActivity(intent);
            }
        });
        binding.btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndexActivity.this, ProjectListActivity.class);
                intent.putExtra("type", 3);
                startActivity(intent);
            }
        });
    }
}