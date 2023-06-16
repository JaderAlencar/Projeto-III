/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Consulta;
import Model.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jader.costa
 */
public class CAgendas {

    

        private List<Consulta> consultas;
        private Map<String, List<Consulta>> usuario;

        public CAgendas() {
            consultas = new ArrayList<>();
            usuario = new HashMap<>();
        }

        // Outros métodos do controlador...
        public ArrayList<Consulta> listar() {
            return new ArrayList<>(consultas);
        }

        public ArrayList<Consulta> buscarConsultasPorMedico(String nomeMedico) {
            ArrayList<Consulta> consultasPorMedico = new ArrayList<>();
            for (Consulta consulta : consultas) {
                if (consulta.getMedico().equals(nomeMedico)) {
                    consultasPorMedico.add(consulta);
                }
            }
            return consultasPorMedico;
        }

        public ArrayList<Consulta> buscarConsultasPorPaciente(String nomePaciente) {
            ArrayList<Consulta> consultasPorPaciente = new ArrayList<>();
            for (Consulta consulta : consultas) {
                if (consulta.getPaciente().equals(nomePaciente)) {
                    consultasPorPaciente.add(consulta);
                }
            }
            return consultasPorPaciente;
        }
    }

