<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <div class="col-md-6 offset-md-3 p-3" style="background-color:lightblue;">
            <h1 class="text-center">Login</h1>
            <form:form action="login" method="post">
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control" name="email" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control" name="password" required>
                </div>
                <p style="color:blue">${registeredmessage}</p>
                <p style="color:red">${errormessage}</p>
                <button type="submit" class="btn btn-primary">Log In</button>
            </form:form>
            <p class="mt-3">Don't have an account? <a href="register">Register</a></p>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

