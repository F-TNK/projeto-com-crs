/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unopar.gerenciamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ftana
 */
@Controller
public class FuncionarioControler {
    
    @GetMapping("/funcionarios")
    public String getFuncionarios(){
        return "funcionarios";
    }
}
