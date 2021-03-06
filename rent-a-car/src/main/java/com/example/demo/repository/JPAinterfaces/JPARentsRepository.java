package com.example.demo.repository.JPAinterfaces;

import com.example.demo.model.City;
import com.example.demo.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JPARentsRepository extends JpaRepository<Rent, Integer> {


}