<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<body>
<h2>receive-Header</h2>
</body>

receiveHeader
测试获取请求头，数据不重要。对比requestHeader即可。
<form action="test/receiveRequestHeader" method="get">

    name<input type="text" name="name"><br>
    page<input type="text" name="page"><br>

    <input type="submit" value="提交">
</form>


</html>
