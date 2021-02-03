<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
<h1>사원 정보 입력</h1>

<form action="write" method = "post">
	<table>
		<tr>
			<td>사원번호</td>
			<td><input type="number" name="empno"/></td>
		</tr>
		<tr>
			<td>사원이름</td>
			<td><input type="text" name="ename"/></td>
		</tr>
		<tr>
			<td>사원직급</td>
			<td><input type="text" name="job"/></td>
		</tr>
		<tr>
			<<td>매니저</td>
			<td>
				<select name="mgr">
				   <c:forEach var="dto" items="${mgrList}">
				       <option value="${dto.empno}"> (${dto.empno})${dto.ename}</option>
				   </c:forEach>
				 
				</select>
			</td>
		</tr>
		<tr>
			<td>입사일</td>
			<td><input type="date" name="date"/></td>
		</tr>
		<tr>
			<td>급여</td>
			<td><input type="number" name="sal"/></td>
		</tr>
		<tr>
			<td>커미션</td>
			<td><input type="number" name="comm"/></td>
		</tr>
		<tr>
			<td>부서</td>
			<td>
				<select name="dname">
				   <c:forEach var="dto1" items="${dnameList}">
				       <option value="${dto1.deptno}"> (${dto1.deptno})${dto1.dname}</option>
				   </c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="추가"/></td>
				
			
		</tr>
	</table>
</form>

</body>
</html>