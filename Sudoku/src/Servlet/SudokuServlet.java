package Servlet;

/**
 * Created by School_Jeffrey on 3/28/2017.
 */

import Engine.Setup;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SudokuServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>Hello World.</body></html>");
        System.out.println("ca marche afou");

        sudoku = new Setup();
    }

    private Setup sudoku;


    public class HelloServlet extends HttpServlet {
    }





}
