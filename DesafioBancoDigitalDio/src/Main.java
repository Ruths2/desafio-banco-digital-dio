import java.util.*;

public class Main {
	
	public static void main(String[] args) {
        
        Cliente jairo = new Cliente();
        jairo.setNome("Jairo");
        
		Conta cc = new ContaCorrente(jairo);
		Conta cp = new ContaPoupanca(jairo);
        
        cc.depositar(100);
        cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
        
    }
    
}
