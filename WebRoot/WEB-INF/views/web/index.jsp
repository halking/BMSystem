<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>图书管理主页</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="${ctxjs}/jquery-2.1.1.min.js"
	type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" type="text/css"
	href="${ctxcss}/index.css" />
<link rel="stylesheet" type="text/css"
	href="${ctxwf}/font-awesome-4.5.0/css/font-awesome.min.css" />
<script src="${ctxjs}/index.js" type="text/javascript"
	charset="utf-8"></script>
<style type="text/css">
</style>
<script type="text/javascript">

</script>
</head>

<body>
	<div id="all">
		<!--顶部-->
		<div id="top" class="top">
		   <div class="toptitle"> 网上图书馆   <span>不一样的阅读体验</span></div>
			<div class="top-r">
				<div class="top-login">
				<c:if test="${user.username==null}">
					<span><a href="${ctx}/a/login">登录 </a> 
				</c:if> 
				<c:if test="${users.username!=null }">
                   <span>欢迎<strong style="color: #009ad6;">&nbsp;&nbsp;${user.username}</strong></span> 
                   <span style="margin-left: 10px;"><a  href="${ctx}/exit">退出</a></span>
                </c:if>
					|</span> <span><a href="">注册</a></span>
				</div>
			</div>
		</div>
		<!--搜索框-->
		<div id="search" class="search">
			<!-- <div class="r rb"></div> -->
			<div class="sframe">
				<span class="ac addicon"><i class="fa fa-book fa-fw"></i></span> 
				<form action="books/findname" method="get" target="ifmain">
				<input type="text" name="bookname" id="bn" value="" placeholder="请输入你想寻找的书籍 "/> 
				<span class="ac adds"><input type="submit"  class="sb" value="查询"></span></a>
				</form>
			</div>
			<!-- <div class="r zl"></div> -->
		</div>
		<!--中部-->
		<div class="mid">
			<!--导航栏-->
			<div class="connav">
				<div class="fen">
					<a>所以图书分类</a>
				</div>
				<div class="nation">
					<ul class="navs">
						<li><a href="">首页</a></li>
						<li><a href="">借书排行榜</a></li>
						<li><a href="">新书推荐</a></li>
						<li><a href="">馆长推荐</a></li>
						<li><a href="">热门图书</a></li>
						<li><a href="">国外图书</a></li>
						<li><a href="">读者建议</a></li>
					</ul>
				</div>
			</div>
			<!--焦点图-->
			<div id="conimg" class="conimg">
				<!--分类菜单项-->
				<div class="classify">
					<ul>
						<li><a href="${ctx}/books/findtype?typename=文学" target="ifmain">文学</a></li>
						<li><a href="${ctx}/books/findtype?typename=小说" target="ifmain">小说 </a></li>
						<li><a href="${ctx}/books/findtype?typename=历史" target="ifmain">历史 </a></li>
						<li><a href="${ctx}/books/findtype?typename=管理" target="ifmain">管理 </a></li>
						<li><a href="${ctx}/books/findtype?typename=励志" target="ifmain">励志 </a></li>
						<li><a href="${ctx}/books/findtype?typename=人物传记" target="ifmain">人物传记 </a></li>
						<li><a href="${ctx}/books/findtype?typename=人文社科" target="ifmain">人文社科 </a></li>
						<li><a href="${ctx}/books/findtype?typename=科技前沿" target="ifmain">科技前沿 </a></li>
						<li><a href="#">更多 </a><span> >> </span></li>
					</ul>
				</div>
				<!--轮播图-->
				<ul class="banner">
					<li><a href=""><img src="${ctx}/static/images/banner/t1.jpg" alt="1" /></a></li>
					<li><a href=""><img src="${ctx}/static/images/banner/t2.jpg" alt="2"></a>
					</li>
					<li><a href=""><img src="${ctx}/static/images/banner/t3.jpg" /></a></li>
					<li><a href=""><img src="${ctx}/static/images/banner/t4.jpg" /></a></li>
					<li><a href=""><img src="${ctx}/static/images/banner/t5.jpg" /></a></li>
					<li><a href=""><img src="${ctx}/static/images/banner/t6.jpg" /></a></li>
				</ul>
				<!--轮播图说明文字-->
				<ul class="explain">
					<li><a href="#">自控力
							<p>和压力做朋友</p>
					</a></li>
					<li><a href="#">登天的感觉
							<p>心理学必读科目</p>
					</a></li>
					<li><a href="#">80后诗人冬子
							<p>借山而居</p>
					</a></li>
					<li><a href="#">惶想录
							<p>你看见了我的小妖怪了嘛</p>
					</a></li>
					<li><a href="#">编辑推荐
							<p>佳作精选</p>
					</a></li>
					<li><a href="#">影视同名书
							<p>原著小说更精彩</p>
					</a></li>
				</ul>
				<!--圆点标志-->
				<ul class="num">
				</ul>
				<!--左右按钮-->
				<div class="btn btn_l">&lt;</div>
				<div class="btn btn_r">&gt;</div>
			</div>
		</div>
	</div>
	<div id="main" class="main">
			<iframe class="ifmain"  name="ifmain"  id="ifmain" src="${ctx}/books/book" >
			</iframe>
	</div>
   <div class="foot"></div>
</body>
<script type="text/javascript">
	//	console.log($(window).width());
</script>

</html>
