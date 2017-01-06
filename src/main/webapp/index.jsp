<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<%--<jsp:include page="header.jsp"/>--%>
<body>
<div class="container xd-container">
    <form class="form-2">
        <h1><span class="log-in">Войти</span> или <span class="sign-up">зарегистрироваться</span></h1>
        <p class="float">
            <label for="login"><i class="icon-user"></i>Логин</label>
            <input type="text" name="login" placeholder="Логин или email">
            <span style="color: red">${errorLogin}</span>
        </p>
        <p class="float">
            <label for="password"><i class="icon-lock"></i>Пароль</label>
            <input type="password" name="password" placeholder="Пароль" class="showpassword">
            <span style="color: red">${errorPassword}</span>
        </p>
        <p class="clearfix">
            <input type="submit" name="submit" value="Войти">
        </p>
    </form>
</div>
</body>
</html>