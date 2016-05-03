<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 
<html>
	<head>
     <title>图书后台管理</title>  
	 <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="${ctxcss}/system.css" />
	<link rel="stylesheet" type="text/css" href="${ctxwf}/font-awesome-4.5.0/css/font-awesome.min.css"/>
	<script type="text/javascript" src="${ctxjs}/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="${ctxjs}/system.js" ></script>
	</head>
	<style type="text/css">
	    
	</style>
	<body>
	  <div id="con" class="contains">
	  	
		<div class="head">
			<div class="head-l">
				<div id="icon" class="icon"><span>书</span></div>
				<div id="title" class="title"><span>图书信息后台管理系统</span></div>
			</div>
			<div class="head-r" id="head-r">
				<div class="search">
					<form action="" >
					   <input type="text" >
					   <input type="submit" value="搜索" />	
					</form>
				</div>
				<div class="r-1" id="set"><span>管理控制台</span></div>
				<div class="r-2" ><span>信息与服务</span></div>
				<div class="help"><span>帮助文档</span></div>
				<div class="user" style="width: 144px;"><span>登录状态</span></div>
			</div>
		</div>
		<div class="main">
		  <div class="menu">
		  	<div class="top">
		  		<i></i>
		  		<i></i>
		  		<i></i>
		  	</div>
			<ul class="item">
				<li>
					<p><i class="fa fa-book fa-fw"></i>图书管理</p>
					<div class="bg"></div>
					<ul>
						<li ><a href="${ctx}/books/booklist" target="smain">图书信息</a></li>
						<li><a href="${ctx}/book/getborrow" target="smain">已借图书</a></li>
					    <li>新书上架</li>
					</ul>
				</li>
				<li>
					<p><i class="fa fa-user fa-fw"></i>用户管理</p>
					<ul>
						<li><a href="${ctx}/user/userlist" target="smain">用户信息</li>
						<li>借阅历史</li>
					</ul>
				</li>
				<li>
					<p><i class="fa fa-cog fa-fw"></i>系统设置</p>
					<ul>
						<li>权限设置</li>
						<li>角色设置</li>
					</ul>
				</li>
				<li>
					<p><i class="fa fa-pencil-square-o fa-fw"></i>日志管理</p>
					<ul>
						<li>事务日志</li>
						<li>操作信息</li>
					</ul>
				</li>
				<li>
							<p><i class="fa fa-bell fa-fw"></i>消息中心</p>
							<ul>
								<li>读者消息</li>
								<li>审核消息</li>
							</ul>
				</li>
			</ul>
		  </div>
		  <div class="con-right">
		  	 <iframe src="${ctx}/user/userlist" width="" height="" name="smain">
                    	
             </iframe>
		  </div>
	    </div>
	</div>
	</body>
</html>
