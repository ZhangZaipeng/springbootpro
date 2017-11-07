<html>
    <body>
    <h3 id="h3">User 信息</h3>

    <table border="1px solid #8968CD" style="border-collapse: collapse;">
        <tr>
            <th>ID</th> <th>名字</th> <th>密码</th>
        </tr>
        <tr>
            <td>${staffAgentId}</td>
            <td>${realName}</td>
            <td>${loginPwd}</td>
        </tr>
    </table>

    </body>
    <script src="/static/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            var h3 = $("#h3");
            h3.click(function(){
                alert(h3.html());
            });
        });
    </script>
</html>