package com.example.ozner.hoyomvp.Login.Model;

import com.example.ozner.hoyomvp.Bean.ResponseListener;

/**
 * Created by ozner_67 on 2016/5/24.
 */
public interface ILoginModel {
    void Login(String phone, String passwor, ResponseListener rl);
    void cancleLogin();
}
