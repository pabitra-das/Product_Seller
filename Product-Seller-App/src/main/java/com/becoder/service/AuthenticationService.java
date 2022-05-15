package com.becoder.service;

import com.becoder.model.User;

public interface AuthenticationService {
    User signInUserReturnJWT(User signInRequest);
}
