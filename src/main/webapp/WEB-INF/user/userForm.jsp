<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
    <title>My First Spring CRUD Application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark" style="background-color: Green">
        <div>
            <a class="navbar-brand"> CRUD App </a>
        </div>
        <div>
            <a class="navbar-brand"> My First CRUD APP </a>
        </div>

    </nav>
</header>
<br>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">

                <form action="insert" method="post">



                    <c:if test="${user != null}">
                        <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
                    </c:if>

                    <fieldset class="form-group">
                        <label>User Name</label> <input type="text" value="<c:out value='${user.name}' />" class="form-control" name="name">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>User Email</label> <input type="text" value="<c:out value='${user.email}' />" class="form-control" name="email">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>User PhoneNumber</label> <input type="text" value="<c:out value='${user.phoneNumber}' />" class="form-control" name="phoneNumber">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>User BirthDate</label> <input type="date" value="<c:out value='${user.birthDate}' />" class="form-control" name="birthDate">
                    </fieldset>

                    <button type="submit" class="btn btn-success">Save</button>
                </form>
        </div>
    </div>
</div>
</body>

</html>