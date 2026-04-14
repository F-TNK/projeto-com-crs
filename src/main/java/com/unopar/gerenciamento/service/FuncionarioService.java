/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unopar.gerenciamento.service;

import com.unopar.gerenciamento.model.FuncionarioDto;
import com.unopar.gerenciamento.repository.FuncionarioDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ftana
 */
@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioDAO repository;
    
    public List<FuncionarioDto> lerTodos(){
        return repository.lerTodos();
    }
}
