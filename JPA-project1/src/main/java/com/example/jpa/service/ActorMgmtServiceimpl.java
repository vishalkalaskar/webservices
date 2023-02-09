package com.example.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.entity.Actor;
import com.example.jpa.repositroy.IActorRepository;

@Service("ActorService")
public class ActorMgmtServiceimpl implements IActorMgmt {

	
	@Autowired
	private IActorRepository actorrepo;
	
	@Override
	public String registorActor(Actor actor) {
		Actor sactor = actorrepo.save(actor);
		return "actor is registered with id value" +sactor.getAid();
	}

}
