import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PessoaTeste f = new PessoaTeste();
		
		System.out.println("Digite seu nome? ");
		f.nome = sc.nextLine();
		System.out.println("Digite seu idade? ");
		f.idade = sc.nextInt();
		System.out.println("Digite seu altura? ");
		f.altura = sc.nextDouble();
		f.sexo = "M";
		System.out.println("Digite seu peso? ");
		f.peso = sc.nextDouble();
		System.out.println("e seu nome é " + f.nome + " tem " + f.idade + " anos " + " pesa " + f.peso + " tem sexo " + f.sexo);
		
		f.comer();
		f.dormir();
		f.estudar();
		
		PessoaTeste o = new PessoaTeste();
		
		o.nome = "Otavio";
		o.idade = 19;
		o.altura = 1.80f;
		o.sexo = "M";
		o.peso = 60;
		o.comer();
		o.dormir();
		o.estudar();
		
		sc.close();
		
	}

}
