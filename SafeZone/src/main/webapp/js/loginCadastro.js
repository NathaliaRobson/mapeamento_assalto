const form = document.getElementById("form");
const username = document.getElementById("username");
const email = document.getElementById("email");

const password = document.getElementById("password");
const passwordConfirmation = document.getElementById("password-confirmation");

form.addEventListener("submit", (event) =>{
    event.preventDefault();

    /*alert("CADASTRADO COM SUCESSO !!!")*/

    // checkInputUsername();
    // checkInputEmail();
    // checkInputPassword();
    // checkInputPasswordConfirmation();

    checkForm();
})

email.addEventListener("blur", () => {
    checkInputEmail();
})

username.addEventListener("blur", () => {
    checkInputUsername(); /*verificar se esta se esta preenchedo*/ 
})



function checkInputUsername(){
    const usernameValue = username.value;

    if(usernameValue === ""){
        //mostrar o aviso e mostrar a mensagem de error
        errorInput(username, "Preencha um username!")
    } else{
        const formItem = username.parentElement;
        formItem.className = "form-content" /*para a mensagem que ja apareceu para sumir*/
    }
}

function checkInputEmail(){
    const emailValue = email.value;

    if(emailValue === ""){
        errorInput(email, "O email é obrigado.")
    } else{
        const formItem = email.parentElement;
        formItem.className = "form-content" /*para a mensagem que ja apareceu para sumir*/
    }

}

function checkInputPassword(){
    const passwordValue = password.value;

    if(passwordValue === ""){
        errorInput(password, "A senha é obrigatória.");

    } else if(passwordValue.length < 8){
        errorInput(password, "A senha precisa ter no minimo 8 caracteres.");
    } else{
        const formItem = password.parentElement;
        formItem.className = "form-content"
    }
}

function checkInputPasswordConfirmation(){
    const passwordValue = password.value;
    const confirmationPasswordValue = passwordConfirmation.value;

    if(confirmationPasswordValue === ""){
        errorInput(passwordConfirmation, "A confirmação de senha é obrigatoria.")
    } else if(confirmationPasswordValue !== passwordValue){
        errorInput(passwordConfirmation, "As senhas não são iguais.")
    } else{
        const formItem = passwordConfirmation.parentElement;
        formItem.className = "form-content"
    }
}

function checkForm(){
    checkInputUsername();
    checkInputEmail();
    checkInputPassword();
    checkInputPasswordConfirmation();

    const formItem = form.querySelectorAll(".form-content")

    const isValid = [...formItem].every( (item) => { /*vai verificar se tem error nos campos*/
        return item.className === "form-content"
    });

    if(isValid){
        alert("CADASTRA COM SUCESSO!")
    } 
    
}

function errorInput(input, mensagem){
    const formItem = input.parentElement;
    const textMessage = formItem.querySelector("a")

    textMessage.innerText = mensagem;

    formItem.className = "form-content error"
}