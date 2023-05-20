package com.reservas.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceBooking {

    @Autowired
    private final RepositoryBooking repositoryBooking;

    @Autowired
    public ServiceBooking (RepositoryBooking repositoryBooking){
        this.repositoryBooking = repositoryBooking;
    }

    public List<Booking> list(){
        return this.repositoryBooking.findAll();
    }

    public Booking show(Long id){
        return this.repositoryBooking.findById(id).get();
    }

    public Booking create(Booking booking){
        return this.repositoryBooking.save(booking);
    }

    public Booking edit(Booking booking){
        return this.repositoryBooking.save(booking);
    }

    public void delete(Long id){
        this.repositoryBooking.deleteById(id);
    }
}
