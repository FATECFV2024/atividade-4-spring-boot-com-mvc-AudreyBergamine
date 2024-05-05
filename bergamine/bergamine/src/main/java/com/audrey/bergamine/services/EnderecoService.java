package com.audrey.bergamine.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.audrey.bergamine.models.Endereco;
import com.audrey.bergamine.repositories.EnderecoRepository;

@Component
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;


    public Endereco insert(Endereco obj) {
        return enderecoRepository.save(obj);
    }

    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    public Endereco findById(Integer id) {
        Optional<Endereco> endereco = enderecoRepository.findById(id);
        return endereco.get();
    }

    
 
    public Endereco update(Integer id, Endereco obj) {
        Endereco endereco = enderecoRepository.getReferenceById(id);
        updateData(endereco, obj);
        return enderecoRepository.save(endereco);
    }
 
 
    private void updateData(Endereco endereco, Endereco obj){
        endereco.setRua(obj.getRua());
        endereco.setCidade(obj.getCidade());
        endereco.setEstado(obj.getEstado());
        endereco.setNumero(obj.getNumero());
        endereco.setCep(obj.getCep());
     
    }

    public void delete(Integer id) {
        enderecoRepository.deleteById(id);
    }


}
