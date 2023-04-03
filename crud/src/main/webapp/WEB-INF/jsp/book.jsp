<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
    <h1>Book</h1>

    <div class="flex flex-col w-240">
        <div class="mt-8">${book.bookName}</div>

        <div class="mt-8">${book.detail}</div>

    </div>

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
