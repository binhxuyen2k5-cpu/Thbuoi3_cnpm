package com.buoith3.bai3.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    // Quan hệ 1 Category có nhiều Product[span_6](start_span)[span_6](end_span)
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;
}   