package com.example.jpa.repositroy;

import org.springframework.data.repository.CrudRepository;

import com.example.jpa.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer> 
{

}
