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
@Table(name = "bd_proprietarios", catalog = "bd_reflorestar", schema = "")
@NamedQueries({
    @NamedQuery(name = "BdProprietarios.findAll", query = "SELECT b FROM BdProprietarios b"),
    @NamedQuery(name = "BdProprietarios.findByIDproprietario", query = "SELECT b FROM BdProprietarios b WHERE b.iDproprietario = :iDproprietario"),
    @NamedQuery(name = "BdProprietarios.findByNomeproprietario", query = "SELECT b FROM BdProprietarios b WHERE b.nomeproprietario = :nomeproprietario"),
    @NamedQuery(name = "BdProprietarios.findByEnderecoproprietario", query = "SELECT b FROM BdProprietarios b WHERE b.enderecoproprietario = :enderecoproprietario"),
    @NamedQuery(name = "BdProprietarios.findByTelproprietario", query = "SELECT b FROM BdProprietarios b WHERE b.telproprietario = :telproprietario")})
public class BdProprietarios implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_proprietario")
    private Integer iDproprietario;
    @Basic(optional = false)
    @Column(name = "Nome_proprietario")
    private String nomeproprietario;
    @Basic(optional = false)
    @Column(name = "Endereco_proprietario")
    private String enderecoproprietario;
    @Basic(optional = false)
    @Column(name = "Tel_proprietario")
    private int telproprietario;

    public BdProprietarios() {
    }

    public BdProprietarios(Integer iDproprietario) {
        this.iDproprietario = iDproprietario;
    }

    public BdProprietarios(Integer iDproprietario, String nomeproprietario, String enderecoproprietario, int telproprietario) {
        this.iDproprietario = iDproprietario;
        this.nomeproprietario = nomeproprietario;
        this.enderecoproprietario = enderecoproprietario;
        this.telproprietario = telproprietario;
    }

    public Integer getIDproprietario() {
        return iDproprietario;
    }

    public void setIDproprietario(Integer iDproprietario) {
        Integer oldIDproprietario = this.iDproprietario;
        this.iDproprietario = iDproprietario;
        changeSupport.firePropertyChange("IDproprietario", oldIDproprietario, iDproprietario);
    }

    public String getNomeproprietario() {
        return nomeproprietario;
    }

    public void setNomeproprietario(String nomeproprietario) {
        String oldNomeproprietario = this.nomeproprietario;
        this.nomeproprietario = nomeproprietario;
        changeSupport.firePropertyChange("nomeproprietario", oldNomeproprietario, nomeproprietario);
    }

    public String getEnderecoproprietario() {
        return enderecoproprietario;
    }

    public void setEnderecoproprietario(String enderecoproprietario) {
        String oldEnderecoproprietario = this.enderecoproprietario;
        this.enderecoproprietario = enderecoproprietario;
        changeSupport.firePropertyChange("enderecoproprietario", oldEnderecoproprietario, enderecoproprietario);
    }

    public int getTelproprietario() {
        return telproprietario;
    }

    public void setTelproprietario(int telproprietario) {
        int oldTelproprietario = this.telproprietario;
        this.telproprietario = telproprietario;
        changeSupport.firePropertyChange("telproprietario", oldTelproprietario, telproprietario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDproprietario != null ? iDproprietario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BdProprietarios)) {
            return false;
        }
        BdProprietarios other = (BdProprietarios) object;
        if ((this.iDproprietario == null && other.iDproprietario != null) || (this.iDproprietario != null && !this.iDproprietario.equals(other.iDproprietario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "view.BdProprietarios[ iDproprietario=" + iDproprietario + " ]";
        return nomeproprietario;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
