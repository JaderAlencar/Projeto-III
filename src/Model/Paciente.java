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
public class Paciente {

    private int idPaciente;
    private String nome;
    private String CPF;
    private Date dataNascimento;
    private String telefone;
    private String endereco;
    private String sexo;
    private String email;

    public Paciente(String joão) {

    }

    public Paciente(int idpaciente, String nome, String CPF, Date dataNascimento, String telefone, String endereco, String sexo, String email) {
        this.idPaciente = idpaciente;
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.sexo = sexo;
        this.email = email;
    }

    public int getidPaciente() {
        return idPaciente;
    }

    public void setidPaciente(int idpaciente) {
        this.idPaciente = idpaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", nome=" + nome + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + ", endereco=" + endereco + ", sexo=" + sexo + ", email=" + email + '}';
    }

}
