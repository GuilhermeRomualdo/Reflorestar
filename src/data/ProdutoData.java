/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import view.JIFPropriedades;


/**
 *
 * @author Guilherme
 */
public class ProdutoData {
    
    int area_arvore;
    float total_refl;
    float preco_arvore;
    float preco_total;
    String situacao_data;
    String tipo_arvore;
    String bioma;
    ConexaoMySQL objCon = new ConexaoMySQL();
    Produto obj = new Produto();
    //JIFPropriedades obj_p = new JIFPropriedades();
    
    public float calculaProduto(int area_total, int area_plantada, int benfeitoria, String estado) throws IOException {
        
         objCon.openConnectionMySql();
         
        //colocar aqui if estado { bioma = *** }
        if (estado.equals("AM") || estado.equals("PA") || estado.equals("RR") || estado.equals("AP") || estado.equals("AC") || estado.equals("RO") ||
               estado.equals("am") || estado.equals("pa") || estado.equals("rr") || estado.equals("ap") || estado.equals("ac") || estado.equals("ro"))
            bioma = "Amazonia";
        
        if (estado.equals("MA") || estado.equals("TO") || estado.equals("GO") || estado.equals("MT") || estado.equals("MG") ||
               estado.equals("ma") || estado.equals("to") || estado.equals("go") || estado.equals("mt") || estado.equals("mg"))
            bioma = "Cerrado";
        
        if (estado.equals("PI") || estado.equals("CE") || estado.equals("RN") || estado.equals("PB") || estado.equals("PE") || estado.equals("BA") ||
            estado.equals("pi") || estado.equals("ce") || estado.equals("rn") || estado.equals("pb") || estado.equals("pe") || estado.equals("ba"))
            bioma = "Caatinga";
        
        if (estado.equals("AL") || estado.equals("SE") || estado.equals("ES") || estado.equals("RJ") || estado.equals("SP") || estado.equals("PR") || estado.equals("SC") ||
                estado.equals("al") || estado.equals("se") || estado.equals("es") || estado.equals("rj") || estado.equals("sp") || estado.equals("pr") || estado.equals("sc"))
            bioma = "Mata Atlantica";
        
        if (estado.equals("RS") || estado.equals("rs"))
            bioma = "Pampa";
        
        if (estado.equals("MS") || estado.equals("ms"))
            bioma = "Pantanal";
                
        try {
            String SQL = "SELECT * FROM bd_refl WHERE bioma = '"+bioma+"'";
            objCon.rs = objCon.stmt.executeQuery(SQL);
            while(objCon.rs.next()) {
                tipo_arvore = String.valueOf(objCon.rs.getString("nome_arvore"));
                obj.setTipo_arvore(tipo_arvore);
                preco_arvore = Float.parseFloat(objCon.rs.getString("preco_arvore"));
                area_arvore = Integer.parseInt(objCon.rs.getString("area_arvore"));
            }
                if(obj.isSim_manancial()) { //se for calculo de manancial entra nesse if
                    total_refl = (float) ((area_total - area_plantada - benfeitoria)/area_arvore);
                    //area da arvore é a area que ela ocupa no total (inclui a copa)
                }

                else { //sendo calculo de area normal, ignora o calculo de mananciais
                    if(estado.equals("AM")) {
                        total_refl = (float) (((area_total - area_plantada - benfeitoria)/area_arvore)*0.8); 
                        //area da arvore é a area que ela ocupa no total (inclui a copa)
                    } else {
                        total_refl = (float) (((area_total - area_plantada - benfeitoria)/area_arvore)*0.2); 
                    }
                }
                
            preco_total = total_refl*preco_arvore;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objCon.closeConnectionMySql(objCon.con, objCon.stmt);
        }
        
        return preco_total;
    }
    
    public List<Produto> readProduto() {
     
        objCon.openConnectionMySql();
        String SQL;
        List <Produto> produtos = new ArrayList<>();
        
        try {
            
            SQL = "SELECT * FROM bd_jifpropriedades";
            
            objCon.stmt = objCon.con.createStatement();
            objCon.rs = objCon.stmt.executeQuery(SQL);
            
            while (objCon.rs.next()) {
                Produto objProd = new Produto();
                
                objProd.setCodigo(objCon.rs.getInt("codigo"));
                objProd.setDescricao(objCon.rs.getString("descricao"));
                objProd.setArea_plantada(objCon.rs.getInt("area_plantada"));
                objProd.setArea_total(objCon.rs.getInt("area_total"));
                objProd.setBenfeitoria(objCon.rs.getInt("benfeitoria"));
                objProd.setEstado(objCon.rs.getString("estado"));
                objProd.setPreco_refl(objCon.rs.getFloat("preco_refl"));
                objProd.setProprietario(objCon.rs.getString("proprietario"));
                
                produtos.add(objProd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objCon.closeConnectionMySql(objCon.con, objCon.stmt);
        }
        
        return produtos;
    }
    
}

