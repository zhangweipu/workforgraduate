<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="update">
    <form action="/admin/emp/toUpdate" method="post">
        <input type="text" name="id" hidden value="${emp.id}">
        <input type="text" name="worktime" value="${emp.worktime}">
   <table>
       <tr>
           <td>姓名</td>
           <td><input type="text" name="name" value="${emp.name}"></td>
       </tr>
       <tr>
           <td>性别</td>
           <td><input type="text" name="sex" value="${emp.sex}"></td>
       </tr>
       <tr>
           <td>年龄</td>
           <td><input type="text" name="age" value="${emp.age}"></td>
       </tr>
       <tr>
           <td>薪资</td>
           <td><input type="text" name="salary" value="${emp.salary}"></td>
       </tr>
       <tr>
           <td>职权</td>
           <td><input type="text" name="power" value="${emp.power}"></td>
       </tr>
       <tr>
           <td>
               <input type="submit" value="确定">
           </td>
       </tr>
   </table>
    </form>
</div>