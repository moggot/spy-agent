package com.moggot.spyagent.presentation.login;

import android.support.annotation.NonNull;

import com.moggot.spyagent.di.scope.LoginScope;
import com.moggot.spyagent.domain.AuthInteractor;
import com.moggot.spyagent.presentation.common.BasePresenter;

import javax.inject.Inject;

@LoginScope
public class LoginPresenter extends BasePresenter<LoginView> {

    @NonNull
    private AuthInteractor authInteractor;

    @Inject
    LoginPresenter(@NonNull AuthInteractor authInteractor) {
        this.authInteractor = authInteractor;
    }

    public void showLogin() {
        getViewOrThrow().showLoginFragment();
    }

    public void showSelf() {
        getViewOrThrow().showMainActivity();
    }

    public void login(String userId, String accessToken) {
        unSubscribeOnDetach(
                authInteractor.login(userId, accessToken)
                        .subscribe(loginResponse -> getViewOrThrow().showMainActivity()));
    }
}
