package com.ics.demo.service;

import com.ics.demo.NotFoundException;
import com.ics.demo.models.Actor;
import com.ics.demo.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService{

    private final ActorRepository actorRepository;

    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor findByID(Long id) {
        return actorRepository.findById(id).orElseThrow(()->
                new NotFoundException("No record with id " + id + " found"));
    }

    @Override
    public Actor create(Actor actor) {
        return null;
    }

    @Override
    public void delete(Actor actor) {

    }

    @Override
    public Actor update(Actor actor) {
        return null;
    }

    @Override
    public Actor update(Long id, Actor actor) {
        return null;
    }
}
