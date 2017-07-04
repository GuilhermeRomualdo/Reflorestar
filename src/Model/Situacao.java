/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Guilherme
 */
public class Situacao {

    public Situacao(int ID, String Propriedade, String Descricao) {
        this.ID = ID;
        this.Propriedade = Propriedade;
        this.Descricao = Descricao;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPropriedade() {
        return Propriedade;
    }

    public void setPropriedade(String Propriedade) {
        this.Propriedade = Propriedade;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    private int ID;
    private String Propriedade;
    private String Descricao;
}
