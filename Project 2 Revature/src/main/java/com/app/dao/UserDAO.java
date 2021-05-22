package com.app.dao;

public interface UserDAO {
    public void Login();
    public void getUserInfo(String SSN);
    public void updatePassword();
    public void signUp();
    public void verifyQRCode();
}
