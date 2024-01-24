package cs3220servlet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220servlet.Question;


@WebServlet("/DrivingTestBrowser")
public class DrivingTestBrowser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DrivingTestBrowser() {
        super();

    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        List<Question> entries = new ArrayList<>();

        try {
            Scanner in;
            in = new Scanner(new File (getServletContext().getRealPath("/WEB-INF/DrivingTest.txt")));
            while (in.hasNextLine()) {
                Question q = new Question();
                q.setDescription(in.nextLine());
                q.setAnswerA(in.nextLine());
                q.setAnswerB(in.nextLine());
                q.setAnswerC(in.nextLine());
                q.setCorrectAnswer(Integer.parseInt(in.nextLine()));
                entries.add(q);
                in.nextLine();//The blank line between questions is this
            }
            in.close();
        } catch (FileNotFoundException e) {
            throw new ServletException(e);
        }

        getServletContext().setAttribute("entries", entries);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("index") != null)
        {
            request.setAttribute("id",Integer.parseInt(request.getParameter("index")));
        }

        request.getRequestDispatcher("/Question.jsp").forward(request, response);

    }
    }