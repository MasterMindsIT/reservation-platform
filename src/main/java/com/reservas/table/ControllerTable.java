package com.reservas.table;

import com.reservas.booking.Booking;
import com.reservas.booking.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/table")
public class ControllerTable {
    @Autowired
    private final ServiceTable serviceTable;
    @Autowired
    public ControllerTable(ServiceTable serviceTable) {
        this.serviceTable = serviceTable;
    }

    @GetMapping
    public List<TableRest> list(){
        return this.serviceTable.list();
    }
    @GetMapping("/{id}")
    public TableRest show(@PathVariable Long id){
        return this.serviceTable.show(id);
    }

    @PostMapping
    public TableRest create(@RequestBody TableRest tableRest){
        return this.serviceTable.create(tableRest);
    }

    @PutMapping
    public TableRest edit(@RequestBody TableRest tableRest){
        return this.serviceTable.edit(tableRest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceTable.delete(id);
    }
}
