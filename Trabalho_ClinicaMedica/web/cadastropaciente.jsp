<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>    
    </head>
    
    <body>
        <form name="form" action="controllerpaciente" method="post">
            <table border="1" height="150" width="200">
                <thead>
                    <tr>
                        <th colspan ="2">Cadastro paciente</th>
                   </tr>
                </thead>
                <tbody>                
                <tr>
                    <td>Nome: </td>
                    <td><input type="text" value="Cadastrar" name="" /></td>                    
                </tr>                
                <tr>
                    <td colspan="2" aling="center">
                        <input type="submmit" nome="Cadastrar" value="btCadastrar"/>
                    </td>
                </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
