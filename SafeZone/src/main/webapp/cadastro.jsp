<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:ital,wght@0,200;1,200&family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">

    <link href="css/styleC.css" rel="stylesheet">

    <title>Cadastro</title>
</head>
<body>
    <div class="container">
        <nav class="logo">
            <img class="safe" src="img/safezone2.png">
        </nav> 

    
        <section class="header">
            <h2>Nova conta</h2>
        </section>

        <form id="form" class="form" action"/create-cadastro" method"post">
            <div class="form-content">
                <label for="username" >Nome do usuario</label>
                <input type="text" id="username" name="cad_username" value="${param.cad_username}" placeholder="Digite nome do usuario...">

                <a>Aqui mensagem de error...</a>
            </div>

            <div class="form-content">
                <label for="email" >Email</label>
                <input type="email" id="email" name="cad_email" value="${param.cad_email}" placeholder="Digite o seu email...">

                <a>Aqui mensagem de erro...</a>
            </div>

            <div class="form-content">
                <label for="password" >Senha</label>
                <input type="password" id="password" name="cad_password" value="${param.cad_password}" placeholder="Digite o sua senha..." >


                <a>Aqui mensagem de erro...</a>
            </div>

            <div class="form-content">
                <label for="password-confirmation" >Confimacao de Senha</label>
                <input type="password" id="password-confirmation" name="cad_passwordconf" value="${param.cad_passwordconf}" placeholder="Digite o sua senha novamente..." >

                <a>Aqui mensagem de error...</a>
            </div>

            <input type="hidden" id="id" name="id" value="${param.id}">

            <button type="submit" id="enviar" onclick="logar(); return false">Cadastrar</button>
        </form>

        <span class="text">Ja e um membro?
            <a href="login.jsp" class="">Login agora</a>
        </span>
    </div>


    <script src="js/loginCadastro.js"></script>
</body>
</html>