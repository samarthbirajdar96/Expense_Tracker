package com.Geekster.User.Expense.Tracker.Repository;

import com.Geekster.User.Expense.Tracker.Entity.Order;
import com.Geekster.User.Expense.Tracker.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
    List<Order> findByUserAndOrderDate(User user, LocalDate date);
}
