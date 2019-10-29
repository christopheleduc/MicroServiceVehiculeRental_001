package com.vehicule.rental.dao;

import com.vehicule.rental.model.VehiculeRental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculeRentalDao extends JpaRepository<VehiculeRental, Integer> {
    VehiculeRental findById(int id);
    List<VehiculeRental> findByPriceGreaterThan(int priceLimit);
    List<VehiculeRental> findByNameLike(String search);
}
