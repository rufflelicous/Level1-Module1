package _06_vault;

public class VaultRunner {

	public static void main(String[] args) {
		int woah = 1000001;
		do {
		Vault vault = new Vault();
		SecretAgent jimmy = new SecretAgent();
		woah = jimmy.findCode(vault);
		System.out.println(woah);
	}while(woah > 100);
	}

}
