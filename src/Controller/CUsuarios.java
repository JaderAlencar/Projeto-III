/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Consulta;
import Model.Paciente;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jader.costa
 */
public class CUsuarios {

    public static ArrayList<Usuario> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int idUsuario;
    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public CUsuarios() {
    }

    public CUsuarios(int idUsuario, String nome, String telefone, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public class UsuarioController {

        private List<Usuario> usuarios;
        private List<Paciente> pacientes;
        private List<Consulta> agenda;

        public UsuarioController() {
            usuarios = new ArrayList<>();
            pacientes = new ArrayList<>();
            agenda = new ArrayList<>();
        }

        public void cadastrarPaciente(Paciente paciente) {
            pacientes.add(paciente);
        }

        public void adicionarConsulta(Consulta consulta) {
            agenda.add(consulta);
        }

        public void editarPaciente(int idPaciente, Paciente pacienteAtualizado) {
            for (int i = 0; i < pacientes.size(); i++) {
                Paciente paciente = pacientes.get(i);
                if (paciente.getidPaciente() == idPaciente) {
                    pacientes.set(i, pacienteAtualizado);
                    break;
                }
            }
        }

        // Demais métodos para remover pacientes, listar pacientes, listar consultas, etc.
    }

    public class UsuarioController {

        public static void main(String[] args) {
            Usuario usuarioController = new UsuarioController();

            // Criação de pacientes
            Paciente paciente1 = new Paciente();
            Paciente paciente2 = new Paciente();

            // Cadastro de pacientes
            usuario.cadastrarPaciente(paciente1);
            usuario.cadastrarPaciente(paciente2);

            // Criação de consulta
            Consulta consulta1 = new Consulta();

            // Adição da consulta à agenda
            usuarioController.adicionarConsulta(consulta1);

            // Edição de paciente
            int idPaciente = 1;
            Paciente pacienteAtualizado = new Paciente();
            usuarioController.editarPaciente(idPaciente, pacienteAtualizado);

            // Demais operações...
        }
    }

}
