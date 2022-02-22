package fr.igor.main.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

public class ShopServlet extends HttpServlet {
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
                "        div.product-group {\n" +
                "            display: flex;\n" +
                "            justify-content: center;\n" +
                "            align-items: center;\n" +
                "            flex-wrap: wrap;\n" +
                "        }\n" +
                "        div.product {\n" +
                "            color: #FFFFFF;\n" +
                "            background-color: #2A2A2A;\n" +
                "            height: 300px;\n" +
                "            width: 200px;\n" +
                "            margin: 15px;\n" +
                "\n" +
                "            }\n" +
                "            div.product:hover {\n" +
                "                transform: scale(0.98);\n" +
                "                box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.4), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n" +
                "                transition: 0.2s all;\n" +
                "            }\n" +
                "            div.product img {\n" +
                "            max-width: 100%;\n" +
                "            min-width: 100%;\n" +
                "            display: block;\n" +
                "            }\n" +
                "        body {\n" +
                "            background-color: #333;\n" +
                "            }\n" +
                "        span.name{\n" +
                "            position: relative;\n" +
                "            top: 5px;\n" +
                "            float: right;\n" +
                "            padding: 12px;\n" +
                "            font-size: 22px;\n" +
                "            }\n" +
                "        a.product-link {\n" +
                "            list-style-type: none;\n" +
                "            overflow: hidden;\n" +
                "            text-decoration: none;\n" +
                "            color: #FFFFFF;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "    <li><a href=\"/menu\">Home</a></li>\n" +
                "    <li><a href=\"/shop\">Shop</a></li>\n" +
                "    <li><a href=\"/buildyourpc\">Build your PC</a></li>\n" +
                "    <li><a href=\"/about\">About</a></li>\n" +
                "</ul>\n" +
                "<div class=\"product-group\">\n" +
                "    <a class=\"product-link\" href=\"/menu\">\n" +
                "        <div class=\"product GPU_GTX_1660_MSI\">\n" +
                "                <span class=\"price\">299.99&euro;</span>\n" +
                "                <span class=\"name\">Nvidia GTX 1660 MSI</span>\n" +
                "                <img class =\"img\" src=\"https://asset.msi.com/resize/image/global/product/product_1604894058aba2180faa37acdda3000e511803e4c2.png62405b38c58fe0f07fcef2367d8a9ba1/1024.png\" alt=\"\" itemprop=\"image\">\n" +
                "        </div>\n" +
                "    </a>\n" +
                "    <a class=\"product-link\" href=\"/menu\">\n" +
                "        <div class=\"product GPU_GTX_1660_super_MSI\">\n" +
                "                <span class=\"price\">399.99&euro;</span>\n" +
                "                <span class=\"name\">Nvidia GTX 1660 super MSI</span>\n" +
                "                <img class =\"img\" src=\"https://asset.msi.com/resize/image/global/product/product_4_20191016165654_5da6db5683982.png62405b38c58fe0f07fcef2367d8a9ba1/1024.png\" alt=\"\" itemprop=\"image\">\n" +
                "        </div>\n" +
                "    </a>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}
