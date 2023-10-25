package com.Geekster.User.Expense.Tracker.Repository;

import com.Geekster.User.Expense.Tracker.Entity.Expense;
import com.Geekster.User.Expense.Tracker.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Month;
import java.time.Year;
import java.util.List;

public interface IExpenseRepo extends JpaRepository<Expense,Integer> {
    Expense findByExpenseMonthAndExpenseYearAndUser(Month expenseMonth, Year expenseYear, User user);

    List<Expense> findByExpenseYearAndUser(Year year, User user);

    List<Expense> findByUserOrderByExpenseYearDesc(User user);

}
