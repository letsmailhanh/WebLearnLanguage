/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dal.AdminDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Question;

/**
 *
 * @author Hanh
 */
@WebServlet(name = "Manage_UpdateQuestions", urlPatterns = {"/editq"})
public class Manage_UpdateQuestions extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    AdminDAO db = new AdminDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Question a = db.getQuestion(id);
        PrintWriter out = response.getWriter();
        out.println(id);
        request.setAttribute("question", a);
        request.getRequestDispatcher("admin_question_edit.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        String id = request.getParameter("id");
        AdminDAO db = new AdminDAO();
        String lesson = request.getParameter("lesson");
        String question = request.getParameter("question");     
        String ans1 = request.getParameter("ans1");     
        String ans2 = request.getParameter("ans2");     
        String ans3 = request.getParameter("ans3");     
        String ans4 = request.getParameter("ans4");     
        String correct = request.getParameter("correct");     
                 
        Question s = new Question();
        s.setId(id);
        s.setLangCode("ja");
        s.setLesson(lesson);
        s.setQues(question);
        s.setAns1(ans1);
        s.setAns2(ans2);
        s.setAns3(ans3);
        s.setAns4(ans4);
        s.setCorrect(correct);
        
        db.updateQuestion(s);
        response.sendRedirect("listq");  
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
