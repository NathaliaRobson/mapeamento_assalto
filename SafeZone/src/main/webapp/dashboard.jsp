<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>DashboardSafeZone</title>
</head>
<body>
  <div>
    <h1>Reportar</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>EMAIL</th>
            <th>ZONA</th>
            <th>BAIRRO</th>
            <th>ANONIMO</th>
            <th>MENSAGEM</th>
            <th>ACTIONS</th>
        </tr>
             <c:forEach var="reportar" items="${reportars}">
                    <tr>
                        <td>${reportar.id}</td>
                        <td>${reportar.name}</td>
                        <td>${reportar.email}</td>
                        <td>${reportar.zona}</td>
                        <td>${reportar.bairro}</td>
                        <td>${reportar.anonimo}</td>
                        <td>${reportar.mensagem}</td>

                        <td>
                            <form action="/delete-car" method="post">
                               <input type="hidden" id="id" name="id" value="${car.id}">
                               <button type="submit">Delete</button>
                               <span>|</span>
                               <a href="reportar.jsp?id=${reportar.id}&name=${reportar.name}&email=${reportar.email}&zona=${reportar.zona}&bairro=${reportar.bairro}&anonimo=${reportar.anonimo}&mensagem=${reportar.mensagem}">Update</a>
                            </form>
                        </td>
                    </tr>
             </c:forEach>

    </table>
  </div>
</body>
</html>