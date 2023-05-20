package com.reservas.configrestaurant;

import com.reservas.client.Client;
import com.reservas.dish.Dish;
import com.reservas.follow.Follow;
import com.reservas.raiting.Raiting;
import com.reservas.sucursal.Sucursal;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "config_restaurant")
public class ConfigRestaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "slogan")
    private String slogan;

    @Column(name = "logo")
    private String logo;

    @Column(name = "description")
    private String description;

    @Column(name="address")
    private String address;

    @Column(name = "postalCode")
    private String postalCode;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "media_raiting")
    private Double media_raiting;

    @Column(name = "phone")
    private LocalDate phone;

    @Column(name = "codeTrade")
    private String codeTrade;

    @Column(name = "email")
    private String email;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "configRestaurant_id", referencedColumnName = "id")
    private List<Sucursal> sucursals;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "configRestaurant_id", referencedColumnName = "id")
    private List<Dish> dishes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "configRestaurant_id", referencedColumnName = "id")
    private List<Follow> follows;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "configRestaurant_id", referencedColumnName = "id")
    private List<Raiting> raiting;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date created;

    @UpdateTimestamp
    @Column(name = "updated_at",updatable = true)
    private Date updated;
}
