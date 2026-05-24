package com.parking.features.vehicle.addvehicle.application.usecase.mapper;

import com.parking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import com.parking.infrastructure.persistence.repository.entity.CellVehicleEntity;
import com.parking.infrastructure.persistence.repository.entity.CellEntity;
import com.parking.infrastructure.persistence.repository.entity.TicketEntity;
import com.parking.infrastructure.persistence.repository.entity.TicketStatusEntity;
import com.parking.infrastructure.persistence.repository.entity.VehicleEntity;
import org.springframework.stereotype.Component;

@Component
public class AddVehicleEntityMapper {

    public CellVehicleEntity toCellVehicleEntity(final AddVehicleDomain domain) {
        VehicleEntity vehicle = new VehicleEntity();
        vehicle.setId(domain.getVehicleId());

        CellEntity cell = new CellEntity();
        cell.setId(domain.getCellId());

        return new CellVehicleEntity(
            domain.getId(),
            0,
            cell,
            vehicle
        );
    }

    public TicketEntity toTicketEntity(final AddVehicleDomain domain,
                                       final CellVehicleEntity cellVehicle) {
        TicketStatusEntity status = new TicketStatusEntity();
        status.setId(domain.getTicketStatus());

        TicketEntity entity = new TicketEntity();
        entity.setTicketNumber(domain.getTicketNumber());
        entity.setEntryDate(domain.getEntryDate());
        entity.setCellVehicle(cellVehicle);
        entity.setTicketStatus(status);

        return entity;
    }
}