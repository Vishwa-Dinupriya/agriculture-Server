package com.example.agricultureserver.controller;

import com.example.agricultureserver.model.Fertilizer;
import com.example.agricultureserver.service.impl.FertilizerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fertilizer")
public class FertilizerController {

    @Autowired
    FertilizerServiceImpl fertilizerServiceImpl;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addFertilizer(@RequestBody Fertilizer fertilizer) {
        System.out.println(fertilizer);
        fertilizerServiceImpl.addFertilizer(fertilizer);
        System.out.println("New Employee Added!" + fertilizer);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Iterable<Fertilizer> getFertilizers() {
        return fertilizerServiceImpl.getAllFertilizers();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Fertilizer getFertilizer(@PathVariable Integer id) {
        return fertilizerServiceImpl.getFertilizerById(id);
    }

    @RequestMapping(value="/delete", method = RequestMethod.DELETE)
    public Fertilizer deleteFertilizer(@RequestParam Integer id){
        return fertilizerServiceImpl.deleteFertilizer(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Fertilizer updateFertilizer(@RequestBody Fertilizer fertilizer) {
        System.out.println(fertilizer);
        fertilizerServiceImpl.updateFertilizer(fertilizer);
        return fertilizer;
    }
}
