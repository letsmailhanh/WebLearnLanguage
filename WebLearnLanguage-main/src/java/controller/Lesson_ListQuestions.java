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
import model.Question;

/**
 *
 * @author Hanh
 */
@WebServlet(name = "Lesson_ListQuestions", urlPatterns = {"/Lesson_ListQuestions"})
public class Lesson_ListQuestions extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String lesson = request.getParameter("id");
            LessonDAO d = new LessonDAO();
            ArrayList<Question> questions = new ArrayList<>();

            questions = d.getQuestions(lesson, "ja");
            
            
            request.setAttribute("questions", questions);
            request.setAttribute("lesson", lesson);
            request.getRequestDispatcher("lesson_question.jsp").forward(request, response);
        }
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
        //processRequest(request, response);
        
       LessonDAO dao = new LessonDAO();
       String lesson = request.getParameter("Lesson");
       
       int n = dao.countQuestionsInLesson(lesson, "ja");
       
       String listAns[] = new String[n];
       listAns = request.getParameterValues("ans");

       PrintWriter out = response.getWriter();
       String userans = request.getParameter("ans");
       
       String quesid = request.getParameter("quesid");
       String answer = dao.getAnswerById(quesid);
       int score = 0;
       request.setAttribute("answer", answer);
       if (answer.equalsIgnoreCase(userans)){
//           out.println("Congratulations!");
//           out.println("The correct answer is" +" '" +answer+"'");
//           //score++;
//           //out.println("Your score: " + score);
//           //dao.updateScore(answer, Integer.parseInt(score));
            score++;
            request.setAttribute("score", score);
            request.getRequestDispatcher("correct.jsp").forward(request, response);
            
       }else{
           request.getRequestDispatcher("wrong.jsp").forward(request, response);
       }
       
       // println(check(answer));
       
////       out.println("correct answers: " + correct);
//       for (int i = 0; i < n; i++){
//            out.println("answer:" + listAns[i]);
//        }
//
//        ArrayList<String> corrects = new ArrayList<>();
//        corrects = dao.getCorrectAnswers(lesson, "ja");
//        
//        Boolean[] check = new Boolean[n];
//
//        int correct = 0;
//        for (int i = 0; i < n; i++){
//            if (listAns[i].equals(corrects.get(i))){
//                check[i] = true;
//                correct++;
//            }else{
//                check[i] = false;
//            }
//        }
//       
        
       
//       for (String a: listAns){
//           out.println(a);
//       }
      
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
