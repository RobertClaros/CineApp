package com.cineApp.controller;

import com.cineApp.entity.Sala;
import com.cineApp.service.ISalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cine")
public class SalaController {
    @Autowired
    private ISalaService salaService;

    @PostMapping("/")
    public Sala saveSala(@RequestBody Sala sala){
        return salaService.saveSala(sala);
    }

    @GetMapping("/")
    public List<Sala> findAllSala(){
        List<Sala> salaList = new ArrayList<>();
        salaList = salaService.findAll();
        return salaList;
    }

    @GetMapping("/{id}")
    public Sala findSalaById(@PathVariable Long id){
        return salaService.finById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSalaById(@PathVariable long id){
        salaService.deleteSalaById(id);

    }
    @PutMapping("/{id}")
    public Sala updateSala(@PathVariable Long id, Sala salaIncoming){
        Sala sala = salaService.finById(id);
        sala.setName(salaIncoming.getName());
        sala.setCapacity(salaIncoming.getCapacity());
        return salaService.saveSala(sala);
    }

}
