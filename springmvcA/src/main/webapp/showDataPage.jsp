<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

requestScope :message:${requestScope.message} uname:${requestScope.users[0].username}<br/>
sessionScope :message:${sessionScope.message} uname:${sessionScope.users[0].username}<br/>
applicationScope :message:${applicationScope.message} uname:${applicationScope.users[0].username}<br/>

重定向url拼接的方式传递数据
param.message :${param.message}
</body>
</html>
