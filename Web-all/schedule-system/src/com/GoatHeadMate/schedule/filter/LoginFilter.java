package com.GoatHeadMate.schedule.filter;

import com.GoatHeadMate.schedule.pojo.SysUser;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-下午4:43
 * Description: com.GoatHeadMate.schedule.filter
 * Version: 1.0
 */

@WebFilter(urlPatterns = {"/showSchedule.html","/schedule/*"},servletNames = "scheduleServlet")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        // 参数父转子
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        // 获得session域对象
        HttpSession session = request.getSession();
        // 从session域中获取登录的对象
        SysUser sysUser = (SysUser)session.getAttribute("sysUser");
        // 判断对象是否为空
        if(sysUser==null){
            response.sendRedirect("login.html");
        }else {
            chain.doFilter(request, response);
        }
    }
}
