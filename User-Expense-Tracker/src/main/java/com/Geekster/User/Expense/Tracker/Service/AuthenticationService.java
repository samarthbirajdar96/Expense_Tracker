package com.Geekster.User.Expense.Tracker.Service;

import com.Geekster.User.Expense.Tracker.Entity.AuthenticationToken;
import com.Geekster.User.Expense.Tracker.Repository.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private IAuthenticationRepo authenticationRepo;
    public void saveAuthToken(AuthenticationToken authToken) {
        authenticationRepo.save(authToken);
    }


    public boolean authenticate(String email, String authTokenValue)
    {
        AuthenticationToken authToken = authenticationRepo.findFirstByTokenValue(authTokenValue);

        if(authToken == null)
        {
            return false;
        }

        return authToken.getUser().getUserEmail().equals(email);

    }
}
