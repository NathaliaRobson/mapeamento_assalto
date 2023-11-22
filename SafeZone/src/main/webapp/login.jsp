<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:ital,wght@0,200;1,200&family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">

    <link href="css/styleL.css" rel="stylesheet">

    <title>Login</title>
</head>
<body>
    <div class="container">
        <nav class="logo">
            <img class="safe" src="img/safezone2.png">
        </nav> 

    
        <section class="header">
            <h2>Login</h2>
        </section>

        <form action="/login" method="post" id="form" class="form">

                    <span>${requestScope.menssage}</span>

                <input type="text" placeholder="Nome de Usuario" id="login" name="username">
                <input type="password" placeholder="Senha" id="senha" name="password"><i class="bi bi-eye-fill" id="btn-senha" onclick="mostrarSenha()"></i>
                <input type="submit" id="enviar"; return false"> <!--chamado a função da js-->

            <div>
                 <span class="text"> Nao tem uma conta?
                     <a href="cadastro.html" class="">Inscreva-se agora</a>
                 </span>
            </div>
        </form>
    </div>



    <script src="js/login.js"></script>
</body>
</html>