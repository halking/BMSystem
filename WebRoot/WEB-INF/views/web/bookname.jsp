<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="${ctxcss}/borrowtop.css" />
<body>
   <div class="borrow">
     <c:forEach  items="${book}" var="book">
			<div id="" class="borrow_list">
				<a href=""><img src="${ctximg}/books/${book.img}" /></a>
				<a><p class="p1">${book.bookname}</p></a>
				<p >${book.author}</p>
				<p class="p2">馆藏：${book.hold} </p>
				<p class="p2">索书号：${book.callnum}</p>
				<p class="p2">数量：${book.count}</p>
				<p class="p3">剩余：7</p>
			</div>
	   </c:forEach>
	</div>		
</body>
</html>