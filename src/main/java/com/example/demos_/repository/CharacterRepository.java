package com.example.demos_.repository;

import com.example.demos_.Entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character,Long> {

}

