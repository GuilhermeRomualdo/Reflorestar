/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import view.JIFPropriedades;
/**
 *
 * @author Guilherme
 */
public class SituacaoData {
    
    ConexaoMySQL objCon = new ConexaoMySQL();
    String situacao_data;
    int area_refl;
    int area_total;
    int area_plantada;
    int terra_nua;
    int total_refl;
    float preco_arvore;
    float preco_total;
    /*
    public boolean Incluir(String propriedade) {
        try {
            objCon.stmt = objCon.con.createStatement();
            String SQL = "SELECT * FROM bd_situacao WHERE propriedade ="+String.valueOf(propriedade)+";";
            objCon.rs = objCon.stmt.executeQuery(SQL);
            while(!propriedade.equals(objCon.rs.getString(propriedade))) {
                objCon.rs.next();
            }
            
            situacao_data = objCon.rs.getString("situacao");
            
            objCon.stmt = objCon.con.createStatement();
            String _SQL = "SELECT * FROM bd_refl WHERE propriedade ="+String.valueOf(propriedade)+";";
            objCon.rs = objCon.stmt.executeQuery(SQL);
            while(!propriedade.equals(objCon.rs.getString(propriedade))) {
                objCon.rs.next();
            }
            
            area_refl = Integer.parseInt(objCon.rs.getString("area_arvore"));
            preco_arvore = Float.parseFloat(objCon.rs.getString("preco_arvore"));
            
            objCon.stmt = objCon.con.createStatement();
            String _SQL_propriedades = "SELECT * FROM  bd_jifpropriedades WHERE descricao ='%"+String.valueOf(propriedade)+"%';";
            objCon.rs = objCon.stmt.executeQuery(SQL);
            while(!propriedade.equals(objCon.rs.getString(propriedade))) {
                objCon.rs.next();
            }

            area_total = Integer.parseInt(objCon.rs.getString("area_total")); 
            area_plantada =  Integer.parseInt(objCon.rs.getString("area_plantada"));
            terra_nua = Integer.parseInt(objCon.rs.getString("terra_nua"));
            
            if(situacao_data.equals("Corretamente Reflorestado")) {
                return true;
            }
            else if(situacao_data.equals("Faltando Reflorestar"+(area_total - area_plantada))) {
                total_refl = area_total - area_plantada ;
                preco_total = total_refl*preco_arvore;
                return true;
            }
            else {
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JIFPropriedades.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } */
}
