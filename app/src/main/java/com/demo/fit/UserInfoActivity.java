package com.demo.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.demo.fit.bean.Person;
import com.demo.fit.databinding.ActivityUserInfoBinding;
import com.demo.fit.utils.UserUtils;

import org.litepal.LitePal;

import java.util.List;

public class UserInfoActivity extends AppCompatActivity {

    ActivityUserInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUserInfoBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        List<Person> personList = LitePal.where("name = ?", UserUtils.getUserName()).find(Person.class);

        if (personList.size() > 0) {
            binding.tvUserName.setText(personList.get(0).getName());
            binding.etAge.setText(personList.get(0).getAge());
            binding.etWeight.setText(personList.get(0).getWeight());
        }

        binding.llTitle.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        binding.llTitle.tvTitle.setText("用户中心");

        binding.btnSaveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person = new Person();
                person.setAge(binding.etAge.getText().toString());
                person.setWeight(binding.etWeight.getText().toString());

                person.updateAll("name = ?", UserUtils.getUserName());

                Toast.makeText(UserInfoActivity.this, "修改成功", Toast.LENGTH_SHORT).show();

                finish();
            }
        });


    }
}