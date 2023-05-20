package com.reservas.table;

import com.reservas.booking.Booking;
import com.reservas.sucursal.Sucursal;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "table_rest")
public class TableRest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "position")
    private String position;

    @Column(name = "capacity")
    private Integer capacity;


    @Column(name="maxPeople")
    private Integer maxPeople;

    @Column(name="minPeople")
    private Integer minPeople;

    @Column(name = "status")
    private Boolean status;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "sucursal_id", referencedColumnName = "id")
    private Sucursal sucursal;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "tables_id", referencedColumnName = "id")
    private List<Booking> bookings;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date created;

    @UpdateTimestamp
    @Column(name = "updated_at",updatable = true)
    private Date updated;
}
