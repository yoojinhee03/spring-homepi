<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>게시물 작성</title>
</head>
<body>
<form action="write.do" method="post">
	제목<input type="text" name="title"><br>
	내용<textarea name="contents"></textarea><br>
	<input type="submit" value="작성">
	<input type="reset" value="취소">
</form>
</body>
</html>