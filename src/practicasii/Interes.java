/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasii;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

/**
 *
 * @author hack
 */
@Entity
public class Interes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean meGusta;
    private boolean noMeGusta;
    private boolean acudir;
    private boolean recibirNotifiaciones;
    
    
    /*interes--usuario*/
    @ManyToOne
    private Usuario interesado;
    
    /*interes--Sesion*/
    @ManyToOne   
    private Sesion sesionReferida;

    
    
    public Usuario getInteresado() {
        return interesado;
    }

    public void setInteresado(Usuario interesado) {
        this.interesado = interesado;
    }

    public Sesion getSesionReferida() {
        return sesionReferida;
    }

    public void setSesionReferida(Sesion sesionReferida) {
        this.sesionReferida = sesionReferida;
    }
    

    public boolean isMeGusta() {
        return meGusta;
    }

    public void setMeGusta(boolean meGusta) {
        this.meGusta = meGusta;
    }

    public boolean isNoMeGusta() {
        return noMeGusta;
    }

    public void setNoMeGusta(boolean noMeGusta) {
        this.noMeGusta = noMeGusta;
    }

    public boolean isAcudir() {
        return acudir;
    }

    public void setAcudir(boolean acudir) {
        this.acudir = acudir;
    }

    public boolean isRecibirNotifiaciones() {
        return recibirNotifiaciones;
    }

    public void setRecibirNotifiaciones(boolean recibirNotifiaciones) {
        this.recibirNotifiaciones = recibirNotifiaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Interes)) {
            return false;
        }
        Interes other = (Interes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "practicasii.Interes[ id=" + id + " ]";
    }
    
}