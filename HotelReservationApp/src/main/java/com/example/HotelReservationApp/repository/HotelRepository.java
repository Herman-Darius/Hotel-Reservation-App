package com.example.HotelReservationApp.repository;

import com.example.HotelReservationApp.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;;

public interface HotelRepository extends JpaRepository<Hotel, Long>{
}
