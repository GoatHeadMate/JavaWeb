package com.GoatHeadMate.schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-下午3:07
 * Description: com.GoatHeadMate.schedule.controller
 * Version: 1.0
 */

@WebServlet(value = "/schedule/*",name = "scheduleServlet")
public class SysScheduleController extends BaseController {
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("add");
    }
    protected void find(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("find");
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("update");
    }
    protected void remove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("remove");
    }
}
