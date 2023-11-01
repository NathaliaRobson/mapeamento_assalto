<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>DashboardSafeZone</title>
</head>
<body>
  <div>

    <c:if test="${sessionScope.loggedUser != null}">
        <span>${sessionScope.loggedUser}</span>
        <a href="/logout">Logout</a>
    </c:if>

    <h1>Safes</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <c:if test="${sessionScope.loggedUser != null}">
                <th>Actions</th>
            </c:if>
        </tr>
        <c:forEach var="safe" items="${safes}">
            <tr>
                <td>${car.id}</td>
                <td>${car.name}</td>
                <td>
                    <c:if test="${sessionScope.loggedUser != null}">
                        <form action="/delete-safe" method="post">
                            <input type="hidden" id="id" name="id" value="${safe.id}">
                            <button type="submit">Delete</button>
                            <span> | </span>
                            <a href="index.jsp?id=${safe.id}&name=${safe.name}">Update</a>
                        </form>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
  </div>
</body>
</html>