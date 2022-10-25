package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Student[] student = new Student[n];
		
		for(int i=0;i<student.length;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n",i+1);
			sc.nextLine();
			String name = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			student[i] = new Student(name,n1,n2);
		}
		
		System.out.println("Alunos Aprovados: ");
		
		for(int i=0;i<student.length;i++) {
			if(student[i].media(student[i].getNote1(),student[i].getNote2()) >= 6.0) {
				System.out.println(student[i].getName());
			}
		}
		
		
		
		
		sc.close();

	}

}
