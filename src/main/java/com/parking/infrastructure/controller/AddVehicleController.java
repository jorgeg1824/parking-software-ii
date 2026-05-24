package com.parking.infrastructure.controller;

import com.parking.features.vehicle.addvehicle.application.inputport.AddVehicleInputPort;
import com.parking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import com.parking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleResponseDTO;
import com.parking.infrastructure.rest.dto.AddVehicleRequest;
import com.parking.infrastructure.rest.dto.AddVehicleResponse;
import com.parking.infrastructure.rest.mapper.AddVehicleRestMapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tickets")
public class AddVehicleController {

    private final AddVehicleInputPort addVehicleInputPort;
    private final AddVehicleRestMapper addVehicleRestMapper;

    public AddVehicleController(
            final AddVehicleInputPort addVehicleInputPort,
            final AddVehicleRestMapper addVehicleRestMapper) {
        this.addVehicleInputPort = addVehicleInputPort;
        this.addVehicleRestMapper = addVehicleRestMapper;
    }

    @PostMapping("/entry")
    public ResponseEntity<AddVehicleResponse> registerEntry(
            @Valid @RequestBody final AddVehicleRequest request) {

        final AddVehicleDTO command = addVehicleRestMapper.toDTO(request);

        final AddVehicleResponseDTO result = addVehicleInputPort.execute(command);

        final AddVehicleResponse response = addVehicleRestMapper.toResponse(result);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}