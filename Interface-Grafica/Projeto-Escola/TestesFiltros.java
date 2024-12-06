/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 03721174062
 */

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestesFiltros {
    public static void main(String [] args) {
        
        MeusDados dados = new MeusDados();
        
        for(MeusDados.Turma turma: dados.Turmas) {
            System.out.println(turma.ano + " " +
                    turma.codigoComponente + " " +
                    turma.matriculaProfessor);
        } 
        
        ArrayList<MeusDados.Turma> filtrado;
        
        dados.Turmas.stream().filter(
            t -> t.matriculaProfessor == "13998"). // É filtrado somente o professor '13998'
            collect( Collectors.toList());
    }
}
