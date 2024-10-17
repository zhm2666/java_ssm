<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>
</head>
<body>
<h4>Login Page</h4>
<form action="login" method="post">
    <font color="red">${sessionScope.message}</font>
    <table>
        <tr>
            <td><label>username:</label></td>
            <td><input type="text" id="username" name="username"/>
        </tr>
        <tr>
            <td><label>password:</label></td>
            <td><input type="password" id="password" name="password"/>
        </tr>
        <tr>
            <td><input type="submit" value="login"/>
        </tr>
    </table>
</form>
</body>
</html>