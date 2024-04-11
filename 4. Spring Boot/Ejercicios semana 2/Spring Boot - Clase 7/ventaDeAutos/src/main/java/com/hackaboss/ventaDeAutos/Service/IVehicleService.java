package com.hackaboss.ventaDeAutos.Service;

import com.hackaboss.ventaDeAutos.Model.Vehicles;

import java.util.List;

public interface IVehicleService {

    public Vehicles createVehicle(Vehicles vehicle);
    public List<Vehicles> getAllVehicles();
    public List<Vehicles> getVehiclesByPrice();
    public Vehicles getVehicleById(Long id);
}
