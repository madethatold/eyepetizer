package com.example.eyepetizer.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eyepetizer.R;
import com.example.eyepetizer.User;
import com.example.eyepetizer.util.SharedPUtil;
import com.example.eyepetizer.util.ToastUtil;

import org.litepal.LitePal;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private Button btnlogin;
    private EditText etuser;
    private EditText etpassword;
    private ImageView back;
    private TextView tvToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initview();
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etuser.getText().toString();
                String password = etpassword.getText().toString();
                loginCHECK(name,password);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tvToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

    }

    public void initview(){
        btnlogin=findViewById(R.id.logininto);
        etuser=findViewById(R.id.login_username);
        etpassword=findViewById(R.id.login_password);
        back=findViewById(R.id.login_back);
        tvToRegister=findViewById(R.id.toRegister);
        //设置按钮半透明
        btnlogin.getBackground().setAlpha(100);
    }

    public void loginCHECK(String name,String password){
        boolean flag=false;
        String temppassword = "";
        //判断该用户是否存在
        List<User> userls= LitePal.findAll(User.class);
        for(User userl:userls){
            if (userl.getUsername().equals(name)){
                flag=true;
                temppassword=userl.getPassword();
                break;
            }
        }

        if (flag){
            if(temppassword.equals(password)){
                ToastUtil.showMsg(this,"登陆成功!");

                SharedPUtil.setParam(LoginActivity.this, SharedPUtil.IS_LOGIN, true);
                SharedPUtil.setParam(LoginActivity.this, SharedPUtil.LOGIN_DATA, name);

                //进入主页面
                Intent intent_logininto=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent_logininto);
                finish();
            }else {
                ToastUtil.showMsg(this,"密码错误");
            }
            //如果用户存在，判断密码是否正确
        }else {
            ToastUtil.showMsg(this,"用户不存在，请注册");
        }
    }

}
