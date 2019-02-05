package br.com.lucas.gerenciador.acao;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lucas.gerenciador.modelo.Banco;
import br.com.lucas.gerenciador.modelo.Empresa;

public class NovaEmpresaForm {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		return "forward:formNovaEmpresa.jsp";
		
	}
		
}
