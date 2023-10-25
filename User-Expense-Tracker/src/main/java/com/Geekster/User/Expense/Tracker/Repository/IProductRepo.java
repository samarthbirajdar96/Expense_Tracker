package com.Geekster.User.Expense.Tracker.Repository;

import com.Geekster.User.Expense.Tracker.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product,Integer> {

}
