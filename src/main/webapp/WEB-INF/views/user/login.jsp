<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-12-29
  Time: 오전 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jsp" %>
<div class="container-sm">
    <form action="/user/join" method="post" id="frm">
        <h1 class="h3 mb-3 fw-normal">로그인</h1>

        <div class="form-floating mb-3">
            <label for="username">아이디</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="아이디를 입력해주세요" required>
        </div>
        <div class="form-floating mb-3">
            <label for="password">비밀번호</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="비밀번호를 입력해주세요" required>
        </div>
    </form>
    <div class="col text-center">
        <button class="btn btn-primary" id="btn-login" type="button" @click="login()">로그인</button>
        <button class="btn btn-secondary" type="button" onclick="history.back()">취소</button>
    </div>
</div>
<%@include file="../common/footer.jsp" %>
<script type="text/javascript" src="/user/join.js"></script>