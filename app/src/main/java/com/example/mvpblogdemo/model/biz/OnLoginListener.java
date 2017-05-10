package com.example.mvpblogdemo.model.biz;


import com.example.mvpblogdemo.model.bean.User;


public interface OnLoginListener
{
    void loginSuccess(User user);

    void loginFailed();
}
