<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

    <style>
        .progress {
            width: 200px;
            height: 10px;
            border: 1px solid #ccc;
            border-radius: 10px;
            margin: 10px 0px;
            overflow: hidden;
        }

        /* 初始状态设置进度条宽度为0px */
        .progress > div {
            width: 0px;
            height: 100%;
            background-color: yellowgreen;
            transition: all .3s ease;
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $("#uploadButton").click(
                function () {

                    // console.log($("#upload-file")[0].files[0])
                    //获取要上传的文件
                    var photoFile = $("#upload-file")[0].files[0]
                    console.log(photoFile)
                    if (photoFile == undefined) {
                        alert("您还未选中文件作为头像")
                        return;
                    }
                    //将文件装入FormData对象，让后台的FileUploadController去处理
                    var formData = new FormData();
                    formData.append("avater", photoFile)
                    //通过ajax向后台发送文件
                    $.ajax({
                        type: "post",
                        data: formData,
                        url: "fileUpload.do",
                        processData: false,
                        contentType: false,
                        success: function (result) {
                            //接收后台响应的信息
                            console.log(result)
                            alert(result.message)
                            //回显 图片
                            // $("#avaterImg").attr("src", "upload/" + result.newFileName);
                            $("#avaterImg").attr("src", "http://192.168.31.88:8888/upload/" + result.newFileName);

                            // 回显 文件类型、文件名 将其放入form表单
                            $("#photoInput").val(result.newFileName)
                            $("#filetypeInput").val(result.filetype)
                        },
                        //
                        // 进度条
                        xhr: function () {
                            var xhr = new XMLHttpRequest();
                            //使用XMLHttpRequest.upload监听上传过程，注册progress事件，打印回调函数中的event事件
                            xhr.upload.addEventListener('progress', function (e) {
                                console.log(e);
                                //loaded代表上传了多少
                                //total代表总数为多少
                                var progressRate = (e.loaded / e.total) * 100 + '%';

                                //通过设置进度条的宽度达到效果
                                $('.progress > div').css('width', progressRate);
                            })

                            return xhr;
                        }


                    })

                }
            )
        })
    </script>


</head>
<body>

<form action="addGamer" method="get">
    <h1>*游戏用户注册</h1>
    <p>用户名<input type="text" name="username"></p>
    <p>昵称<input type="text" name="nickname"></p>
    <p>密码<input type="password" name="password"></p>
    <div>
        头像:
        <br/>
        <input id="upload-file" type="file"><br/>


        <%--图片回显--%>
        <img
                id="avaterImg"
                style="width: 200px ; height: 200px;"
                alt="您还未上传图片"
        ><br/>
        <%--进度条--%>
        <div class="progress">
            <div></div>
        </div>
        <a id="uploadButton" href="javascript:void(0)">立即上传</a>
        <%--使用隐藏的输入框存储文件名称和文件类型--%>
        <input id="photoInput" type="hidden" name="photo">
        <input id="filetypeInput" type="hidden" name="filetype">
    </div>


    <p><input type="submit" value="注册"></p>
</form>
</body>
</html>
