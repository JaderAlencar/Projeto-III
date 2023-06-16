/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf212.clinica;

import Controller.CPacientes;
import Controller.CMedicos;
import Controller.CUsuarios;
import Controller.CAgendas;
import Model.Paciente;
import Model.Medico;
import Model.Usuario;
import Model.Consulta;
import java.util.ArrayList;

/**
 *
 * @author jader.costa
 */
public class Inf212Clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criar alguns pacientes
        Paciente paciente1 = new Paciente("João");
        Paciente paciente2 = new Paciente("Maria");

        // Adicionar pacientes à lista de pacientes
        CPacientes.adicionar(paciente1);
        CPacientes.adicionar(paciente2);

        // Listar pacientes
        ArrayList<Paciente> listaPacientes = CPacientes.listar();
        System.out.println("Pacientes:");
        for (Paciente paciente : listaPacientes) {
            System.out.println(paciente.getNome());
        }

        // Criar alguns médicos
        Medico medico1 = new Medico("Dr. Silva");
        Medico medico2 = new Medico("Dr. Santos");

        // Adicionar médicos à lista de médicos
        CMedicos.adicionar(medico1);
        CMedicos.adicionar(medico2);

        // Listar médicos
        ArrayList<Medico> listaMedicos = CMedicos.listar();
        System.out.println("Médicos:");
        for (Medico medico : listaMedicos) {
            System.out.println(medico.getNome());
        }

        // Criar alguns usuários
        Usuario usuario1 = new Usuario("admin", "123456");
        Usuario usuario2 = new Usuario("user", "654321");

        // Adicionar usuários à lista de usuários
        CUsuarios.adicionar(usuario1);
        CUsuarios.adicionar(usuario2);

        // Listar usuários
        ArrayList<Usuario> listaUsuarios = CUsuarios.listar();
        System.out.println("Usuários:");
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.getNome());
        }

        // Agendar uma consulta
        Consulta consulta1 = new Consulta(paciente1, medico1, "2023-06-20", "15:00");
        CAgendas.agendarConsulta(consulta1);

        // Listar consultas agendadas
        ArrayList<Consulta> listaConsultas = CAgendas.listar();
        System.out.println("Consultas Agendadas:");
        for (Consulta consulta : listaConsultas) {
            System.out.println("Paciente: " + consulta.getPaciente().getNome()
                    + ", Médico: " + consulta.getMedico().getNome()
                    + ", Data: " + consulta.getData()
                    + ", Horário: " + consulta.getHorario());
        }

        // Buscar consultas por médico
        ArrayList<Consulta> consultasMedico = CAgendas.buscarConsultasPorMedico("Dr. Silva");
        System.out.println("Consultas do médico Dr. Silva:");
        for (Consulta consulta : consultasMedico) {
            System.out.println("Paciente: " + consulta.getPaciente().getNome()
                    + ", Data: " + consulta.getData()
                    + ", Horário: " + consulta.getHorario());
        }

        // Buscar consultas por paciente
        ArrayList<Consulta> consultasPaciente = CAgendas.buscarConsultasPorPaciente("João");
        System.out.println("Consultas do paciente João:");
        for (Consulta consulta : consultasPaciente) {
            System.out.println("Médico: " + consulta.getMedico().getNome()
                    + ", Data: " + consulta.getData()
                    + ", Horário: " + consulta.getHorario());
        }

        // Cancelar uma consulta
        CAgendas.cancelarConsulta(consulta1);

        // Listar consultas após cancelamento
        listaConsultas = CAgendas.listar();
        System.out.println("Consultas Agendadas após cancelamento:");
        for (Consulta consulta : listaConsultas) {
            System.out.println("Paciente: " + consulta.getPaciente().getNome()
                    + ", Médico: " + consulta.getMedico().getNome()
                    + ", Data: " + consulta.getData()
                    + ", Horário: " + consulta.getHorario());
        }
    }
}

