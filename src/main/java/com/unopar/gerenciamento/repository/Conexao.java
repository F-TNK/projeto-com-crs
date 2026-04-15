/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unopar.gerenciamento.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ftana
 */
public class Conexao {
    
    private static String url = "jdbc:mysql://localhost:3306/empresa_db";
    private static String user = "root";
    private static String senha = "fabio";
    private static Connection conn = null; // metodo syncronized, cria a 
                                           // conexao 1 vez so reutiliza
    
    
    private Conexao(){
    }
    
    
    public static synchronized Connection conectar(){
        try {
            
            if (conn == null || conn.isClosed()){
                conn = DriverManager.getConnection(url, user, senha);
            }
            
        } catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    
    
}
