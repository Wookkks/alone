<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jsp" %>
<<div class="container-sm">
    <form action="/user/join" method="post">
        <h1 class="h3 mb-3 fw-normal">회원가입</h1>

        <div class="form-floating mb-3">
            <label for="name">이름</label>
            <input v-model="signup.email" type="text" class="form-control" id="name" name="name" placeholder="이름을 입력해주세요" required>
        </div>
        <div class="form-floating mb-3">
            <label for="email">이메일</label>
            <input v-model="signup.email" type="email" class="form-control" id="email" name="email" placeholder="이메일을 입력해주세요" required>
        </div>
        <div class="form-floating mb-3">
            <label for="password">비밀번호</label>
            <input v-model="signup.password" type="password" class="form-control" id="password" name="password" placeholder="비밀번호를 입력해주세요" required>
        </div>
        <div class="row">
        </div>
    </form>
        <div class="col text-center">
            <button class="btn btn-primary" id="btn-join" type="button" @click="join()">회원가입</button>
            <button class="btn btn-secondary" type="button" onclick="history.back()">취소</button>
        </div>
</div>
<%@include file="../common/footer.jsp" %>
<script type="text/javascript" src="/user/join.js"></script>

