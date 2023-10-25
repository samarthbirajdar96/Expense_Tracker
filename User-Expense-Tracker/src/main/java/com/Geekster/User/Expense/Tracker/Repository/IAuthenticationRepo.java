package com.Geekster.User.Expense.Tracker.Repository;

import com.Geekster.User.Expense.Tracker.Entity.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);


}
