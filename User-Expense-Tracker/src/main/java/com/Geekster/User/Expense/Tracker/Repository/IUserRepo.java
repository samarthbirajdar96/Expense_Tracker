package com.Geekster.User.Expense.Tracker.Repository;

import com.Geekster.User.Expense.Tracker.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo  extends JpaRepository<User,Integer> {
    User findFirstByUserEmail(String newEmail);

}
