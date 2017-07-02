<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${users}" var="user">
	<c:out value="${user.username}"></c:out><br>
	<c:out value="${user.age}"></c:out><br>
</c:forEach>
