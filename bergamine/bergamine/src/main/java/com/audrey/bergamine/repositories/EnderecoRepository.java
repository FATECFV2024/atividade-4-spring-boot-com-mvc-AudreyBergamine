package com.audrey.bergamine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.audrey.bergamine.models.Endereco;

import jakarta.transaction.Transactional;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
    @Modifying
    @Transactional
    @Query
    ("DELETE FROM Endereco n WHERE n.id = :enderecoId")
    void deleteById(Integer enderecoId);        


    
} 
