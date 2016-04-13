<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页工具</title>
</head>
<link rel="stylesheet" type="text/css" href="${ctxcss}/page.css" />
<link rel="stylesheet" type="text/css"
	href="${ctxwf}/font-awesome-4.5.0/css/font-awesome.min.css" />

<body>
	<c:forEach var="page" items="${page}">
		<div id="" class="page">
			<ul class="">
				<li class="f1">总记录:${page.total}</li>
				<li class="f1">页码：${page.currentPage}/共${page.pageNum}</li>
				<c:if test="${page.currentPage == 1}">
					<li></li>
					<li><i class="fa fa-angle-left"></i></li>
				</c:if>
				<c:if  test="${page.currentPage>1}" >
					<li><a href="${ctx}/books/booklist?currentPage=${page.currentPage}">首页</a></li>
					<li><a href="${ctx}/books/booklist?currentPage=${page.currentPage-1}"><i class="fa fa-angle-left"></i></a></li>
				</c:if>
				<c:if test="${page.currentPage ==page.pageNum || page.pageNum == 0}">
				<li><i class="fa fa-angle-right"></i></li>
				<li></li>
				</c:if>
				<c:if test="${page.currentpage < page.pageNum}">
				<li><a href="${ctx}/books/booklist?currentPage=${page.currentPage+1}"><i class="fa fa-angle-right"></i></a></li>
				<li><a href="${ctx}/books/booklist?currentPage=${page.pageNum}">末页</a></li>
				</c:if>
			</ul>
		</div>
	</c:forEach>
</body>

</html>