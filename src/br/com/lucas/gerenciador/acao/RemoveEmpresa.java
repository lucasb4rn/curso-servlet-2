package br.com.lucas.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lucas.gerenciador.modelo.Banco;

public class RemoveEmpresa {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("removendo empresas");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		System.out.println(id);
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}
		
}
