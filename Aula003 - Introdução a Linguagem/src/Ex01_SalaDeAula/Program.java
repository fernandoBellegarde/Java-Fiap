package Ex01_SalaDeAula;

public class Program {

	public static void main(String[] args) {

		Pessoa f = new Pessoa();
		
		f.nome = "Fernando";
		f.idade = 19;
		f.altura = 1.75f;
		f.sexo = "M";
		f.peso = 75;
		f.comer();
		f.dormir();
		f.estudar();
		
		Pessoa o = new Pessoa();
		
		o.nome = "Otavio";
		o.idade = 19;
		o.altura = 1.80f;
		o.sexo = "M";
		o.peso = 60;
		o.comer();
		o.dormir();
		o.estudar();
		
	}

}
