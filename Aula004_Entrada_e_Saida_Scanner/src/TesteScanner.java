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
		
		System.out.printf("Seu nome é %s e idade é %d%n", f.nome,f.idade);
		
	}

}
