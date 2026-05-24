package com.parking.infrastructure.rest.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;
import java.util.UUID;

public class AddVehicleRequest {

    @Positive(message = "TICKET_REQUEST_NUMBER_INVALID")
    private int ticketNumber;

    @NotNull(message = "TICKET_REQUEST_ENTRY_DATE_NULL")
    @PastOrPresent(message = "TICKET_REQUEST_ENTRY_DATE_FUTURE")
    private LocalDateTime entryDate;

    @NotNull(message = "TICKET_REQUEST_VEHICLE_ID_NULL")
    private UUID vehicleId;

    @NotNull(message = "TICKET_REQUEST_CELL_ID_NULL")
    private UUID cellId;

    @NotNull(message = "TICKET_REQUEST_STATUS_NULL")
    private UUID ticketStatus;

    public AddVehicleRequest() {
    	// Default constructor required by Jackson for JSON deserialization.
    }

    public int getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(final int ticketNumber) { this.ticketNumber = ticketNumber; }

    public LocalDateTime getEntryDate() { return entryDate; }
    public void setEntryDate(final LocalDateTime entryDate) { this.entryDate = entryDate; }

    public UUID getVehicleId() { return vehicleId; }
    public void setVehicleId(final UUID vehicleId) { this.vehicleId = vehicleId; }

    public UUID getCellId() { return cellId; }
    public void setCellId(final UUID cellId) { this.cellId = cellId; }

    public UUID getTicketStatus() { return ticketStatus; }
    public void setTicketStatus(final UUID ticketStatus) { this.ticketStatus = ticketStatus; }
}