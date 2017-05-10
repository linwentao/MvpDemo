package com.example.mvpblogdemo.model.biz;


public interface IUserBiz
{
    public void login(String username, String password, OnLoginListener loginListener);
}
