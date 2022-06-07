package com.demo.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.demo.fit.bean.Person;
import com.demo.fit.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = binding.etName.getText().toString();
                String psd = binding.etPsd.getText().toString();
                String psd1 = binding.etQueren.getText().toString();
                String age = binding.etAge.getText().toString();
                String weight = binding.etWeight.getText().toString();

                if (TextUtils.isEmpty(name) || TextUtils.isEmpty(psd) || TextUtils.isEmpty(psd1) || TextUtils.isEmpty(age) || TextUtils.isEmpty(weight)) {
                    Toast.makeText(RegisterActivity.this, "请输入用户信息", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!psd.equals(psd1)) {
                    Toast.makeText(RegisterActivity.this, "两次密码不一致", Toast.LENGTH_SHORT).show();
                    return;
                }

                Person person = new Person();
                person.setName(name);
                person.setPassword(psd);
                person.setAge(age);
                person.setWeight(weight);

                if (person.save()) {
                    Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(RegisterActivity.this, "注册失败，用户名已存在", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}