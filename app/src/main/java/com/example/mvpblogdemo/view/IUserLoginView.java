package com.example.mvpblogdemo.view;


import com.example.mvpblogdemo.model.bean.User;

public interface IUserLoginView
{
    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void showSuccess(User user);

    void showFailedError();

}
