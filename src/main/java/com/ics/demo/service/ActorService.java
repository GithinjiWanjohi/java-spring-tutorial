package com.ics.demo.service;

import com.ics.demo.models.Actor;
import com.ics.demo.models.Movie;

import java.util.List;

public interface ActorService {
    List<Actor> findAll();

    Actor findByID(Long id);

    Actor create(Actor actor);

    void delete(Actor actor);

    Actor update(Actor actor);

    Actor update(Long id, Actor actor);

}
