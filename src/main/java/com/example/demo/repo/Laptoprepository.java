package com.example.demo.repo;

import com.example.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class Laptoprepository {
    public void save(Laptop lap){
        System.out.println("Saved to database");
    }

}
