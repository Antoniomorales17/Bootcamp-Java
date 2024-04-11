package com.hackaboss.ventaDeAutos.Controller;

import com.hackaboss.ventaDeAutos.Model.Vehicles;
import com.hackaboss.ventaDeAutos.Service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private IVehicleService iVehicleService;

    @PostMapping
    public Vehicles createVehicle(@RequestBody Vehicles vehicle){
        return iVehicleService.createVehicle(vehicle);
    }

    @GetMapping
    public List<Vehicles> getAllVehicles(){
        return iVehicleService.getAllVehicles();
    }

    @GetMapping("/prices")
    public List<Vehicles> getVehiclesByPrice(){
        return iVehicleService.getVehiclesByPrice();
    }

    @GetMapping("/{id}")
    public Vehicles getVehiclesById(@PathVariable Long id){
        return iVehicleService.getVehicleById(id);
    }
}
