package br.com.neww;

public class media {

	public static void main(String args[]) {
		notasPorMateria();		
	}
	
	public static void notasPorMateria() {
		System.out.println("*** Médias do Aluno ***");
			
		double materia1 = 6;
		System.out.print("Portugues: ");
		System.out.println(materia1);
		
		double materia2 = 5.5;
		System.out.print("Ingles: ");
		System.out.println(materia2);
		
		double materia3 = 7.5;
		System.out.print("Matematica: ");
		System.out.println(materia3);
		
		double materia4 = 8;
		System.out.print("Fisica: ");
		System.out.println(materia4);
		
		System.out.print("Media Final: ");
		double somaNotas = materia1 + materia2 + materia3 + materia4;
		
		double mediaFinal = (somaNotas)/ 4;
		System.out.print(mediaFinal);
		
	}
	
}
