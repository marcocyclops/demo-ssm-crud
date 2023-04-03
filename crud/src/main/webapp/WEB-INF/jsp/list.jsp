<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <title>Books</title>
</head>
<body>
    <h1>Books</h1>

    <h3><a href="${pageContext.request.contextPath}/books/add">New Book</a></h3>

    <table>
        <th>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Quantity</th>
                <th>Description</th>
                <th>Action</th>
            </tr>
        </th>
        <tbody>
            <c:forEach var="book" items="${list}">
                <tr>
                    <td>${book.bookID}</td>
                    <td><a href="${pageContext.request.contextPath}/books/${book.bookID}">${book.bookName}</a></td>
                    <td>${book.bookCounts}</td>
                    <td>${book.detail}</td>
                    <td class="flex flex-row">
                        <a class="mr-8 decoration-none" href="${pageContext.request.contextPath}/books/update/${book.bookID}">EDIT</a>
                        <a class="del cursor-pointer" href="${pageContext.request.contextPath}/books/delete/${book.bookID}">DELETE</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <form id="delete-form" method="post">
        <input type="hidden" name="_method" value="delete" />
    </form>

    <script>
        const els = document.getElementsByClassName("del")
        Array.from(els).forEach(function (el) {
            el.addEventListener("click", function(event) {
                let deleteForm = document.getElementById("delete-form")
                deleteForm.action = event.target.href
                deleteForm.submit()
                event.preventDefault()
            })
        })
    </script>

    <style>
        .flex {
            display: flex;
        }
        .flex-row {
            flex-direction: row;
        }
        .mr-8 {
            margin-right: 8px;
        }
        .decoration-none {
            text-decoration: none;
        }
        .cursor-pointer {
            cursor: pointer;
        }
    </style>


</body>
</html>
