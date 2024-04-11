package com.hackaboss.ventaDeAutos.Service;

import com.hackaboss.ventaDeAutos.Model.Vehicles;
import com.hackaboss.ventaDeAutos.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements  IVehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public Vehicles createVehicle(Vehicles vehicle) {
        return vehicleRepository.createVehicle(vehicle);
    }

    @Override
    public List<Vehicles> getAllVehicles() {
        return vehicleRepository.getAllVehicles();
    }

    @Override
    public List<Vehicles> getVehiclesByPrice() {
        return vehicleRepository.getVehiclesByPrice();
    }

    @Override
    public Vehicles getVehicleById(Long id) {
        return vehicleRepository.getVehicleById(id).orElse(null);
    }
}
