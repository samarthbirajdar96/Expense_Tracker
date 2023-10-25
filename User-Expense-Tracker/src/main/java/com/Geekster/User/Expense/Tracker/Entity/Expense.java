package com.Geekster.User.Expense.Tracker.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Month;
import java.time.Year;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer expenseId;
    private Year expenseYear;
    @Enumerated(EnumType.STRING)
    private Month expenseMonth;

    private Double monthlyExpense;

    @ManyToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;



    public Expense(Year expenseYear,Month expenseMonth,Double monthlyExpense,User user)
    {
        this.expenseYear = expenseYear;
        this.expenseMonth = expenseMonth;
        this.monthlyExpense = monthlyExpense;
        this.user = user;
    }
}
