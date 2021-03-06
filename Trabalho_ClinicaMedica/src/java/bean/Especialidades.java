package bean;
// Generated 19/11/2017 18:52:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Especialidades generated by hbm2java
 */
public class Especialidades  implements java.io.Serializable {


     private Integer espcod;
     private String espdescricao;
     private Set medicos = new HashSet(0);

    public Especialidades() {
    }

	
    public Especialidades(String espdescricao) {
        this.espdescricao = espdescricao;
    }
    public Especialidades(String espdescricao, Set medicos) {
       this.espdescricao = espdescricao;
       this.medicos = medicos;
    }
   
    public Integer getEspcod() {
        return this.espcod;
    }
    
    public void setEspcod(Integer espcod) {
        this.espcod = espcod;
    }
    public String getEspdescricao() {
        return this.espdescricao;
    }
    
    public void setEspdescricao(String espdescricao) {
        this.espdescricao = espdescricao;
    }
    public Set getMedicos() {
        return this.medicos;
    }
    
    public void setMedicos(Set medicos) {
        this.medicos = medicos;
    }




}


