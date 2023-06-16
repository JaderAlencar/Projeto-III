/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Paciente;
import java.util.ArrayList;

/**
 *
 * @author jader.costa
 */
public class CPacientes {
    private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    public static ArrayList<Paciente> listar(){
        return pacientes;
    }
    
    public static void adicionar(Paciente paciente){
        pacientes.add(paciente);
    }
    
    public static void remover(Paciente paciente){
        pacientes.remove(paciente);
    }
    
    public static Paciente buscar(String nome){
        for(Paciente paciente : pacientes){
            if(paciente.getNome().equalsIgnoreCase(nome)){
                return paciente;
            }
        }
        return null;
    }
}
