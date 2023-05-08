<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<body>
<h2>receivePojoParamDate</h2>
</body>

receivePojoParamDate
<form action="pojo/getDataByPojo2" method="get">
    str类型
    <p>姓名:<input type="text" name="pname"></p>
    <p>年龄:<input type="text" name="page"></p>
    <p>性别:
        <input type="radio" name="gender" value="1">男
        <input type="radio" name="gender" value="0">女
    </p>
    <p>爱好:
        <input type="checkbox" name="hobby" value="1"> 篮球
        <input type="checkbox" name="hobby" value="2"> 足球
        <input type="checkbox" name="hobby" value="3"> 羽毛球
        <input type="checkbox" name="hobby" value="4"> 台球
    </p>
    date类型
    <p>生日:
        <input type="text" name="birthdate">
    </p>


    <input type="submit" value="提交">
</form>


</html>
