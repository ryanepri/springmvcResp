<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>requestParam jsp title</title>
</head>
<body>
inner requestParam.Jsp 154564132

<br>
<br>

紧耦合
<form action="innerReqParamTest/getParamByRequest" method="get">
    <input type="text" name="id">
    <input type="text" name="username">
    <input type="submit" value="param提交">
</form>

<br>

解耦合（参数名一致
<form action="innerReqParamTest/getParamByArgName" method="get">
    <input type="text" name="id">
    <input type="text" name="username">
    <input type="submit" value="param提交">
</form>

解耦合（参数名不一致
<form action="innerReqParamTest/getParamByArgName2" method="get">
    <input type="text" name="uid">
    <input type="text" name="uname">
    <input type="submit" value="param提交">
</form>

</body>
</html>