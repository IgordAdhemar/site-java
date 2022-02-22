package fr.igor.main.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;
import java.io.IOException;

public class MenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <style>\n" +
                "ul {\n" +
                "    list-style-type: none;\n" +
                "    margin: 0;\n" +
                "    padding: 0;\n" +
                "    overflow: hidden;\n" +
                "    background-color: #923fcf;\n" +
                "}\n" +
                "\n" +
                "li {\n" +
                "    float: left;\n" +
                "}\n" +
                "\n" +
                "li a {\n" +
                "    display: block;\n" +
                "    color: white;\n" +
                "    text-align: center;\n" +
                "    padding: 14px 212.4px;\n" +
                "    text-decoration: none;\n" +
                "}\n" +
                "\n" +
                "/* Change the link color to #111 (black) on hover */\n" +
                "li a:hover {\n" +
                "    background-color: #7332a4;\n" +
                "}\n" +
                "body {\n" +
                "    background-color: #333;\n" +
                "    }\n" +
                "</style>\n" +
                "<title>PC Builder</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<ul>\n" +
                "    <li><a href=\"/menu\">Home</a></li>\n" +
                "    <li><a href=\"/shop\">Shop</a></li>\n" +
                "    <li><a href=\"/buildyourpc \">Build your PC</a></li>\n" +
                "    <li><a href=\"/about\">About</a></li>\n" +
                "</ul>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>\n");
    }
}
