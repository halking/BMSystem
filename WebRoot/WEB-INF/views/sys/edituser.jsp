<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${ctxcss}/editbook.css" />
<title>Insert title here</title>
</head>
<body>
	<div id="" class="editbook">
		<form action="update" method="post" target="smain">
			<c:forEach var="user" items="${users}">
				<input type="hidden" name="id" value="${user.id}">
				<ul>
					<li><label>读者名称：</label> <input type="text" name="username"
						value="${user.username}" /></li>
					<li><label>读者姓名：</label> <input type="text" name="realname"
						value="${user.realname}" /></li>
					<li><label class="lc">身份证：</label> <input type="text"
						name="idcard" value="${user.idcard}" /></li>
					<li><label>联系地址：</label> <input type="text"
						name="address" value="${user.address}" /></li>
					<li><label>联系邮箱：</label> <input type="text"
						name="email" value="${user.email}" /></li>
					<li><label class="lc">手机号：</label> <input type="text" name="phone"
						value="${user.phone}" /></li>
					<li><label>头像地址：</label> <input type="text"
						name="images" value="${user.images}" /></li>
							<li><label class="ls">角色：</label> <input type="text"
						name="role.rolename" value="${user.role.rolename}" /></li>
					<li><label class="ls">性别：</label> <select name="sex">
					        <option value="">${user.sex}</option>
							<option value="男">男</option>
							<option value="女">女</option>
					</select></li>
					<li><label>读者种类：</label> <select name="category.categoryname">
							<option value="${user.category.categoryname}" selected="selected">${user.category.categoryname}</option>
							<option value="一类读者">一类读者</option>
							<option value="二类读者">二类读者</option>
							<option value="三类读者">三类读者</option>
					</select></li>
					<li><label>所属部门：</label> <select name="organization.orgname">
							<option value="" selected="selected">${user.organization.orgname}</option>
							<option value="总分司">总公司</option>
							<option value="分公司">分公司</option>
							<option value="子公司">子公司</option>
					</select></li>
					<li><input type="submit" value="保存" /></li>
				</ul>
			</c:forEach>
		</form>
	</div>
</body>
</html>