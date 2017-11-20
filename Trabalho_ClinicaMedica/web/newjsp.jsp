<%-- 

    Document   : newjsp
    Created on : 19/11/2017, 21:34:54
    Author     : MAPINGUARY
--%>
<%@page import="bean.Paciente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.pacienteDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body
       <h1> 
           <% 
            List<Paciente>%> listpaciente= new ArrayList<paciente>();
            <pacienteDao Pacientedao = new pacienteDao();
             <String nome= resquest.getParameter("txtnome");
        %>
                </h1>
        
        <h1>Hello World!</h1>
    </body>
</html>
