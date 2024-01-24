import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@WebServlet("/AdditionPractice")
public class AdditionPractice extends HttpServlet {
      private static final long serialVersionUID = 1L;
      private static Random r;
      private static int num1;
      private static int num2;

 
  public AdditionPractice() {
      super();
      r = new Random();
  }

    
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              // TODO Auto-generated method stub
              response.setContentType("text/html");
              num1 = r.nextInt(10);
              num2 = r.nextInt(10);
              response.getWriter().print("<form method='post' action='AdditionPractice' > "
                              + num1 
                              + " + "
                              + num2
                              + " = "
                              + "<input name='res' type='text'/>"
                              + " <input type='submit' value = 'submit'/></form>");
      }

     
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              // TODO Auto-generated method stub
              response.setContentType("text/html");
              int answer = (num1+num2);
              int userinput = Integer.parseInt(request.getParameter("res"));
              response.getWriter().println(num1 + " + " + num2 + " = " + answer);
              if(answer==userinput) {
                      response.getWriter().print("<div>Your Answer "+userinput+" is correct.</div>");
              }else {
                      response.getWriter().println("<div>Your Answer " + userinput +" is incorrect.</div>");
                      response.getWriter().print("<form method='get' action='AdditionPractice'> "
                              + "<input type='submit' value='Try Again'> "
                              + "</form>");
              }
            
      }

}
