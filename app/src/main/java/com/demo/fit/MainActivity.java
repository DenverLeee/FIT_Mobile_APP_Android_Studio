package com.demo.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.demo.fit.bean.Person;
import com.demo.fit.databinding.ActivityMainBinding;
import com.demo.fit.utils.UserUtils;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    private List<Person> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = binding.zhanghao.getText().toString();
                String password = binding.mima.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(password)) {
                    Toast.makeText(MainActivity.this, "Enter Your Account!", Toast.LENGTH_SHORT).show();
                    return;
                }

                list = LitePal.where("name=? and password = ?", user, password).find(Person.class);

                if (list.size() == 0) {
                    Toast.makeText(MainActivity.this, "Username or Password Error!", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();

                UserUtils.setUserName(user);

                Intent intent1 = new Intent(MainActivity.this, IndexActivity.class);
                startActivity(intent1);

                finish();
            }
        });
        binding.tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent1);
            }
        });

    }
}