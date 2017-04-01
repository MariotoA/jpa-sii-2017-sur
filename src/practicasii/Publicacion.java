/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasii;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hack
 */
@Entity
public class Publicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String titulo;
    private String imagen;
    private String texto;
    private int valoracion;
    
    
    /*Publicacion--Usuario*/
    @ManyToOne
    private Usuario creador;
    
     /*Publicacion--Sitio*/
    @ManyToOne
    private Sitio sitioReferido;
    
     /*Publicacion--Evento*/
    @ManyToOne
    private Evento eventoReferido;

    
    
    
    
    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    public Sitio getSitioReferido() {
        return sitioReferido;
    }

    public void setSitioReferido(Sitio sitioReferido) {
        this.sitioReferido = sitioReferido;
    }

    public Evento getEventoReferido() {
        return eventoReferido;
    }

    public void setEventoReferido(Evento eventoReferido) {
        this.eventoReferido = eventoReferido;
    }
    
    

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
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
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "practicasii.Publicacion[ id=" + id + " ]";
    }
    
}