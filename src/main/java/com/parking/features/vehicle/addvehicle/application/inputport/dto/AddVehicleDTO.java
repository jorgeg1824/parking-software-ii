package com.parking.features.vehicle.addvehicle.application.inputport.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class AddVehicleDTO {

    private UUID id;
    private int ticketNumber;
    private LocalDateTime entryDate;
    private UUID vehicleId;
    private UUID cellId;
    private UUID ticketStatus;

    public AddVehicleDTO(final UUID id, final int ticketNumber,
                          final LocalDateTime entryDate, final UUID vehicleId,
                          final UUID cellId, final UUID ticketStatus) {
        this.id = id;
        this.ticketNumber = ticketNumber;
        this.entryDate = entryDate;
        this.vehicleId = vehicleId;
        this.cellId = cellId;
        this.ticketStatus = ticketStatus;
    }

    public UUID getId() { return id; }
    public int getTicketNumber() { return ticketNumber; }
    public LocalDateTime getEntryDate() { return entryDate; }
    public UUID getVehicleId() { return vehicleId; }
    public UUID getCellId() { return cellId; }
    public UUID getTicketStatus() { return ticketStatus; }

    public void setId(UUID id) { this.id = id; }
    public void setTicketNumber(int ticketNumber) { this.ticketNumber = ticketNumber; }
    public void setEntryDate(LocalDateTime entryDate) { this.entryDate = entryDate; }
    public void setVehicleId(UUID vehicleId) { this.vehicleId = vehicleId; }
    public void setCellId(UUID cellId) { this.cellId = cellId; }
    public void setTicketStatus(UUID ticketStatus) { this.ticketStatus = ticketStatus; }
}