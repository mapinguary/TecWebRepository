package bean;
// Generated 19/11/2017 18:52:48 by Hibernate Tools 4.3.1



/**
 * Consulta generated by hbm2java
 */
public class Consulta  implements java.io.Serializable {


     private Integer conscod;
     private Exame exame;
     private Medico medico;
     private Paciente paciente;
     private String consserv;
     private String consdtconsulta;

    public Consulta() {
    }

	
    public Consulta(Exame exame, Medico medico, Paciente paciente, String consserv) {
        this.exame = exame;
        this.medico = medico;
        this.paciente = paciente;
        this.consserv = consserv;
    }
    public Consulta(Exame exame, Medico medico, Paciente paciente, String consserv, String consdtconsulta) {
       this.exame = exame;
       this.medico = medico;
       this.paciente = paciente;
       this.consserv = consserv;
       this.consdtconsulta = consdtconsulta;
    }
   
    public Integer getConscod() {
        return this.conscod;
    }
    
    public void setConscod(Integer conscod) {
        this.conscod = conscod;
    }
    public Exame getExame() {
        return this.exame;
    }
    
    public void setExame(Exame exame) {
        this.exame = exame;
    }
    public Medico getMedico() {
        return this.medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getConsserv() {
        return this.consserv;
    }
    
    public void setConsserv(String consserv) {
        this.consserv = consserv;
    }
    public String getConsdtconsulta() {
        return this.consdtconsulta;
    }
    
    public void setConsdtconsulta(String consdtconsulta) {
        this.consdtconsulta = consdtconsulta;
    }




}


