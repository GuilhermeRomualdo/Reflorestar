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
public class Produto {

    
    private int codigo;
    private String descricao;
    private String proprietario;
    private String Nirf;
    private int area_total;
    private static boolean sim_manancial; //nao consigo acessar por get
    private static boolean nao_manancial;
    private int largura_manancial;
    private int area_plantada;
    private int benfeitoria;
    private String endereco;
    private int CEP;
    private String complemento;
    private String municipio;
    private String estado;
    private String latitude;
    private String longitude;
    private String divisa;
    private static String tipo_arvore; //nao consigo acessar por get
    private float preco_refl;
    private String situacao;

    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the proprietario
     */
    public String getProprietario() {
        return proprietario;
    }

    /**
     * @param proprietario the proprietario to set
     */
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * @return the Nirf
     */
    public String getNirf() {
        return Nirf;
    }

    /**
     * @param Nirf the Nirf to set
     */
    public void setNirf(String Nirf) {
        this.Nirf = Nirf;
    }


    /**
     * @return the benfeitoria
     */
    public int getBenfeitoria() {
        return benfeitoria;
    }

    /**
     * @param benfeitoria the benfeitoria to set
     */
    public void setBenfeitoria(int benfeitoria) {
        this.benfeitoria = benfeitoria;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the CEP
     */
    public int getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the divisa
     */
    public String getDivisa() {
        return divisa;
    }

    /**
     * @param divisa the divisa to set
     */
    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    /**
     * @return the sim_manancial
     */
    public static boolean isSim_manancial() {
        return sim_manancial;
    }

    /**
     * @param simmanancial the sim_manancial to set
     */
    public void setSim_manancial(boolean simmanancial) {
        sim_manancial = simmanancial;
    }

    /**
     * @return the nao_manancial
     */
    public static boolean isNao_manancial() {
        return nao_manancial;
    }

    /**
     * @param naomanancial the nao_manancial to set
     */
    public void setNao_manancial(boolean naomanancial) {
        nao_manancial = naomanancial;
    }

    /**
     * @return the largura_manancial
     */
    public int getLargura_manancial() {
        return largura_manancial;
    }

    /**
     * @param largura_manancial the largura_manancial to set
     */
    public void setLargura_manancial(int largura_manancial) {
        this.largura_manancial = largura_manancial;
    }

    /**
     * @return the tipo_arvore
     */
    public static String getTipo_arvore() {
        return tipo_arvore;
    }

    /**
     * @param tipoarvore the tipo_arvore to set
     */
    public void setTipo_arvore(String tipoarvore) {
        tipo_arvore = tipoarvore;
    }

    /**
     * @return the preco_refl
     */
    public float getPreco_refl() {
        return preco_refl;
    }

    /**
     * @param preco_refl the preco_refl to set
     */
    public void setPreco_refl(float preco_refl) {
        this.preco_refl = preco_refl;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the area_total
     */
    public int getArea_total() {
        return area_total;
    }

    /**
     * @param area_total the area_total to set
     */
    public void setArea_total(int area_total) {
        this.area_total = area_total;
    }

    /**
     * @return the area_plantada
     */
    public int getArea_plantada() {
        return area_plantada;
    }

    /**
     * @param area_plantada the area_plantada to set
     */
    public void setArea_plantada(int area_plantada) {
        this.area_plantada = area_plantada;
    }

}

/*

JFPropriedades

declarações
    ConexaoMySQL objCon = new ConexaoMySQL();
    String SQL;
    public int Row;

button1 (pesquisar) action performed { 
  try {
            objCon.openConnectionMySql();
            objCon.stmt = objCon.con.createStatement();
            
            boolean number;
            double value;
            
            try {
                value = (Double.parseDouble(jTextField1.getText()));
                number = true;
            } catch (NumberFormatException e) {	  
                number = false;
            }
                
            if(number)
                SQL = "SELECT * FROM bd_jifpropriedades WHERE codigo LIKE '"+jTextField1.getText()+"%'";
            else
                SQL = "SELECT * FROM bd_jifpropriedades WHERE descricao LIKE '"+jTextField1.getText()+"%'";
            
            objCon.rs = objCon.stmt.executeQuery(SQL);
            //Seleciona a primeira linha do banco
            objCon.rs.getStatement();
        }catch(SQLException ex) {
            Logger.getLogger(JIFPropriedades.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Tabela não pode ser exibida!");
        }
}

button2 (ok) action performed {
     Row =  jTable1.getSelectedRow();
}
*/