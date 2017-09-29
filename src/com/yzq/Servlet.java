package com.yzq;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");//设置相应内容类型器
        PrintWriter out = response.getWriter();//取得响应输出对象
        String name = request.getParameter("name");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Hello </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Hello "+name+" ~~</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
