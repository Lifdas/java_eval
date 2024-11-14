package potier.florian.demo.dto;

import java.time.LocalDate;

import potier.florian.demo.model.Status;

public class SmartphoneDto {
    private Long id;  // L'ID unique du smartphone
    private String serialNumber;
    private LocalDate releaseDate;
    private String brand;
    private Status status;  // Utilisation de l'énumération Status pour faire un bool like

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
