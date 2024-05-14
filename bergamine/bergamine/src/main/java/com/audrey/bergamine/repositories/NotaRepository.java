package com.audrey.bergamine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.audrey.bergamine.models.Nota;

import jakarta.transaction.Transactional;

public interface NotaRepository extends JpaRepository<Nota, Integer>{
    @Modifying
    @Transactional
    @Query
    ("DELETE FROM Nota n WHERE n.id = :notaId")
    void deleteById(Integer notaId);        

    
} 
