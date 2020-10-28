<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>
<!-- <script type="text/javascript">
/*
 *   $(document).ready(function(){
	   =============== 생략
	 
     })
     
     $(function(){
	
     });
     window.onload=function()
     {
    	 
     }
 */
$(function(){
	// 태그에 대한 이벤트 (클릭..마우스 오버 ...)
	// onClick="send()"  function send(){}
	$('#logBtn').click(function(){
		// selector => css
		let member_id=$('#log_member_id').val();// getter  , $('#log_id').val("admin") setter
		//$('#log_id').val("hong");
		if(id.trim()=="")
		{
			$('#log_id').focus();
			return;
			// <input type="text" class="input-sm" name=id size="15" id="log_id" placeholder="아이디입력"  style="color:black">
		}
		
		let pwd=$('#log_pwd').val();// getter  , $('#log_id').val("admin") setter
		//$('#log_id').val("hong");
		if(pwd.trim()=="")
		{
			$('#log_pwd').focus();
			return;
			// <input type="text" class="input-sm" name=id size="15" id="log_id" placeholder="아이디입력"  style="color:black">
		}
		// id입력
		// pwd입력 ===> login_ok.do ==> 데이터 전송 
		$('#logFrm').submit(); //<form => action="파일명">
		// <input type=submit> ==> 'null'
	});
});
</script>
 -->


<div style="height:30px"></div>
  <c:if test="${sessionScope.id==null }">
	  <form method="post" action="../member/login.do" id="logFrm">
	    <div class="text-right">
	      <input type="text" class="input-sm" name=id size="15" id="log_id" placeholder="아이디입력"  style="color:black">
	      <input type="password" class="input-sm" name=pwd size="15" id="log_pwd" placeholder="비밀번호입력"  style="color:black">
	      <input type="button" class="btn btn-danger btn-sm" id="logBtn" value="로그인">
	      
	            <input type=submit>
	            <button>
	            <input type=image>   ==> submit
	      
	    </div>
	  </form>
  </c:if>
  
       HTML(JSP)=> 처리 요청   ==> .do ==> Model <==> DAO
                               JSP <=== 결과값 전송 
  
  <c:if test="${sessionScope.id!=null }">
	  <form action="../member/logout.do">get(생략이 가능)
	    <div class="text-right">
	      ${sessionScope.name }(${sessionScope.admin=='y'?'관리자':'일반유저' })님 로그인중입니다...
	      <button class="btn btn-danger btn-sm">로그아웃</button>
	    </div>
	  </form>
  </c:if>
</div>
<div id="dialog" style="display:none">
  <jsp:include page="../member/login.jsp"></jsp:include> 
</div>

<h1>Hello</h1>
</body>
</html>