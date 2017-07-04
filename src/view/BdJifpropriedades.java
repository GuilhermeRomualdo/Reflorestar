/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Guilherme
 */
@Entity
@Table(name = "bd_jifpropriedades", catalog = "bd_reflorestar", schema = "")
@NamedQueries({
    @NamedQuery(name = "BdJifpropriedades.findAll", query = "SELECT b FROM BdJifpropriedades b"),
    @NamedQuery(name = "BdJifpropriedades.findByCodigo", query = "SELECT b FROM BdJifpropriedades b WHERE b.codigo = :codigo"),
    @NamedQuery(name = "BdJifpropriedades.findByDescricao", query = "SELECT b FROM BdJifpropriedades b WHERE b.descricao = :descricao"),
    @NamedQuery(name = "BdJifpropriedades.findByProprietario", query = "SELECT b FROM BdJifpropriedades b WHERE b.proprietario = :proprietario"),
    @NamedQuery(name = "BdJifpropriedades.findByNirf", query = "SELECT b FROM BdJifpropriedades b WHERE b.nirf = :nirf"),
    @NamedQuery(name = "BdJifpropriedades.findByAreaTotal", query = "SELECT b FROM BdJifpropriedades b WHERE b.areaTotal = :areaTotal"),
    @NamedQuery(name = "BdJifpropriedades.findByBoolManancial", query = "SELECT b FROM BdJifpropriedades b WHERE b.boolManancial = :boolManancial"),
    @NamedQuery(name = "BdJifpropriedades.findByLarguraManancial", query = "SELECT b FROM BdJifpropriedades b WHERE b.larguraManancial = :larguraManancial"),
    @NamedQuery(name = "BdJifpropriedades.findByAreaPlantada", query = "SELECT b FROM BdJifpropriedades b WHERE b.areaPlantada = :areaPlantada"),
    @NamedQuery(name = "BdJifpropriedades.findByBenfeitoria", query = "SELECT b FROM BdJifpropriedades b WHERE b.benfeitoria = :benfeitoria"),
    @NamedQuery(name = "BdJifpropriedades.findByEndereco", query = "SELECT b FROM BdJifpropriedades b WHERE b.endereco = :endereco"),
    @NamedQuery(name = "BdJifpropriedades.findByCep", query = "SELECT b FROM BdJifpropriedades b WHERE b.cep = :cep"),
    @NamedQuery(name = "BdJifpropriedades.findByComplemento", query = "SELECT b FROM BdJifpropriedades b WHERE b.complemento = :complemento"),
    @NamedQuery(name = "BdJifpropriedades.findByMunicipio", query = "SELECT b FROM BdJifpropriedades b WHERE b.municipio = :municipio"),
    @NamedQuery(name = "BdJifpropriedades.findByEstado", query = "SELECT b FROM BdJifpropriedades b WHERE b.estado = :estado"),
    @NamedQuery(name = "BdJifpropriedades.findByLatitude", query = "SELECT b FROM BdJifpropriedades b WHERE b.latitude = :latitude"),
    @NamedQuery(name = "BdJifpropriedades.findByLongitude", query = "SELECT b FROM BdJifpropriedades b WHERE b.longitude = :longitude"),
    @NamedQuery(name = "BdJifpropriedades.findByDivisa", query = "SELECT b FROM BdJifpropriedades b WHERE b.divisa = :divisa"),
    @NamedQuery(name = "BdJifpropriedades.findByTipoArvore", query = "SELECT b FROM BdJifpropriedades b WHERE b.tipoArvore = :tipoArvore"),
    @NamedQuery(name = "BdJifpropriedades.findByPrecoRefl", query = "SELECT b FROM BdJifpropriedades b WHERE b.precoRefl = :precoRefl")})
    //@NamedQuery(name = "BdJifpropriedades.findBySituacao", query = "SELECT b FROM BdJifpropriedades b WHERE b.situacao = :situacao")})
