package rw.ac.auca.numbercomverter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ConverterServlet")
public class ConverterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the input number and conversion type from the form
        String number = req.getParameter("baseTen");
        String convType = req.getParameter("convType");
        String result = "";
        String message = "";

        // Check the selected conversion type and perform the conversion
        if ("binary".equals(convType)) {
            result = Integer.toBinaryString(Integer.parseInt(number));
            message = "Binary";
        } else if ("hexa".equals(convType)) {
            result = Integer.toHexString(Integer.parseInt(number));
            message = "Hexadecimal";
        } else if ("octa".equals(convType)) {
            result = Integer.toOctalString(Integer.parseInt(number));
            message = "Octal";
        }


        // Set attributes to pass data to the JSP (JavaServer Pages)
        req.setAttribute("result", result);
        req.setAttribute("message", message);
        req.setAttribute("number", number);

        // Forward the request and response to the Converter.jsp page
        req.getRequestDispatcher("Converter.jsp").forward(req, resp);
    }
}
