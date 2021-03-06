<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
	<title>Spring Boot JSP example</title>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>
	<br> Message: ${message}
	
	 <div class="container">
        <table class="table table-striped">
            <caption>Your todos are</caption>
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Is it Done?</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                    <tr>
                        <td>Todo 1</td>
                        <td>10/12/2017</td>
                        <td>No</td>
                        <td><a class="btn btn-warning" href="/edit-todo">Edit Todo</a></td>
                        <td><a class="btn btn-warning" href="/delete-todo">Delete Todo</a></td>
                    </tr>
            </tbody>
        </table>
        <div>
            <a class="btn btn-default" href="/add-todo">Add a Todo</a>
        </div>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </div>
</body>
</html>