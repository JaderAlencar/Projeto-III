/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jader.costa
 */
public class Agenda {

    private int idPaciente;
    private String pacienteNome;

    private int idMedico;
    private String medicoNome;
    private String especialidade;

    private String data;
    private String horario;

    public Agenda() {
        
    }
    
        public Agenda(int idPaciente, String pacienteNome, int idMedico, String medicoNome, String especialidade, String data, String horario) {
        this.idPaciente = idPaciente;
        this.pacienteNome = pacienteNome;
        this.idMedico = idMedico;
        this.medicoNome = medicoNome;
        this.especialidade = especialidade;
        this.data = data;
        this.horario = horario;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getMedicoNome() {
        return medicoNome;
    }

    public void setMedicoNome(String medicoNome) {
        this.medicoNome = medicoNome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    


    @Override
    public String toString() {
        return "Agenda{" + "idPaciente=" + idPaciente + ", pacienteNome=" + pacienteNome + ", idMedico=" + idMedico + ", medicoNome=" + medicoNome + ", especialidade=" + especialidade + ", data=" + data + ", horario=" + horario + '}';
    }
    

}
