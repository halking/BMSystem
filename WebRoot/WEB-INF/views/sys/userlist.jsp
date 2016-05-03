<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>用户列表</title>
<link rel="stylesheet" type="text/css" href="${ctxcss}/userlist.css" />
<link rel="stylesheet" type="text/css"
	href="${ctxwf}/font-awesome-4.5.0/css/font-awesome.min.css" />
<script src="${ctxjs}/jquery-2.1.1.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<table border="" cellspacing="0" cellpadding="" class="contab">
		<tr>
			<th>读者名称</th>
			<th>姓名</th>
			<th>性别</th>
			<th>身份证</th>
			<th>手机号</th>
			<th>联系地址</th>
			<th>邮箱地址</th>
			<th>所在公司</th>
			<th>所属角色</th>
			<th>所属种类</th>
			<th>操作</th>
		</tr>
		<c:forEach var="user"  items="${alluser}" varStatus="u">
		<c:if test="${u.count%2==0}"> <tr class="t1"> </c:if>
	    <c:if test="${u.count%2!=0}"> <tr> </c:if>
			<td>${user.username}</td>
			<td>${user.realname}</td>
			<td>${user.sex}</td>
			<td>${user.idcard}</td>
			<td>${user.phone}</td>
			<td>${user.address}</td>
			<td>${user.email}</td>
			<td>${user.role.rolename}</td>
			<td>${user.organization.orgname}</td>
			<td>${user.category.categoryname}</td>
			<td>
			<a href="${ctx}/user/edit?id=${user.id}" title="修改读者信息"><i class="fa fa-edit fa-fw"></i></a>
			<a href="${ctx}/user/del/${user.id}" title="删除读者信息"><i class="fa fa-remove fa-fw"></i></a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
  <script type="text/javascript">
  /*   function change(){
      if( ${u.count} % 2 != 0){
         $("#t1").addClass("t1");
      }
      }; */
  </script>
</html>