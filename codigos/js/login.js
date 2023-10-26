function logar(){ //login e senha
   
    var login = document.getElementById('login').value; //para pega o que digitar dentro da caixa de dialogo login
    var senha = document.getElementById('senha').value;

    if(login == "admin" && senha == "admin"){
       // alert('Sucesso');
        location.href = "cadastro.html";
    } else{
        alert('Usuario ou senha incorretos');
    }
}

function mostrarSenha(){ //olhor na senha
    var inputPass = document.getElementById('senha');
    var btnShowPass = document.getElementById('btn-senha');

    if(inputPass.type === 'password'){
        inputPass.setAttribute('type','text');

        btnShowPass.classList.replace('bi-eye-fill', 'bi-eye-slash-fill');
    }else{
        inputPass.setAttribute('type','password');

        btnShowPass.classList.replace('bi-eye-slash-fill', 'bi-eye-fill');
    }
}
 