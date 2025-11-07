package com.example.demos_.Service.impl;

import com.example.demos_.Service.CharacterService;
import com.example.demos_.repository.CharacterRepository;
import org.springframework.stereotype.Service;
import com.example.demos_.Entities.Character;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public List<Character> findAll() {
        return characterRepository.findAll();
    }

    @Override
    public Optional<Character> findById(Long id) {
        return characterRepository.findById(id);
    }

    @Override
    public Character save(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public Character update(Long id, Character character) {
        return characterRepository.findById(id)
                .map(existing -> {
                    existing.setName(character.getName());
                    existing.setRace(character.getRace());
                    existing.setKi(character.getKi());
                    existing.setMaxKi(character.getMaxKi());
                    existing.setImage(character.getImage());
                    existing.setDescription(character.getDescription());
                    return characterRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Character not found with id " + id));
    }

    @Override
    public void delete(Long id) {
        characterRepository.deleteById(id);
    }
}
