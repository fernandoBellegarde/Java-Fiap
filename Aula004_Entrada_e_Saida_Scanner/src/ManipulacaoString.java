
public class ManipulacaoString {

	public static void main(String[] args) {

		String descricao = "java é legal";
		
		descricao = descricao.concat(" Isso mesmo");
		
		System.out.println(descricao);
		
		if (descricao.contains("java")) System.out.println("Tem 'java'");
		
		if (descricao.equals("java é legal")) System.out.println("é igual");
		else System.out.println("Não é igual");
		
		descricao = descricao.toUpperCase();
		
		System.out.println(descricao);
		
		if (descricao.equalsIgnoreCase("java é legal")) System.out.println("é igual");

		
	}

}
