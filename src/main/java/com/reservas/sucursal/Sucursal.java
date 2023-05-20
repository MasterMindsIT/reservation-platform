package com.reservas.sucursal;

import com.reservas.booking.Booking;
import com.reservas.configrestaurant.ConfigRestaurant;
import com.reservas.sucursalmap.Maps;
import com.reservas.sucursalschedule.Schedule;
import com.reservas.table.TableRest;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "sucursal")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "observation")
    private String observation;

    @Column(name="address")
    private String address;

    @Column(name="location")
    private String location;

    @Column(name = "postalCode")
    private String postalCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "smoking")
    private Boolean smoking;

    @Column(name = "in_side")
    private Boolean in_side;

    @Column(name = "out_side")
    private Boolean out_side;


    @Column(name = "diffTimeBooking")
    private LocalTime diffTimeBooking;

    @Column(name = "timeSeat")
    private LocalTime timeSeat;

    @Column(name = "overBooking")
    private Boolean overBooking;

    @Column(name = "maxWaiting")
    private LocalTime maxWaiting;

    @Column(name = "status")
    private Boolean status;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "configRestaurant_id", referencedColumnName = "id")
    private ConfigRestaurant configRestaurant;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "sucursal_id", referencedColumnName = "id")
    private List<TableRest> tables;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "maps_id", referencedColumnName = "id")
    private Maps maps;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "sucursal_id", referencedColumnName = "id")
    private List<Booking> bookings;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "sucursal_id", referencedColumnName = "id")
    private List<Schedule> schedules;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date created;

    @UpdateTimestamp
    @Column(name = "updated_at",updatable = true)
    private Date updated;
}
