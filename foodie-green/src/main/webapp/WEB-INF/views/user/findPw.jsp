<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="/js/user/findPw.js"></script>
<link href="/css/user/content.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<%@ include file="../home/header.jsp"%>

	<div class="center paddingtop120">

		<p class="title">비밀번호 찾기</p>

		<p class="font20">휴대폰 번호</p>
		<input type="text" class="input" placeholder="휴대폰 번호를 입력하세요"
			id="phone">

		<p class="font20 bottom0">이메일</p>
		<p class="font15 top1vh pointcolor">비밀번호 인증 메일이 가는 주소입니다.</p>
		<div class="findPwDiv">
			<input type="text" placeholder="회원가입시 등록하신 이메일을 입력해주세요" id="email"
				class="input">
			<div class="findPwBtn">
				<button type="button" class="sendKeyBtn" onclick="sendSecretkey();">인증번호
					요청</button>
			</div>
		</div>

		<div class="findPwDiv">
			<input type="text" placeholder="인증번호를 입력해주세요" id="checkKey"
				class="input">
			<div class="findPwBtn">
				<button type="button" class="authKeyBtn" onclick="authSecretkey();">인증번호
					확인</button>
			</div>
		</div>

		<button type="submit" class="findPwbtn">비밀번호 찾기</button>
	</div>
	<%@ include file="../home/footer.jsp"%>

</body>
</html>
