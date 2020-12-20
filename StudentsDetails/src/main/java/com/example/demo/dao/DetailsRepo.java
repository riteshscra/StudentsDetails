package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Details;

public interface DetailsRepo extends CrudRepository<Details , Integer>
{
}
