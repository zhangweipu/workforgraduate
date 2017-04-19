<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="add-emp">
    <div class="emp-head"><h3>添加员工信息</h3></div>
    <form action="/admin/emp/add" method="post">
        <table class="emp-table">
            <tr>
                <td>姓名：</td><td><input class="input" type="text" name="name"></td>
            </tr>
            <tr>
                <td>年龄：</td><td><input class="input" type="text" name="age"></td>
            </tr>
            <tr>
                <td>性别：</td><td><select class="input" name="sex"><option value="1">男</option><option value="0">女</option></select></td>
            </tr>
            <tr>
                <td>职位：</td><td><input class="input" type="text" name="duty"></td>
            </tr>
            <tr>
                <td>入职时间：</td><td><input class="input" type="text" name="worktime" placeholder="YYYY-MM-DD"></td>
            </tr>
            <tr>
                <td>薪资：</td><td><input class="input" type="text" name="salary"></td>
            </tr>
            <tr>
                <td>状态：</td><td><input class="input" type="text" name="power"></td>
            </tr>
            <tr><td><input type="submit" value="保存"></td>
                <td><a href="">批量添加</a></td></tr>
        </table>
    </form>
</div>
