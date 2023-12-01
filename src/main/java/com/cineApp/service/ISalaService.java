package com.cineApp.service;

import com.cineApp.entity.Sala;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ISalaService {
    public List<Sala> findAll();
    public Sala finById(Long id);

    public Sala saveSala(Sala sala);
    public void deleteSalaById(Long id);
}
