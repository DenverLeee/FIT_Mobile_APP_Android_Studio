package com.demo.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.demo.fit.bean.ProjectBeen;
import com.demo.fit.databinding.ActivityProjectDetailBinding;

public class ProjectDetailActivity extends AppCompatActivity {

    ActivityProjectDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProjectDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        ProjectBeen projectBeen = (ProjectBeen) getIntent().getSerializableExtra("detail");

        binding.llTitle.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.llTitle.tvTitle.setText("详情");
        binding.tvDetailTitle.setText(projectBeen.getTitle());
        binding.tvDetailContent.setText(projectBeen.getContent());

    }
}