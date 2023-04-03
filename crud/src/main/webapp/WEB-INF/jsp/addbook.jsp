<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
    <h1>Add Book</h1>

    <form action="${pageContext.request.contextPath}/books/add" method="POST" class="flex flex-col w-240">
        <label>Book Name:</label>
        <input type="text" name="bookName" required/>

        <label class="mt-8">Book Quantity</label>
        <input type="number" name="bookCounts" required />

        <label class="mt-8">Book Detail</label>
        <textarea name="detail" required></textarea>

        <input class="mt-16" type="submit" value="Add" />
    </form>

    <style>
        .flex {
            display: flex;
        }
        .flex-col {
            flex-direction: column;
        }
        .mt-8 {
            margin-top: 8px;
        }
        .mt-16 {
            margin-top: 16px;
        }
        .w-240 {
            width: 240px;
        }
    </style>
</body>
</html>
