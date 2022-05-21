package com.example.demo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.NumberFormat;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LineItem {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "cart_id", insertable = false, updatable = false)
    private Cart cart;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    public double getTotal() {
        double total = product.getPrice() * quantity;
        return total;
    }

    @Override
    public String toString() {
        return String.format("%s|%s", product.toString(), String.valueOf(quantity));
    }

}

