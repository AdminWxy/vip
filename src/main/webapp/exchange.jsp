<%--
  Created by IntelliJ IDEA.
  User: ZY
  Date: 2019-12-27
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GB2312" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>��Ʒ�һ�</title>
</head>
<body>
<div style="width: 1000px;" align="center">
    <h3>��Ա��Ϣ</h3>
    <p>���˻���:</p>
    <p id="score">${sum}</p>
    <table width="500px;" align="center" border="1px;" bgcolor="#f0f8ff" style="margin-top: 25px;" id="new">

        <tr>
            <td>��Ʒid</td>
            <td>��Ʒ����</td>
            <td>�һ�����</td>
            <td>�Ƿ�һ�</td>
        </tr>
        <c:forEach items="${list }" var="v">
            <tr>
                <td>${v.commodityid}</td>
                <td>${v.commodityname }</td>
                <td>${v.commdoityscore }</td>
                <td><c:if test="${v.isture eq 0}"><input type="button" id="isv" value="����"
                                                         onclick="ad(${v.commodityid},${v.commdoityscore})"/></c:if>
                    <c:if test="${v.isture != 0}"><input type="button" value="�һ�"/></c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>

<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<script>
    function ad(id, score) {
        var vipscore = document.getElementById("score").innerHTML;
        if (confirm("�Ƿ�Ҫ����")) {
            location.href = "mai?id=" + id;
        } else {
        }
    }
</script>
