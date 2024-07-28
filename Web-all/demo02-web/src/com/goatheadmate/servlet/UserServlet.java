package com.goatheadmate.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/28-07-28-上午11:34
 * Description: com.goatheadmate.servlet
 * Version: 1.0
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、从request对象中获取请求中的任何信息
        String username = req.getParameter("username");
        // 2、处理业务代码
        String Info="YES";
        if("sdlqgjy".equals(username)){
            Info="NO";
        }
        // 3、将要相应的数据放入resp
        PrintWriter writer = resp.getWriter();
        writer.write(Info);
    }
}
