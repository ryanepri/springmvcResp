<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>restful1111 jsp title</title>
</head>
<body>
inner restful1111.Jsp dakljfagaj
<br>

get
<form action="restful/getRest/10" method="get">
    <input type="submit" value="get 提交">
</form>


post
<form action="restful/postRest/10" method="post">
    <input type="submit" value="post提交">
</form>


错误案例：：：：
put（405错误，方法不允许。
<form action="restful/putRest/10" method="put">
    <input type="submit" value="put提交">
</form>

delete（405错误，方法不允许。
<form action="restful/deleteRest/10" method="delete">
    <input type="submit" value="delete提交">
</form>

</body>
</html>