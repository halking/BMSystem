<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>图书信息</title>
		<link rel="stylesheet" type="text/css" href="${ctxcss}/booklist.css"/>
		<link rel="stylesheet" type="text/css" href="${ctxcss}/page.css"/>
		<link rel="stylesheet" href="${ctxwf}/font-awesome-4.5.0/css/font-awesome.min.css" />
</head>
	<body>
	<div>
		<table border="" cellspacing="0" cellpadding="" class="contab">
			<tr>
			    <th style="width: 30px"></th>
				<th style="width: 162px">图书名称</th>
				<th>图片路径</th>
				<th>作者</th>
				<th>描述</th>
				<th style="width: 60px">馆藏</th>
				<th>索书号</th>
				<th>出版编号</th>
				<th style="width: 50px">价格</th>
				<th>入馆日期</th>
				<th style="width: 50px">数量</th>
				<th>所属种类</th>
				<th>操作</th>
			</tr>
	  <c:forEach var="book"  items="${book}" varStatus="u">
		<c:if test="${u.count%2==0}"> <tr class="t1"> </c:if>
	    <c:if test="${u.count%2!=0}"> <tr> </c:if>
	            <td>${book.id}</td>
				<td>${book.bookname}</td>
				<td>${book.img}</td>
				<td>${book.author}</td>
				<td>${book.description}</td>
				<td>${book.hold}</td>
				<td>${book.callnum}</td>
				<td>${book.isbn}</td>
				<td>${book.price}</td>
				<td title="${book.creatdate}">${book.creatdate}</td>
				<td>${book.count}</td>
				<td>${book.type.typename}</td>
				<td>
					<a href="${ctx}/books/edit?id=${book.id}" title="修改读者信息"><i class="fa fa-edit fa-fw"></i></a>
					<a href="${ctx}/books/del/${book.id}" title="删除读者信息"><i class="fa fa-remove fa-fw"></i></a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
	</body>
</html>