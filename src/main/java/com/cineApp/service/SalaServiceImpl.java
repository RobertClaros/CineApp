package com.cineApp.service;

import com.cineApp.entity.Sala;
import com.cineApp.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalaServiceImpl implements ISalaService{

    @Autowired
    private SalaRepository repository;

    @Override
    public List<Sala> findAll() {
        List<Sala> salaList = new ArrayList<>();
        salaList = repository.findAll();
        return salaList;
    }

    @Override
    public Sala finById(Long id) {
        return  repository.findById(id).orElseThrow();
    }

    @Override
    public Sala saveSala(Sala sala) {
        return repository.save(sala);
    }

    @Override
    public void deleteSalaById(Long id) {
        repository.deleteById(id);
    }
}
