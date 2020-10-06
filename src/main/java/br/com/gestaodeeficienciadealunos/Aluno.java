/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaodeeficienciadealunos;

//import br.com.gestaodeeficienciadealunos.Mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Aluno {
    
    private int cod_ra_aluno = 0;
    private int cod_curso = 0;
    private String nom_aluno = "";
    private String des_email = "";
    private String dta_matricula = "";
    private int num_media_global = 0;

    
    private DefaultTableModel modelo_tabela;

    public Aluno(DefaultTableModel modelo_tabela)
    {
        this.modelo_tabela = modelo_tabela;
    }
      
    public void iniciar() throws SQLException
    {
        Connection con = Mysql.conectar();
        PreparedStatement ps = con.prepareStatement("SELECT cod_ra_aluno, nom_aluno, des_email, DATE_FORMAT(dta_matricula, '%d/%l/%Y') AS DTA_MATRICULA, num_media_global, cod_curso FROM aluno order by nom_aluno asc;");

        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            getModelo_tabela().addRow(new Object[] { rs.getInt("COD_RA_ALUNO"), rs.getInt("COD_CURSO"), rs.getString("NOM_ALUNO"), rs.getString("DES_EMAIL"), rs.getString("DTA_MATRICULA"), rs.getInt("NUM_MEDIA_GLOBAL") });
        }
    }
    
    public void consultar(Aluno a) throws SQLException
    {       
        clearTable();
        
        Connection con = Mysql.conectar();
        PreparedStatement ps = con.prepareStatement("select cod_ra_aluno, nom_aluno, des_email, DATE_FORMAT(dta_matricula, '%d/%l/%Y') AS DTA_MATRICULA, num_media_global, cod_curso from aluno where cod_ra_aluno = ? order by nom_aluno asc");

        ps.setInt(1, a.getCod_ra_aluno());

        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            getModelo_tabela().addRow(new Object[] { rs.getInt("COD_RA_ALUNO"), rs.getInt("COD_CURSO"), rs.getString("NOM_ALUNO"), rs.getString("DES_EMAIL"), rs.getString("DTA_MATRICULA"), rs.getInt("NUM_MEDIA_GLOBAL") });
        }
    }
    
    public void salvar(Aluno a) throws SQLException
    {
        Connection con = Mysql.conectar();
        PreparedStatement ps = con.prepareStatement("INSERT INTO ALUNO set COD_RA_ALUNO = ?, COD_CURSO = ?, NOM_ALUNO = ?, DES_EMAIL = ?, DTA_MATRICULA = ?, NUM_MEDIA_GLOBAL = ?");

        ps.setInt(1, a.getCod_ra_aluno());
        ps.setInt(2, a.getCod_curso());       
        ps.setString(3, a.getNom_aluno());
        ps.setString(4, a.getDes_email());
        ps.setString(5, a.getDta_matricula());
        ps.setInt(6, a.getNum_media_global());
        
        ps.execute();
        Mysql.desconectar();
    }
    
    public void editar(Aluno a) throws SQLException
    {
        Connection con = Mysql.conectar();
        PreparedStatement ps = con.prepareStatement("UPDATE aluno SET COD_CURSO = ?, NOM_ALUNO = ?, DES_EMAIL = ?, DTA_MATRICULA = ?, NUM_MEDIA_GLOBAL = ? WHERE COD_RA_ALUNO = ?");

        ps.setInt(1, a.getCod_curso());       
        ps.setString(2, a.getNom_aluno());
        ps.setString(3, a.getDes_email());
        ps.setString(4, a.getDta_matricula());
        ps.setInt(5, a.getNum_media_global());
        ps.setInt(6, a.getCod_ra_aluno());

        ps.execute();
        Mysql.desconectar();
    }
    
    public void deletar(int id) throws SQLException
    {
        Connection con = Mysql.conectar();
        PreparedStatement ps = con.prepareStatement("DELETE FROM aluno WHERE COD_RA_ALUNO = ?");

        ps.setInt(1, id);

        ps.execute();
        Mysql.desconectar();
    }
    
    public Object getRowObject() throws SQLException
    {
        Object obj = null;
        Connection con = Mysql.conectar();
        PreparedStatement ps = con.prepareStatement("select * from aluno order by nom_aluno DESC LIMIT 1");
        
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            obj = new Object[] { rs.getInt("COD_RA_ALUNO"), rs.getInt("COD_CURSO"), rs.getString("NOM_ALUNO"), rs.getString("DES_EMAIL"), rs.getString("DTA_MATRICULA"), rs.getInt("NUM_MEDIA_GLOBAL") };
        }
        return obj;
    }
    
    public void resetTable() throws SQLException
    {
        clearTable();          
        iniciar();
    }
    
    public void clearTable() throws SQLException
    {
        getModelo_tabela().setRowCount(0);
    }

    /**
     * @return the cod_ra_aluno
     */
    public int getCod_ra_aluno() {
        return cod_ra_aluno;
    }

    /**
     * @param cod_ra_aluno the cod_ra_aluno to set
     */
    public void setCod_ra_aluno(int cod_ra_aluno) {
        this.cod_ra_aluno = cod_ra_aluno;
    }

    /**
     * @return the cod_curso
     */
    public int getCod_curso() {
        return cod_curso;
    }

    /**
     * @param cod_curso the cod_curso to set
     */
    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    /**
     * @return the nom_aluno
     */
    public String getNom_aluno() {
        return nom_aluno;
    }

    /**
     * @param nom_aluno the nom_aluno to set
     */
    public void setNom_aluno(String nom_aluno) {
        this.nom_aluno = nom_aluno;
    }

    /**
     * @return the des_email
     */
    public String getDes_email() {
        return des_email;
    }

    /**
     * @param des_email the des_email to set
     */
    public void setDes_email(String des_email) {
        this.des_email = des_email;
    }

    /**
     * @return the dta_matricula
     */
    public String getDta_matricula() {
        return dta_matricula;
    }

    /**
     * @param dta_matricula the dta_matricula to set
     */
    public void setDta_matricula(String dta_matricula) {
        this.dta_matricula = dta_matricula;
    }

    /**
     * @return the num_media_global
     */
    public int getNum_media_global() {
        return num_media_global;
    }

    /**
     * @param num_media_global the num_media_global to set
     */
    public void setNum_media_global(int num_media_global) {
        this.num_media_global = num_media_global;
    }

    /**
     * @return the modelo_tabela
     */
    public DefaultTableModel getModelo_tabela() {
        return modelo_tabela;
    }

    /**
     * @param modelo_tabela the modelo_tabela to set
     */
    public void setModelo_tabela(DefaultTableModel modelo_tabela) {
        this.modelo_tabela = modelo_tabela;
    }

}
