package com.reservas.booking;

import com.reservas.client.Client;
import com.reservas.state.States;
import com.reservas.sucursal.Sucursal;
import com.reservas.table.TableRest;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="dateBook")
    private LocalDate dateBook;

    @Column(name="people")
    private Integer people;

    @Column(name = "timeBook")
    private LocalTime timeBook;

    @Column(name = "origin")
    private String origin;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "tables_id", referencedColumnName = "id")
    private TableRest tableRest;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "states_id", referencedColumnName = "id")
    private States states;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "sucursal_id", referencedColumnName = "id")
    private Sucursal sucursal;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date created;

    @UpdateTimestamp
    @Column(name = "updated_at",updatable = true)
    private Date updated;

}
