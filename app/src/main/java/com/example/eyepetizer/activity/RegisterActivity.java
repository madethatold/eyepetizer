package com.example.eyepetizer.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eyepetizer.R;
import com.example.eyepetizer.UserManager;
import com.example.eyepetizer.util.ToastUtil;

public class RegisterActivity extends AppCompatActivity {
    private EditText etuser,etpassword,etrepassword;
    private ImageView imback;
    private Button btnupload;
    private CheckBox cbagree;


    UserManager userManager=new UserManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        //左上角返回键
        imback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //提交注册信息
        btnupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etuser.getText().toString();
                String password = etpassword.getText().toString();
                String rePassword = etrepassword.getText().toString();
                registerCHECK(name,password,rePassword);
            }
        });

    }

    public void initView(){
        etuser=findViewById(R.id.register_username);
        etpassword=findViewById(R.id.register_password);
        etrepassword=findViewById(R.id.register_repassword);
        imback=findViewById(R.id.register_back);
        btnupload=findViewById(R.id.btn_register);
        cbagree=findViewById(R.id.checkbox_agree);
        //设置按钮半透明
        btnupload.getBackground().setAlpha(100);

    }

    //对注册信息进行验证，用户名是否重复，两次密码输入是否一致
    private void registerCHECK(String name,String password,String repassword){
        if (isUserNameAndPwdValid(name,password,repassword)){
            boolean flag;
            flag=userManager.findUserByName(name);
            if(!flag){
                Log.d("tag","注册失败");
                ToastUtil.showMsg(this,"用户名已经存在");
                return ;
            }
            if(!password.equals(repassword)){
                ToastUtil.showMsg(this,"输入的密码不同");
            }else {
                flag=userManager.insertUser(name,password);


                if(!flag){
                    ToastUtil.showMsg(this,"注册失败");
                    return;
                }if(!cbagree.isChecked()){
                    ToastUtil.showMsg(this,"需同意使用条款");
                    return;
                }

                ToastUtil.showMsg(this,"注册成功");
                Intent intent_Register_to_Login = new Intent(RegisterActivity.this,LoginActivity.class) ;    //切换User Activity至Login Activity
                startActivity(intent_Register_to_Login);
                finish();
            }
        }

    }


    //判断输入的昵称，密码，确认密码是否为空

    public boolean isUserNameAndPwdValid(String name,String password,String repassword) {
        if (name.trim().equals("")) {
            ToastUtil.showMsg(this,"用户名不能为空");
            return false;
        } else if (password.trim().equals("")) {
            ToastUtil.showMsg(this,"密码为空");
            return false;
        }else if(repassword.trim().equals("")) {
            ToastUtil.showMsg(this,"再次输入密码不能为空");
            return false;
        }
        return true;
    }
}
