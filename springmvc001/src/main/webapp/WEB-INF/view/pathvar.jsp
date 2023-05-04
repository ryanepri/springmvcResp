<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pathvar jsp title</title>
</head>
<body>
inner pathvar.Jsp dakljfagaj

get
<form action="pathvar/getRequest" method="get">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="get 提交">
</form>


post
<form action="pathvar/postRequest" method="post">
    <input type="submit" value="post提交">
</form>
</body>
</html>