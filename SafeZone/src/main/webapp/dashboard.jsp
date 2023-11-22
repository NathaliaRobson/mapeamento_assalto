<!DOCTYPE html>
<html>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/styleDD.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
    <header>
        <nav class="logo">
           <a href="index.html"><img class="safe" src="img/safezone2.png"></a>
        </nav>

        <nav class="mnuPrincipal">
            <ul>
                <li class="usr"><th> <c:if test="${sessionScope.loggedUser != null}">
                    <span>${sessionScope.loggedUser}</span>
                    <a href="/logout">Logout</a></th></li>

                <li class="usr2"><th><form action="" method="">
                    <a href="index.html">Sair</a></c:if></th></li>
            </ul>

        </nav>
    </header>

    <main>

        <h1>Reportar</h1>
       <table>
           <tr class="n_tab">
               <th>ID</th>
               <th>Name</th>
               <th>EMAIL</th>
               <th>ZONA</th>
               <th>BAIRRO</th>
               <th>ANONIMO</th>
               <th>MENSAGEM</th>

               <c:if test="${sessionScope.loggedUser != null}">
                  <th>Actions</th>
                </c:if>

           </tr>
                <c:forEach var="reportar" items="${reportars}">
                       <tr >
                           <td>${reportar.id}</td>
                           <td>${reportar.name}</td>
                           <td>${reportar.email}</td>
                           <td>${reportar.zona}</td>
                           <td>${reportar.bairro}</td>
                           <td>${reportar.anonimo}</td>
                           <td>${reportar.mensagem}</td>

                           <td class="btn">

                               <c:if test="${sessionScope.loggedUser != null}">
                               <form  action="/delete-reportar" method="post">
                                  <input type="hidden" id="id" name="id" value="${reportar.id}">
                                  <button type="submit">Delete</button>

                                  <a href="reportar.jsp?id=${reportar.id}&name=${reportar.name}&email=${reportar.email}&zona=${reportar.zona}&bairro=${reportar.bairro}&anonimo=${reportar.anonimo}&mensagem=${reportar.mensagem}" class="upd">Update</a>
                               </form>
                             </c:if>

                           </td>

                       </tr>
                </c:forEach>

       </table>

     </main>

      <script src="script.js"></script>

</body>
</html>