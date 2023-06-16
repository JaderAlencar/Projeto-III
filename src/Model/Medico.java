/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jader.costa
 */
public class Medico {

    private int idMedico;
    private String nome;
    private String CRM;
    private String especialidade;
    private String telefone;

    public Medico(String dr_Silva) {

    }

    public Medico(int idMedico, String nome, String CRM, String enpecialidade, String telefone) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.CRM = CRM;
        this.especialidade = enpecialidade;
        this.telefone = telefone;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEnpecialidade() {
        return especialidade;
    }

    public void setEnpecialidade(String enpecialidade) {
        this.especialidade = enpecialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Medico{" + "idMedico=" + idMedico + ", nome=" + nome + ", CRM=" + CRM + ", especialidade=" + especialidade + ", telefone=" + telefone + '}';
    }

}
