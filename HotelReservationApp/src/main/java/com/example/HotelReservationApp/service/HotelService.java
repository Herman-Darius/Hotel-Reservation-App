package com.example.HotelReservationApp.service;

import com.example.HotelReservationApp.model.Hotel;
import com.example.HotelReservationApp.repository.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> findAll(){
        return hotelRepository.findAll();
    }

    public Hotel findById(Long id){
        return hotelRepository.findById(id).orElseThrow(() -> new RuntimeException("Hotel not found"));
    }
    
}
