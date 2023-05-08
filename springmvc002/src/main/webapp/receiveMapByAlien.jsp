<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<body>
<h2>receivePojoParamDate</h2>
</body>

receiveMapByAlien
<form action="pojo/getMapByAlien" method="post">

    Map类型
    <p>
        pet0<br>
        <input type="text" name="petMap[key0].petName">
        <input type="text" name="petMap[key0].petType"><br>
        pet1<br>
        <input type="text" name="petMap[key1].petName">
        <input type="text" name="petMap[key1].petType"><br>
    </p>


    <input type="submit" value="提交">
</form>


</html>
