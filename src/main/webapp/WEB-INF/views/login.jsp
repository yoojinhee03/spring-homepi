<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java"  session="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
    <div class="container">
        <main>
            <div class="content">
                <div class="left">
                    <h1>pacebook</h1>
                    <h3>pacebook에서 전세계에 있는 친구, 가족, 지인들과 함께 이야기를 나눠보세요.</h3>
                </div>
                <div class="right">
                    <div class="box">
	                    <form action="/homepi/loginProc" method="post">
	                        <div class="top">
	                            <div id="area-id">
	                                <input type="text" placeholder="id를 입력해주세요" name="id">
	                            </div>
	                            <div id="area-pw">
	                                <input type="password" placeholder="password를 입력해주세요" name="password">
	                            </div>
	                            <div id="area-login-button">
	                                <input type="submit" value="로그인">
	                            </div>
	                            <div>
	                                <a href="">
	                                    비밀번호를 잊으셨나요?
	                                </a>
	                            </div>
	                        </div>
                        </form>
                        <div class="bottom">
                            <div id="area-signup-button">
                                <button>새 계정 만들기</button>
                            </div>
                        </div>
                    </div>
                    
                </div>
            </div>
            
        </main>
        <footer>
            <div class="top">
                설명
            </div>
            <div class="bottom">
                설명설명
            </div>
        </footer>
    </div>

</body>
</html>