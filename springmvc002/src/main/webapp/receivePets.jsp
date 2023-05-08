<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<body>
<h2>receiveDate</h2>
</body>

receivePets  错误案例
<form action="pojo/getPets" method="get">

    pet类型

    pet1
    宠物名:<input type="text" name="pets[0].petName">
    宠物类型:<input type="text" name="pets[0].petType">

    <br>

    pet2
    宠物名:<input type="text" name="pets[1].petName">
    宠物类型:<input type="text" name="pets[2].petType">

    <br>

    <input type="submit" value="提交">
</form>


</html>
