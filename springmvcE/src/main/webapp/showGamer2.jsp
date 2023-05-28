<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hi title</title>
    <style>
        #gamerTable {
            width: 50%;
            border: 3px solid cadetblue;
            margin: 0px auto;
            text-align: center;
        }

        #gamerTable th, td {
            border: 1px solid green;
        }

        #gamerTable img {
            width: 200px;
            height: 200px;
        }
    </style>


    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script>
        $(function () {
            $.ajax({
                type: "get",
                url: "getAllGamer",
                success: function (gamers) {
                    $.each(gamers, function (i, e) {
                        console.log(e)
                        $("#gamerTable").append('    <tr>\n ' +
                            '      <td>' + e.id + '</td>\n' +
                            '      <td>' + e.username + '</td>\n' +
                            '      <td>' + e.password + '</td>\n' +
                            '      <td>' + e.nickname + '</td>\n' +
                            '      <td>\n' +
                            '          <img src="http://192.168.31.88:8888/upload/' + e.photo + '" alt="">\n' +
                            '      </td>\n' +
                            '      <td>\n' +
                            '          <a href="fileDownload.do?photo=' + e.photo + '&filetype=' + e.filetype + '   ">下载</a>\n' +
                            '      </td>\n' +
                            ' </tr>')
                    })
                }
            })        })
    </script>
</head>

<body>
<h2>Hello World!</h2>
inner show gamer 2 jsp
<table id="gamerTable" cellspacing="0xp" cellpadding="0px">
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>昵称</th>
        <th>头像</th>
    </tr>
    <!-- <tr>
        <td>1</td>
        <td>username1231</td>
        <td>163232</td>
        <td>nickname23123</td>
        <td>
            <img src="http://192.168.31.88:8888/upload/+''" alt="暂时没有东西">
        </td>
        <td>
            <a href="">下载</a>
        </td>
    </tr> -->


</table>
</body>
</html>
