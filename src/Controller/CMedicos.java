/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Medico;
import java.util.ArrayList;

/**
 *
 * @author jader.costa
 */
public class CMedicos {

    private static ArrayList<Medico> medicos = new ArrayList<Medico>();

    public static ArrayList<Medico> listar() {
        return medicos;
    }

    public static void adicionar(Medico medico) {
        medicos.add(medico);
    }

    public static void remover(Medico medico) {
        medicos.remove(medico);
    }

    public static Medico buscar(String nome) {
        for (Medico medico : medicos) {
            if (medico.getNome().equalsIgnoreCase(nome)) {
                return medico;
            }
        }
        return null;
    }
}
