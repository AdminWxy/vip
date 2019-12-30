<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<div style="width: 1200px; text-align: center" align="center">
<h3>会员信息</h3>
<table width="500px;" align="center" border="1px;" bgcolor="#f0f8ff" style="margin-top: 25px;">
    <tr>
       <td><a href="${pageContext.request.contextPath}lookexchange?&vipid=${vipid}">会员积分:<label id="vipscore"></label></a></td>
        <input type="hidden" value="${vipid}" id="vipid" name="vipid"/>
    </tr>
</table>
<h3>购物记录</h3>
<table id="new"  width="800px;"align="center"  border="1px;" style="margin-top: 25px;" bgcolor="#f0f8ff">
    <tr>
        <td>记录编号</td>
        <td>商品名称</td>
        <td>购买数量</td>
        <td>商品单价</td>
        <td>总金额</td>
        <td>下单时间</td>
    </tr>

</table>
</div>
</body>
</html>
<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<script>
    $(function () {
        var vipid = $("#vipid").val();
        var sum = 0;
        alert(vipid);
        $.ajax({
            url : "/list",
            type : "GET",
            data:{vipid:vipid},
            dataType:"JSON",
            success : function(data) {
                for (var i = 0; i < data.length; i++) {
                    sum+=data[i].totalprice;
                    $("#new").append("<tr><td>"+ data[i].commodityid+ "</td>"+"<td>"+ data[i].commodityname+ "</td>"+"<td>"+ data[i].buynumber+ "</td>"+"<td>"+ data[i].price+ "</td>"+"<td>"+ data[i].totalprice+ "</td>"+"<td>"+""+ data[i].createTime+ "</td></tr>");
                }
                $("#vipscore").html(sum);
            },
            error : function() {
                alert("错误");
            }
        })
    })
</script>