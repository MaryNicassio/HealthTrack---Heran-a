package br.com.healthtrack;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		ContaPremium p1 = new ContaPremium();
		ContaFree f1 = new ContaFree();
		Medidas medidaUm = new Medidas ();
		
		// ContaPremium
		String a = JOptionPane.showInputDialog("Qual seu nome?");
		p1.setNome(a);
		String b = JOptionPane.showInputDialog("Qual seu e-mail para Login?");
		p1.setEmailLogin(b);
		String c = JOptionPane.showInputDialog("Qual sua data de nascimento? (dd/mm/aaaa)");
		p1.setDataNascimento(c);
		int d = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		p1.setIdade(d);
		float e = Float.parseFloat(JOptionPane.showInputDialog("Qual sua altura?"));
		medidaUm.setAltura(e);
		float f = Float.valueOf(JOptionPane.showInputDialog("Qual seu Peso?"));
		medidaUm.setPeso(f);
		String g = JOptionPane.showInputDialog("Qual seu endere?o?");
		p1.setEndereco(g); 
		String h = JOptionPane.showInputDialog("Cadastre sua senha:");
		p1.setSenha(h);
		float i = Float.valueOf(JOptionPane.showInputDialog("Qual seu novo peso?"));
		medidaUm.setNovoPeso(i);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getEmailLogin());
		System.out.println(p1.getDataNascimento());
		System.out.println(p1.getIdade() + " anos");
		System.out.println(medidaUm.getAltura());
		System.out.println(medidaUm.getPeso() + " Kg");
		System.out.println(p1.getEndereco());
		System.out.println(p1.getSenha());
		JOptionPane.showConfirmDialog(null, "Seus dados est?o corretos?", null, 0);
		System.out.println(medidaUm.getNovoPeso());
				
		medidaUm.calcularPeso(i, f, i, i);
		
		medidaUm.calcularImc(f, e, i);
		
		// ContaFree
	    String j = JOptionPane.showInputDialog("Qual seu nome?");
		f1.setNome(j);
		String k = JOptionPane.showInputDialog("Qual seu e-mail para Login?");
		f1.setEmailLogin(k);
		String l = JOptionPane.showInputDialog("Qual sua data de nascimento? (dd/mm/aaaa)");
		f1.setDataNascimento(l);
		int m = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		f1.setIdade(m);
		float n = Float.parseFloat(JOptionPane.showInputDialog("Qual sua altura?"));
		medidaUm.setAltura(n);
		float o = Float.valueOf(JOptionPane.showInputDialog("Qual seu Peso?"));
		medidaUm.setPeso(o);
		String p = JOptionPane.showInputDialog("Qual seu endere?o?");
		f1.setEndereco(p); 
		String q = JOptionPane.showInputDialog("Cadastre sua senha:");
		f1.setSenha(q);
		float r = Float.valueOf(JOptionPane.showInputDialog("Qual seu novo peso?"));
		medidaUm.setNovoPeso(r);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getEmailLogin());
		System.out.println(f1.getDataNascimento());
		System.out.println(f1.getIdade() + " anos");
		System.out.println(medidaUm.getAltura());
		System.out.println(medidaUm.getPeso() + " Kg");
		System.out.println(f1.getEndereco());
		System.out.println(f1.getSenha());
		JOptionPane.showConfirmDialog(null, "Seus dados est?o corretos?", null, 0);
		System.out.println(medidaUm.getNovoPeso());
				
		medidaUm.calcularPeso(r, o, r, r);
		
		medidaUm.calcularImc(o, n, r);
	}

}
