package br.com.lucas.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuario = new ArrayList<Usuario>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("Empresa1");
		lista.add(empresa1);
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Empresa2");
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("lucas");
		u1.setSenha("12345");
		Usuario u2 = new Usuario();	
		u2.setLogin("ana");
		u2.setSenha("12345");
		
		listaUsuario.add(u1);
		listaUsuario.add(u2);
				
		
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);

	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa empresa = it.next();
			if (empresa.getId() == id)
				it.remove();
		}
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public Empresa buscaEmpresaPeloId(Integer id) {

		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}

}
