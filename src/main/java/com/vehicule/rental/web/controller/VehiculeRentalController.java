package com.vehicule.rental.web.controller;

import com.vehicule.rental.dao.VehiculeRentalDao;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Api( description = "API pour les opérations CRUD de base")
@RestController
public class VehiculeRentalController {

    @Autowired
    private VehiculeRentalDao vehiculeRentalDao;
}
