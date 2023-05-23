<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .progress {
            width: 600px;
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


    <script>
        function uploadFile() {
            //获取上传的文件
            var uploadFile = $('#upload-file').get(0).file[0];

            var formdata = new FormData();

            formdata.append('fileInfo', uploadFile);
            $.ajax({
                url: '/uploadfileurl',
                type: 'post',
                dataType: 'json',
                processData: false,
                contentType: false,
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
    </script>

</head>

<body>

<input type="file" id="upload-file">
<div class="progress">
    <div></div>
</div>


<button onclick="">上传</button>

</body>


</html>
