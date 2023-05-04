<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>restful2222 jsp title</title>
</head>
<body>
inner restful2222.Jsp dakljfagaj
<br>

get
<form action="restful2/getRest/10" method="get">
    <input type="submit" value="get 提交">
</form>
<%--
    场景1::控制层单元注解为@Controller的情况下报405错误，但是数据可以传过去。
    场景2::控制层单元注解为@RestController的情况下不会报错，但是不会跳转到jsp页面而是该控制层单元返回的字符串为内容的页面。
--%>
post
<form action="restful2/postRest/10" method="post">
    <input type="submit" value="post提交">
</form>

put（这里配置了web.xml的请求过滤器后，控制层注解为@Controller的情况下会报405，但是10可以传到java服务器。
<form action="restful2/putRest/10" method="POST">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="put提交">
</form>

delete（这里配置了web.xml的请求过滤器后，控制层注解为@Controller的情况下会报405，但是10可以传到java服务器。
<form action="restful2/deleteRest/10" method="POST">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="delete提交">
</form>

</body>
</html>