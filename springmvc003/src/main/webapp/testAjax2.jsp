<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax jsp</title>

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.get("testAjaxUrl2", {pname: "tom", ptype: "cat"}, function (data) {
                    console.log(data.petName)
                    console.log(data.petType)
                })
            })
        })

    </script>
</head>

<body>
<h2>inner testAjax2 pet jsp</h2>
btn pet<br>
<input id="btn" type="button" value="JSON测试按钮"><br>
</body>

</html>
