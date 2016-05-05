package com.rimitech.sgr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rimitech.sgr.models.Vehicle;



public interface VehicleRepository  extends JpaRepository<Vehicle, String> {
	Vehicle findByNum_Num(String num);
}
