<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style>
            .custom-border {
                border: 2px solid #000;
            }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome</h1>
        <table class="table table-bordered table-primary custom-border rounded">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Password</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${userDataList}" var="user">
                    <tr>
                        <td>${user['name']}</td>
                        <td>${user['email']}</td>
                        <td>${user['password']}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="login" class="btn btn-primary">Logout</a>
    </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
