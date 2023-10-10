import java.security.AlgorithmConstraints;

import com.andrey.curso.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        //este método imprime algo na tela

        /*
         comentario de bloco
         */
       
         System.out.println("Hello, World!");
        
         Aluno a1 = new Aluno();
         a1.matricular();

         com.andrey.escola.Aluno a2 = new com.andrey.escola.Aluno();
         a2.matricular();
         
    }
}
