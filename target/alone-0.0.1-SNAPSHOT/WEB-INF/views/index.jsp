<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jsp"%>

<% String path = request.getContextPath(); %>
<div class="container">
    <h2>index페이지</h2>
    <button type="button" id="btn_test">Click me</button>
    <%= path %>
</div>

<script type="text/javascript" src=""></script>
<%@include file="common/footer.jsp"%>

