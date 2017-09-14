<%--
  Created by IntelliJ IDEA.
  User: Sit
  Date: 12.09.2017
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="/helloworld">
    <table>
        <tr>
            <td> User name:</td>
            <td>
                <input type="text" name="username"/>
            </td>
        </tr>
        <tr>
            <td> User age:</td>
            <td>
                <input type="text" name="age"/>
            </td>
        </tr>
    </table>

    <button type="submit"> Submit button</button>
</form>
</body>
</html>
