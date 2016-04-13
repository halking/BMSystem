<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="${ctxcss}/editbook.css" />
</head>

<body>

	<div id="" class="editbook">
		<form action="update" method="post" target="smain">
			<c:forEach var="book" items="${book}">
				<input type="hidden" name="id" value="${book.id}">
				<ul>
					<li><label>图书名称：</label> <input type="text" name="bookname"
						value="${book.bookname}" /></li>
					<li><label>图片路径：</label> <input type="text" name="img"
						value="${book.img}" /></li>
					<li><label class="ls">作者：</label> <input type="text"
						name="author" value="${book.author}" /></li>
					<li><label class="ls">馆藏：</label> <input type="text"
						name="hold" value="${book.hold}" /></li>
					<li><label class="lc">索书号：</label> <input type="text"
						name="callnum" value="${book.callnum}" /></li>
					<li><label>出版编号：</label> <input type="text" name="isbn"
						value="${book.isbn}" /></li>
					<li><label class="ls">价格：</label> <input type="text"
						name="price" value="${book.price}" /></li>
					<li><label>入馆日期：</label> <input type="text" name="creatdate"
						value="${book.creatdate}" /></li>
					<li><label class="ls">数量：</label> <input type="text"
						name="count" value="${book.count}" /></li>
					<li><label>图书类型：</label> <select name="type.typename">
							<option value="${book.type}" selected="selected"></option>
							<option value="文学">文学</option>
							<option value="小说" selected="selected">小说</option>
							<option value="历史">历史</option>
							<option value="管理">管理</option>
							<option value="励志">励志</option>
							<option value="人物传记">人物传记</option>
							<option value="科技前沿">科技前沿</option>
					</select></li>
					<li><label>是否可借：</label> <select name="avilable">
							<option value="0">否</option>
							<option value="1">是</option>
					</select></li>
					<li><input type="submit" value="保存" /></li>
				</ul>
			</c:forEach>
		</form>
	</div>
</body>

</html>