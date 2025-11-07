package com.example.demos_.Service;

import java.util.List;
import java.util.Optional;
import com.example.demos_.Entities.Character;

public interface CharacterService {
    List<Character> findAll();
    Optional<Character> findById(Long id);
    Character save(Character character);
    Character update(Long id, Character character);
    void delete(Long id);


}
