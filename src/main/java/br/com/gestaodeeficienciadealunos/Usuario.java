/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaodeeficienciadealunos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuario {
    static public String nomeUsuario = "";
    static public int idUsuario = 0;
    
    static public void ativar2FA() throws SQLException{
        Connection con = Mysql.conectar();
        PreparedStatement ps = con.prepareStatement("UPDATE usuario SET 2FA = 1 WHERE COD_USUARIO = ?");

        ps.setInt(1, Usuario.idUsuario);

        ps.execute();
        Mysql.desconectar();
    }
    
    static public void desativar2FA() throws SQLException{
        Connection con = Mysql.conectar();
        PreparedStatement ps = con.prepareStatement("UPDATE usuario SET 2FA = 0 WHERE COD_USUARIO = ?");

        ps.setInt(1, Usuario.idUsuario);

        ps.execute();
        Mysql.desconectar();
    }
}
