<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<body>
<h2>receivePojoParamDate</h2>
</body>

receiveMapByPerson
<form action="pojo/getMapByPerson" method="get">

    Map类型
    <p>
        pet0<br>
        <input type="text" name="petMap[0].petName">
        <input type="text" name="petMap[0].petType"><br>
        pet1<br>
        <input type="text" name="petMap[1].petName">
        <input type="text" name="petMap[1].petType"><br>
    </p>


    <input type="submit" value="提交">
</form>


</html>
