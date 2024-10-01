package com.example.explorecalijpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.explorecalijpa.model.*;
import java.util.List;

public interface TourRepository extends JpaRepository<Tour, Integer> {

  List<Tour> findByDifficulty(Difficulty difficulty);

  List<Tour> findByTourPackageCode(String tourPackageCode);
}