<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax jsp</title>

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.get("testAjaxUrl", {name: "晓明", age: "10"}, function (data) {
                    console.log(data.pname)
                    console.log(data.page)
                })
            })
        })

    </script>
</head>

<body>
<h2>inner testAjax person jsp</h2>
btn person<br>
<input id="btn" type="button" value="JSON测试按钮"><br>
</body>

</html>
