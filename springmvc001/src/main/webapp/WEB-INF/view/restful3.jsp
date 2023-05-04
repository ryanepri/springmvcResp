<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>restful333 jsp title</title>
</head>
<body>
inner restful333.Jsp dakljfagaj
<br>

get
<form action="rest3/getRest/3" method="get">
    <input type="submit" value="get 提交">
</form>

post
<form action="rest3/postRest/3" method="post">
    <input type="submit" value="post提交">
</form>

put（这里配置了web.xml的请求过滤器后，控制层注解为@RestController的情况下会得到控制层return的字符串而非jsp页面、3可以传到java服务器。
<form action="rest3/putRest/3" method="POST">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="put提交">
</form>

delete（这里配置了web.xml的请求过滤器后，控制层注解为@RestController的情况下会得到控制层return的字符串而非jsp页面、3可以传到java服务器。
<form action="rest3/deleteRest/3" method="POST">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="delete提交">
</form>

</body>
</html>