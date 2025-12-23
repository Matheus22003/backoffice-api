package com.github.matheussimoes.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @Min(1)
    private double price;

    private boolean active;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotBlank String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank String description) {
        this.description = description;
    }

    @Min(1)
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(1) double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}