<%@page import="himedia.dao.EmailVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
// Servlet으로부터 전달한 list 객체 얻어오기
List<EmailVo> list = null;
if (request.getAttribute("list") instanceof List){ // 전달 받은 list가 List인지 확인
	list = (List<EmailVo>)request.getAttribute("list"); // 다음 캐스팅
}
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메일링 리스트:메인</title>
<link type="text/css" 
	rel="stylesheet" 
	href="<%= request.getContextPath() %>/css/list.css" />
<script>
function delete_item(event, frm) {
	event.preventDefault();
	
	let choice = confirm("메일을 삭제하시겠습니까?");
	if (choice) {
		frm.submit();
	}
}
</script>
</head>
<body>
	<h1>메일링 리스트</h1>
	<h3>Model 2 방식</h3>
	<!-- 리스트 -->
	<a:forEach items="${userList }" var="vo" varstatus="status">
	<tr>
	<th>성</th>
	<td>${vo.lastname }</td>
	</tr>
	<th>이름</th>
	<td>${vo.firstname }</td>
	</tr>
	<th>이메일</th>
	<td>${vo.email }</td>
	</tr>
	</a:forEach>
	<!-- vo 객체의 getter를 이용, 리스트를 표시 -->
	
	
	<br />
	<%--
	}
	--%>
	<!-- /End -->
	<p>
	<!-- ContextPath를 받아와서 form.jsp에 링크 -->
		<a href="<%= request.getContextPath() %>/el?a=form">추가 이메일 등록</a>
	</p>

</body>
</html>