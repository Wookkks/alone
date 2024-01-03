<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jsp"%>

<%

%>
<div id="indexPage" class="container">
    <h2>index Page</h2>
    <h3>User List</h3><br><br>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">회원번호</th>
            <th scope="col">이메일</th>
            <th scope="col">이름</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="user" items="${users}">
        <tr>
            <th scope="row"><span>${user.id}</span></th>
            <td><span>${user.email}</span></td>
            <td><span>${user.name}</span></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="common/footer.jsp"%>
<script type="text/javascript" src="/user/join.js"></script>
<script type="text/javascript" src="/user/index.js"></script>

