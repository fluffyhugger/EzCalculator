import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MultiplicationServlet", value = "/MultiplicationServlet")

public class MultiplicationServlet extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String number = request.getParameter("number");
        if(number == null || number.length() == 0 || ! isNumber(number)){
            request.setAttribute("message","Invalid number or null");
        }
        request.setAttribute("number",Integer.parseInt(number));
        request.getRequestDispatcher("multiplication_table.jsp").forward(request,response);
    }
    private boolean isNumber(String numStr){
        for (int i = 0; i<numStr.length();i++){
            if(! Character.isDigit(numStr.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}