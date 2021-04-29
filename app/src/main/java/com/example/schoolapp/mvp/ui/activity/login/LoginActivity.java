package com.example.schoolapp.mvp.ui.activity.login;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.di.compont.DaggerLoginComponts;
import com.example.schoolapp.di.modules.LoginModules;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;
import com.example.schoolapp.mvp.presenter.login.LoginPresenter;

import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.LoginView, View.OnClickListener {

    private TextView login;
    private TextView regist;
    private TextView useRules;
    private TextView privacy;
    private PopupWindow registPopupWindow;
    private View registPopupWindowView;
    private PopupWindow loginPopupWindow;
    private View loginPopupWindowView;
    //popwindow regist
    private ImageView closePop;
    private EditText username;
    private EditText phoneCode;
    private TextView sendCode;
    private TextView popRegist;
    private LinearLayout wechatLogin;
    private LinearLayout tencentLogin;
    //popwindow login
    private ImageView loginClosePop;
    private EditText loginPhone;
    private EditText loginPassword;
    private TextView forgotPassword;
    private TextView notAccount;
    private TextView toRegister;
    private TextView popLogin;
    private LinearLayout loginWechatLogin;
    private LinearLayout loginTencentLogin;

    //请求参数
    private String phoneNumber;
    private String phoneYzCode = "1928";


    private Handler handler = new Handler(){
        @SuppressLint("ResourceAsColor")
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1){
                int arg1 = msg.arg1;
                if (arg1==0){
                    if (timer!=null){
                        timer.cancel();
                    }
                    sendCode.setClickable(true);
                    sendCode.setTextColor(Color.parseColor("#55CBC4"));
                    sendCode.setText("发送验证码");
                }else{
                    sendCode.setTextColor(Color.parseColor("#C4C4C6"));
                    sendCode.setText("已发送"+arg1+"s");
                }
            }
        }
    };


    @Override
    public int bondLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initInjec() {
        DaggerLoginComponts.builder().loginModules(new LoginModules(this)).build().injectLoginActivity(this);
    }

    @Override
    public void initView() {
        login = (TextView) findViewById(R.id.login);
        regist = (TextView) findViewById(R.id.regist);
        useRules = (TextView) findViewById(R.id.use_rules);
        privacy = (TextView) findViewById(R.id.privacy);
        login.setOnClickListener(this);
        regist.setOnClickListener(this);
        useRules.setOnClickListener(this);
        privacy.setOnClickListener(this);
        registPopupWindowView = getLayoutInflater().inflate(R.layout.regist_popwindow,null);
        loginPopupWindowView = getLayoutInflater().inflate(R.layout.login_popwindow,null);
        //popwindow view
        initRegiestPopWindow();
        //popwindow login
        initLoginPopWindow();


    }

    private void initLoginPopWindow() {
        loginClosePop = (ImageView) loginPopupWindowView.findViewById(R.id.login_close_pop);
        loginClosePop.setOnClickListener(this);
        loginPhone = (EditText) loginPopupWindowView.findViewById(R.id.login_phone);
        loginPassword = (EditText) loginPopupWindowView.findViewById(R.id.login_password);
        forgotPassword = (TextView) loginPopupWindowView.findViewById(R.id.forgot_password);
        forgotPassword.setOnClickListener(this);
        notAccount = (TextView) loginPopupWindowView.findViewById(R.id.not_account);
        toRegister = (TextView) loginPopupWindowView.findViewById(R.id.to_register);
        toRegister.setOnClickListener(this);
        popLogin = (TextView) loginPopupWindowView.findViewById(R.id.pop_login);
        popLogin.setOnClickListener(this);
        loginWechatLogin = (LinearLayout) loginPopupWindowView.findViewById(R.id.login_wechat_login);
        loginWechatLogin.setOnClickListener(this);
        loginTencentLogin = (LinearLayout) loginPopupWindowView.findViewById(R.id.login_tencent_login);
        loginTencentLogin.setOnClickListener(this);
        loginPopupWindow = new PopupWindow();
        loginPopupWindow.setOutsideTouchable(false);
        // 设置弹出窗体可点击
        loginPopupWindow.setFocusable(true);
        loginPopupWindow.setContentView(loginPopupWindowView);
        loginPopupWindow.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);
        loginPopupWindow.setHeight(LinearLayout.LayoutParams.MATCH_PARENT);
        loginPopupWindow.setAnimationStyle(R.style.login_pop_show);

    }

    private void initRegiestPopWindow() {
        closePop = (ImageView) registPopupWindowView.findViewById(R.id.close_pop);
        closePop.setOnClickListener(this);
        username = (EditText) registPopupWindowView.findViewById(R.id.username);
        phoneCode = (EditText) registPopupWindowView.findViewById(R.id.phone_code);
        sendCode = (TextView) registPopupWindowView.findViewById(R.id.send_code);
        sendCode.setOnClickListener(this);
        popRegist = (TextView) registPopupWindowView.findViewById(R.id.pop_regist);
        popRegist.setOnClickListener(this);
        wechatLogin = (LinearLayout) registPopupWindowView.findViewById(R.id.wechat_login);
        tencentLogin = (LinearLayout) registPopupWindowView.findViewById(R.id.tencent_login);
        wechatLogin.setOnClickListener(this);
        tencentLogin.setOnClickListener(this);
        registPopupWindow = new PopupWindow();
        registPopupWindow.setOutsideTouchable(false);
        // 设置弹出窗体可点击
        registPopupWindow.setFocusable(true);
        registPopupWindow.setContentView(registPopupWindowView);
        registPopupWindow.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);
        registPopupWindow.setHeight(LinearLayout.LayoutParams.MATCH_PARENT);
        // 设置弹出窗体显示时的动画，从底部向上弹出
        registPopupWindow.setAnimationStyle(R.style.login_pop_show);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {
        loginPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                loginPassword.setText("");
                loginPhone.setText("");
                setBackgroundAlpha(1.0f);
            }
        });
        registPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                phoneCode.setText("");
                username.setText("");
                handler.sendEmptyMessage(1);
                setBackgroundAlpha(1.0f);
            }
        });
    }


    private int timeindex = 60;
    private Timer timer;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.close_pop:
                //关闭pop
                registPopupWindow.dismiss();
                if (timer!=null){
                    timer.cancel();
                }
                break;
            case R.id.send_code:
                //发送验证码
                if (username.getText().toString().equals("")||username.getText().toString() == null){
                    Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
                }else if (!isMobileNO(username.getText().toString())){
                    Toast.makeText(this, "请输入正确的手机号", Toast.LENGTH_SHORT).show();
                }else{
                    sendCode.setClickable(false);
                    timer = new Timer();
                    timeindex = 60;
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Message obtain = Message.obtain();
                            obtain.what =1;
                            obtain.arg1 = (timeindex--);
                            handler.sendMessage(obtain);
                        }
                    },0,1000);
                    p.getRegisterCode(username.getText().toString());
                }
                break;
            case R.id.wechat_login:
                //微信登录
                break;
            case R.id.tencent_login:
                //QQ登录
                break;
            case R.id.login_close_pop:
                //登录关闭
                loginPopupWindow.dismiss();
                break;
            case R.id.to_register:
                //去注册
                loginPopupWindow.dismiss();
            case R.id.regist:
                registPopupWindow.showAsDropDown(getLayoutInflater().inflate(R.layout.activity_login,null),0,0, Gravity.BOTTOM);
                setBackgroundAlpha(0.5f);
                break;
            case R.id.login:
                loginPopupWindow.showAsDropDown(getLayoutInflater().inflate(R.layout.activity_login,null),0,0, Gravity.BOTTOM);
                setBackgroundAlpha(0.5f);
                break;
            case R.id.pop_login:
                // 登录
                ARouter.getInstance().build(ARouterConstants.MainActivity).navigation();
                break;
            case R.id.login_wechat_login:
                //登录 微信
                break;
            case R.id.login_tencent_login:
                //登录 QQ
                break;
            case R.id.pop_regist:
                //注册用户
                phoneNumber = username.getText().toString();
                if (phoneNumber == null ||phoneNumber.isEmpty()){
                    Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
                }else if (phoneCode.getText().toString().equals("")|| phoneCode.getText().toString() == null){
                    Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();

                }else{
                p.getRegister(phoneYzCode,phoneNumber);
                }
                break;

        }
    }


    /**
     * pop背景
     */
    private void setBackgroundAlpha(float v) {
        Window window = getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        window.setFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND, WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        lp.alpha = v; //0.0-1.0
        window.setAttributes(lp);
    }

    /**
     * 验证手机号
     */
    public static boolean isMobileNO(String accont) {
        Pattern p = Pattern.compile("^1\\d{10}$");
        Matcher m = p.matcher(accont);
        return m.matches();
    }
    /**
     * 发送验证码
     * @param registerCodeEntity
     */
    @Override
    public void getRegisterCode(RegisterCodeEntity registerCodeEntity) {
            if (registerCodeEntity.getCode() == 200){
                //网络请求成功
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(LoginActivity.this, ""+registerCodeEntity.getData(), Toast.LENGTH_SHORT).show();
                    }
                });
                phoneCode.setText("1928");
            }
    }

    @Override
    public void getRegister(RegisterEntity registerEntity) {
            if (registerEntity.getCode() == 200){
                Log.i("getRegister", "getRegister: +注册成功");
            }
    }
}