<html>
    <body>
    <h3>User 信息</h3>

    <table border="1px solid #8968CD" style="border-collapse: collapse;">
        <tr>
            <th>ID</th> <th>名字</th> <th>密码</th><th>角色</th>
        </tr>
        <#list staffAgents as s>
            <tr>
                <td>${s.staffAgentId}</td>
                <td>${s.realName}</td>
                <td>${s.loginPwd}</td>
                <td>${s.roleId}</td>
            </tr>
        </#list>
    </table>

    </body>
</html>