package potier.florian.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class SmartphoneModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    private Long id; // Remplace l'email par un ID unique pour le smartphone
    private String serialNumber; // Préfixe en String pour les numéros de série qui peuvent contenir des lettres ou chiffres
    private LocalDate releaseDate; // LocalDate pour représenter une date de sortie
    private String brand;
    private Status status;  // Utilisation de l'énumération Status pour restreindre les valeurs

    public SmartphoneModel(String brand) {
        this.brand = brand;
    }

    public SmartphoneModel() {}

    public Long getId() {
        return id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
