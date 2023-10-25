package com.Geekster.User.Expense.Tracker.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.Geekster.User.Expense.Tracker.Entity.Product;
import com.Geekster.User.Expense.Tracker.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("product")
    public String addAProduct(@RequestBody Product product)
    {
        return  productService.addAProduct(product);
    }

    @PostMapping("products")
    public String addListOfProducts(@RequestBody List<Product> products) {return productService.addListOfProducts(products);}

    @GetMapping("products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
}
