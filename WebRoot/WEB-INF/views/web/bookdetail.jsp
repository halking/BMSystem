<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="${ctxcss}/bookdetail.css" />
		<c:forEach items="${books}" var="book">
		<div class="condetail">
			<div id="" class="deimg">
				<img src="${ctximg}/books/${book.img}" />
			</div>
			<div class="detail">
				<ul>
					<li><span class="p1">图书名称：${book.bookname}</span></li>
					<li><span >作者：${book.author}</span></li>
					<li><span class="p2">馆藏：${book.hold}</span></li>
					<li><span class="p2">索书号：${book.callnum}</span></li>
					<li><span class="p2">数量：${book.count}</span></li>
					<li><span class="p3">剩余：${book.rest}</span></li>
					<div class="bin"><a href="${ctx}/book/borrow/${book.id}" onclick="validatUser()">
							借阅此书
						</a></div>
				</ul>
			</div>
		</div>
		</c:forEach>
	</body>
   <script type="text/javascript">
     function  validatUser(){
        <c:if test="${user==null}" >
           alert("您还没有登录，没有借阅权限！");
        </c:if>
     }
   </script>
</html>