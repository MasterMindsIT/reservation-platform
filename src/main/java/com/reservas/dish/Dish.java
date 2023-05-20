package com.reservas.dish;

import com.reservas.categorydish.CategoryDish;
import com.reservas.configrestaurant.ConfigRestaurant;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private String price;

    @Column(name = "image")
    private String image;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "categorydish_id", referencedColumnName = "id")
    private CategoryDish categoryDish;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "configRestaurant_id", referencedColumnName = "id")
    private ConfigRestaurant configRestaurant;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date created;

    @UpdateTimestamp
    @Column(name = "updated_at",updatable = true)
    private Date updated;
}
