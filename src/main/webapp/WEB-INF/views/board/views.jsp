<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java"  session="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>homepi</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

<script>
/*
$.ajax({
    "url" : "${pageContext.request.contextPath}/homepi",
    "type" : "POST",
    "dataType": "json",
    "data" : {"dataType":"init"},
    "success" : function(data){
       // console.log(data);
    //alert("가져온 데이터 입니다 . "+data);
    var str = "<select id='mainTableList'>";
    str +="<tr >";
    $.each(data,function(i,v){
        //데이터 인풋
        console.log(data.data[0]['postNo']);
        str +="<td>"+ data.data[0]['postNo']+"</td>";  
    });
    str +="</tr>";
    console.log(str);
    $("#tableList").html(str);
    },
    
    "error" : function(info, xhr){
        if(info.readyState == '4'){
            alert('문제가 발생했습니다.\n상태코드 : ' + info.status+ '\n\n' + info.responseText);
        }else{
            alert('문제가 발생했습니다.\n잠시후 다시 시도해 주세요.\n 상태코드 : ' +info.status);
        }
    }
});
*/
</script>
</head>
<body>
	<a href="homepi/board/write">게시물 작성!!!</a>
	<c:forEach var="ll" items="${board}">
	<div style="border:1px solid gray">
		작성자 : ${ll.empno}<br>
		제목 : ${ll.title }<br>
		내용 : ${ll.contents }<br>
		<form action="homepi/board/update" method="post">
			<input type="hidden" name="postno" value="${ll.postno }">
			<input type="submit" value="수정">
		</form>
		<form action="homepi/board/deleteProc" method="post">
			<input type="hidden" name="postno" value="${ll.postno }">
			<input type="submit" value="삭제">
		</form>
	</div>
	</c:forEach>
</body>
</html>