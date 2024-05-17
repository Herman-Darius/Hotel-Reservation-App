package com.example.HotelReservationApp.service;

import com.example.HotelReservationApp.model.Room;
import com.example.HotelReservationApp.repository.RoomRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> findByHotelId(Long hotelId) {
        return roomRepository.findAll().stream().filter(room -> room.getHotel().getId().equals(hotelId)).toList();
    }

    public Room findById(Long id) {
        return roomRepository.findById(id).orElseThrow(() -> new RuntimeException("Room not found"));
    }

    public Room save(Room room) {
        return roomRepository.save(room);
    }
}
