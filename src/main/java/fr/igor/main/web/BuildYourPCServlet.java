package fr.igor.main.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BuildYourPCServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>PC Builder</title>\n" +
                "    <style>\n" +
                "        ul {\n" +
                "            list-style-type: none;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            overflow: hidden;\n" +
                "            background-color: #923fcf;\n" +
                "            }\n" +
                "        li {\n" +
                "        float: left\n" +
                "        }\n" +
                "        li a {\n" +
                "            display: block;\n" +
                "            color: white;\n" +
                "            text-align: center;\n" +
                "            padding: 14px 212.4px;\n" +
                "            text-decoration: none;\n" +
                "            }\n" +
                "        li a:hover{\n" +
                "            background-color: #7332a4;\n" +
                "        }\n" +
                "        body {\n" +
                "            background-color: #333;\n" +
                "            }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <ul>\n" +
                "        <li><a href=\"/menu\">Home</a></li>\n" +
                "        <li><a href=\"/shop\">Shop</a></li>\n" +
                "        <li><a href=\"/buildyourpc\">Build your PC</a></li>\n" +
                "        <li><a href=\"/about\">About</a></li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>");
    }
}
