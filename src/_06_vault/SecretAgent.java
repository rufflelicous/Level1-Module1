package _06_vault;

public class SecretAgent {
	public int findCode(Vault vault) {
		for(int i = 0; i <1000000; i++) {
			Boolean yay = vault.tryCode(i);
			if(yay == true) {
				return i;
			}
		}
		return -1;
	}
}
