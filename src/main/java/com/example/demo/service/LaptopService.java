package com.example.demo.service;

import com.example.demo.model.Laptop;
import com.example.demo.repo.Laptoprepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
@Autowired
    private Laptoprepository repo;


    public void addLaptop(Laptop lap) {
        System.out.println("add Laptop math called");
        repo.save(lap);
    }
    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }
}
