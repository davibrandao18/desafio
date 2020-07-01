package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import service.UsuarioService;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro.do")
public class UsuarioController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UsuarioService us = new UsuarioService();
        Date date = converteData(request.getParameter("nascimento"));
        
        Usuario usuario = new Usuario();
        usuario.setNome(request.getParameter("nome"));
        usuario.setEmail(request.getParameter("email"));
        usuario.setCpf(request.getParameter("cpf"));
        usuario.setNascimento(date);
        usuario.setEndereco(request.getParameter("endereco"));
        
        //TODO respostas (null, cpf ou e-mail, sucesso)
        if (us.criar(usuario)) {
            request.setAttribute("resultado", "true");
        } else {
            request.setAttribute("resultado", "false");
        }
        request.getRequestDispatcher("/").forward(request, response);
    }

    public Date converteData(String data) {
        Date date = null;
        
        if (data.equals(null) || data == "")
            return new Date(System.currentTimeMillis());
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            date = (Date) formatter.parse(data);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        return date;
    }
}