public class BdJifpropriedades implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "proprietario")
    private String proprietario;
    @Basic(optional = false)
    @Column(name = "nirf")
    private int nirf;
    @Basic(optional = false)
    @Column(name = "area_total")
    private int areaTotal;
    @Basic(optional = false)
    @Column(name = "bool_manancial")
    private String boolManancial;
    @Basic(optional = false)
    @Column(name = "largura_manancial")
    private int larguraManancial;
    @Basic(optional = false)
    @Column(name = "area_plantada")
    private int areaPlantada;
    @Basic(optional = false)
    @Column(name = "benfeitoria")
    private int benfeitoria;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "CEP")
    private int cep;
    @Basic(optional = false)
    @Column(name = "complemento")
    private String complemento;
    @Basic(optional = false)
    @Column(name = "municipio")
    private String municipio;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "latitude")
    private int latitude;
    @Basic(optional = false)
    @Column(name = "longitude")
    private int longitude;
    @Basic(optional = false)
    @Column(name = "divisa")
    private String divisa;
    @Basic(optional = false)
    @Column(name = "tipo_arvore")
    private String tipoArvore;
    @Basic(optional = false)
    @Column(name = "preco_refl")
    private float precoRefl;
  /*  @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao; */

    public BdJifpropriedades() {
    }

    public BdJifpropriedades(Integer codigo) {
        this.codigo = codigo;
    }

    public BdJifpropriedades(Integer codigo, String descricao, String proprietario, int nirf, int areaTotal, String boolManancial, int larguraManancial, int areaPlantada, int benfeitoria, String endereco, int cep, String complemento, String municipio, String estado, int latitude, int longitude, String divisa, String tipoArvore, float precoRefl/*, String situacao*/) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.proprietario = proprietario;
        this.nirf = nirf;
        this.areaTotal = areaTotal;
        this.boolManancial = boolManancial;
        this.larguraManancial = larguraManancial;
        this.areaPlantada = areaPlantada;
        this.benfeitoria = benfeitoria;
        this.endereco = endereco;
        this.cep = cep;
        this.complemento = complemento;
        this.municipio = municipio;
        this.estado = estado;
        this.latitude = latitude;
        this.longitude = longitude;
        this.divisa = divisa;
        this.tipoArvore = tipoArvore;
        this.precoRefl = precoRefl;
       // this.situacao = situacao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        String oldProprietario = this.proprietario;
        this.proprietario = proprietario;
        changeSupport.firePropertyChange("proprietario", oldProprietario, proprietario);
    }

    public int getNirf() {
        return nirf;
    }

    public void setNirf(int nirf) {
        int oldNirf = this.nirf;
        this.nirf = nirf;
        changeSupport.firePropertyChange("nirf", oldNirf, nirf);
    }

    public int getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(int areaTotal) {
        int oldAreaTotal = this.areaTotal;
        this.areaTotal = areaTotal;
        changeSupport.firePropertyChange("areaTotal", oldAreaTotal, areaTotal);
    }

    public String getBoolManancial() {
        return boolManancial;
    }

    public void setBoolManancial(String boolManancial) {
        String oldBoolManancial = this.boolManancial;
        this.boolManancial = boolManancial;
        changeSupport.firePropertyChange("boolManancial", oldBoolManancial, boolManancial);
    }

    public int getLarguraManancial() {
        return larguraManancial;
    }

    public void setLarguraManancial(int larguraManancial) {
        int oldLarguraManacial = this.larguraManancial;
        this.larguraManancial = larguraManancial;
        changeSupport.firePropertyChange("larguraManancial", oldLarguraManacial, larguraManancial);
    }

    public int getAreaPlantada() {
        return areaPlantada;
    }

    public void setAreaPlantada(int areaPlantada) {
        int oldAreaPlantada = this.areaPlantada;
        this.areaPlantada = areaPlantada;
        changeSupport.firePropertyChange("areaPlantada", oldAreaPlantada, areaPlantada);
    }

    public int getBenfeitoria() {
        return benfeitoria;
    }

    public void setBenfeitoria(int benfeitoria) {
        int oldBenfeitoria = this.benfeitoria;
        this.benfeitoria = benfeitoria;
        changeSupport.firePropertyChange("benfeitoria", oldBenfeitoria, benfeitoria);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        int oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        String oldMunicipio = this.municipio;
        this.municipio = municipio;
        changeSupport.firePropertyChange("municipio", oldMunicipio, municipio);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        int oldLatitude = this.latitude;
        this.latitude = latitude;
        changeSupport.firePropertyChange("latitude", oldLatitude, latitude);
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        int oldLongitude = this.longitude;
        this.longitude = longitude;
        changeSupport.firePropertyChange("longitude", oldLongitude, longitude);
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        String oldDivisa = this.divisa;
        this.divisa = divisa;
        changeSupport.firePropertyChange("divisa", oldDivisa, divisa);
    }

    public String getTipoArvore() {
        return tipoArvore;
    }

    public void setTipoArvore(String tipoArvore) {
        String oldTipoArvore = this.tipoArvore;
        this.tipoArvore = tipoArvore;
        changeSupport.firePropertyChange("tipoArvore", oldTipoArvore, tipoArvore);
    }

    public float getPrecoRefl() {
        return precoRefl;
    }

    public void setPrecoRefl(float precoRefl) {
        float oldPrecoRefl = this.precoRefl;
        this.precoRefl = precoRefl;
        changeSupport.firePropertyChange("precoRefl", oldPrecoRefl, precoRefl);
    }

/*    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        String oldSituacao = this.situacao;
        this.situacao = situacao;
        changeSupport.firePropertyChange("situacao", oldSituacao, situacao);
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BdJifpropriedades)) {
            return false;
        }
        BdJifpropriedades other = (BdJifpropriedades) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.BdJifpropriedades[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
