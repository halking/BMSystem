<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>  
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录页面</title>
	<script src="${ctxjs}/jquery-2.1.1.min.js"
	type="text/javascript" charset="utf-8"></script>
	<link rel="stylesheet" type="text/css" href="${ctxcss}/login.css" />
	<link rel="stylesheet" type="text/css" href="${ctxwf}/font-awesome-4.5.0/css/font-awesome.min.css" />
	</head>
<body>
		<h3>图书管理系统用户登录</h3>
		<div id="login" class="login">   
		<form action="${ctx}/user/login" method="post" onclick="">
			<ul>
				<li>
				    <form:errors path="username" ></form:errors>
					<i class="fa fa-user fa-fw"></i>
					<input type="text"  name="username" class="conin it" placeholder="用户名/邮箱" />
				</li>
				<li>
				    <form:errors path="password" ></form:errors>
					<i class="fa fa-lock fa-fw"></i>
					<input type="password"  name="password"  class="conin it" value="" placeholder="密码" />
				</li>
				<li class="none">
				    <form:errors path="code" ></form:errors>
					<i class="fa fa- fa-fw"></i>
					<input name="code" type="text" placeholder="请输入验证码"  class="conin"/>
					<div class="code">
							<img src="${ctx}/code" id="code" onclick="changevs()"/></a>
							<span id="code" class="sh" onclick="changevs()">
								换一张
							</span>
					 </div>
				</li>
				<li class="none">
					<input type="submit" id="" value="登录" class="conin l" onclick="check()"/>
					<span id="" class="wm">
						<a href="${ctx}/changepw">忘记密码</a>
					</span>
				</li>
			</ul>
			</form>
		</div>
	</body>
	<script type="text/javascript">
  /*      $(function(){
         $("#code").click(function(){
          $.Ajax(
          type:"POST",
          url:"${ctx}/code",
          success:function(data){
           $("img#id").text(data);  
          }
            );
         })
       }) */
         function changevs(){
        		    document.getElementById("code").src="${ctx}/code?"+Math.random();
        		}
         function check(form){
          	  with(form){
          		  if(username.value==""){
          			  alert("用户名不能为空！");
          			  return false;
          		  }
          		  if(password.value==""){
          			  alert("密码不能为空！");
          			  return false;
          		  }
          		  if(code.value==""){
          			  alert("请填写正确的验证码！");
          			  return false;
          		  }
          	  }
            }
  
   </script>
</html>