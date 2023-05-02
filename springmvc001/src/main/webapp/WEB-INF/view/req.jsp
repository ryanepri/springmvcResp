<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>req jsp title</title>
</head>
<body>
inner req.Jsp 1132
<form action="req/getRequest" method="get">
    <input type="submit" value="get提交">
</form>

<form action="req/getRequest" method="post">
    <input type="submit" value="get接口post提交">
</form>


<form action="req/postRequest" method="post">
    <input type="submit" value="post提交">
</form>
</body>
</html>