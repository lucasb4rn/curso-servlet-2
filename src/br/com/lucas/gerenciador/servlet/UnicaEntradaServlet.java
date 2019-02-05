package br.com.lucas.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lucas.gerenciador.acao.ListaEmpresas;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		if(paramAcao.equals("ListaEmpresa")) {
			System.out.println("Listando Empresas");
			
			ListaEmpresas acao = new ListaEmpresas();
			acao.executa(request, response);
			
			
		} else  if(paramAcao.equals("RemoveEmpresa")) {
			System.out.println("removendo empresas");
		} else if(paramAcao.equals("MostraEmpresa")) {
			System.out.println("mostra dados da empresa");
		}
	}

}
