/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author jader.costa
 */
public class Consulta {
    private Paciente idPaciente;
    private Medico idMedico;
    private Date data;
    private String horario;
    private String status;
    
    public Consulta(Paciente paciente1, Medico medico1, String string, String string1){
        
    }

    public Consulta(Paciente idPaciente, Medico idMedico, Date data, String horario, String status) {
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.data = data;
        this.horario = horario;
        this.status = status;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Consulta{" + "idPaciente=" + idPaciente + ", idMedico=" + idMedico + ", data=" + data + ", horario=" + horario + ", status=" + status + '}';
    }

    public Object getMedico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    
    
}
