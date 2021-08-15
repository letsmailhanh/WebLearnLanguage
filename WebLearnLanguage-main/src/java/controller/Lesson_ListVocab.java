/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.LessonDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Vocab;

/**
 *
 * @author Hanh
 */
@WebServlet(name = "Lesson_ListVocab", urlPatterns = {"/Lesson_ListVocab"})
public class Lesson_ListVocab extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LessonDAO dao = new LessonDAO();
        ArrayList<Vocab> vocabs = new ArrayList<>();
        String lesson = request.getParameter("id"); 
        
        vocabs = dao.getVocabs(lesson, "ja");
        request.setAttribute("vocabs", vocabs);
        //request.setAttribute("lesson", lesson);
        request.getRequestDispatcher("lesson_ja_vocab.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
