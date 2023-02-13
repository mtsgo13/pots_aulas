package Exercicio_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class main {
	
		public static void main(String[] args) throws ParseException {
			
			ArrayList<Aluno> aluno = new ArrayList<>();

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
			Aluno a1 = new Aluno("Marcos","marcos@Gmail", 2222,formato.parse("10/02/2001"));
			Aluno a2 = new Aluno("Maria","maria@Gmail", 1111,formato.parse("20/02/2001"));
			Aluno a3 = new Aluno("Marcoli","marcoli@Gmail", 2121,formato.parse("05/02/2001"));
			
	        aluno.add(a1);
	        aluno.add(a2);
	        aluno.add(a3);

	        for (int i = 0; i < aluno.size(); i++) {
	            System.out.println("Alunos : " + aluno.get(i));
	        }
		}

}
