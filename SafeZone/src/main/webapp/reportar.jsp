<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styleR.css">
    <title>Reportar</title>
</head>
<main>

    <div class="container">

        <nav class="logo">
            <a href="index.html"><img class="safe" src="img/safezone2.png"></a>
        </nav>

        <h1>Reportar</h1>
        <form id="formulario1" action="/create-reportar" method="post">
            <label for="rep-name">Nome:</label>
            <input type="text" id="rep-name" name="rep-name" value="${param.name}">

            <label for="rep-email">E-Mail:</label>
            <input type="email" id="rep-email" name="rep-email" value="${param.email}">


            <label for="rep-zona">Zona de Sao Paulo</label>
            <select name="rep-zona" id="rep-zona" value="${param.zona}" onchange="comboDinamica(this);">

                <option value="zona0">Selecione um Zona</option>
                <option value="Cental">Cental</option>
                <option value="Norte">Norte</option>
                <option value="Sul">Sul</option>
                <option value="Leste">Leste</option>
                <option value="Oeste">Oeste</option>

            </select>

            <label for="rep-bairro">Bairro de Sao Paulo:</label>
            <select name="rep-bairro" id="rep-bairro" value="${param.bairro}">
                <option value="0">Selecione um Bairro</option>
            </select>

            <label for="rep-anonimo">Anonimo:</label>
            <select name="rep-anonimo" id="rep-anonimo" value="${param.anonimo}">
                <option value="a">Opcoes?</option>
                <option value="yes">Sim</option>
                <option value="no">Nao</option>

            </select>

            </select>
            <label for="rep-mensagem">Depoimento:</label>
            <textarea name="rep-mensagem" id="rep-mensagem" value="${param.mensagem}"></textarea>


            <input type="hidden" id="id" name="id" value="${param.id}">

            <button type="submit">Enviar</button>

        </form>


    </div>
</main>
<script language="JavaScript" src="js/scriptR.js" ></script>

</body>
</html>