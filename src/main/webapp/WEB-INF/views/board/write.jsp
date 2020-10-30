<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>게시물 작성</title>
</head>
<body>
<c:choose>
	<c:when test="${board==null }">
		<c:set value="writeProc" var="url"/>
		<c:set value="작성" var="btnValue"/>
	</c:when>
	<c:when test="${board!=null }">
		<c:set value="updateProc" var="url"/>
		<c:set value="수정" var="btnValue"/>
	</c:when>
</c:choose>
<form action="${url }" method="post">
	제목<input type="text" name="title" value="${board.title }"><br>
	내용<textarea name="contents">${board.contents }</textarea><br>
	<input type="hidden" name="postno" value="${board.postno }">
	<input type="submit" value="${btnValue }">
	<input type="reset" value="취소">
</form>
</body>
</html>