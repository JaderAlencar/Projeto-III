/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Consulta;
import java.util.ArrayList;

/**
 *
 * @author jader.costa
 */
public class CConsultas {
    private static ArrayList<Consulta> consultas = new ArrayList<>();

    public static ArrayList<Consulta> listarConsultas() {
        return consultas;
    }

    public static void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public static void cancelarConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    public static ArrayList<Consulta> buscarConsultasPorMedico(String nomeMedico) {
        ArrayList<Consulta> consultasMedico = new ArrayList<>();
        for (Consulta consulta : consultas) {
            if (consulta.getIdMedico().getNome().equalsIgnoreCase(nomeMedico)) {
                consultasMedico.add(consulta);
            }
        }
        return consultasMedico;
    }

    public static ArrayList<Consulta> buscarConsultasPorPaciente(String nomePaciente) {
        ArrayList<Consulta> consultasPaciente = new ArrayList<>();
        for (Consulta consulta : consultas) {
            if (consulta.getIdPaciente().getNome().equalsIgnoreCase(nomePaciente)) {
                consultasPaciente.add(consulta);
            }
        }
        return consultasPaciente;
    }
}
