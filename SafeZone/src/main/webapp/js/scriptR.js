var countryLists = new Array(7)

 countryLists["zona0"] = ["Selecione um Bairro"];
 countryLists["Cental"] = ["Barra Funda","Bom Retiro","Brás","Liberdade","Santa Cecília","Sé","República","Consolação"];
 countryLists["Norte"] = ["Jaçanã","Vila Guilherme","Tremembé","Tucuruvi","Vila Maria"];
 countryLists["Sul"] = ["Itaim Bibi", "Ipiranga", "Morumbi", "Moema", "Vila Mariana", "Capão Redondo", "Grajaú"];
 countryLists["Leste"] = ["Itaquera", "Mooca", "Iguatemi", "Penha", "Sapopemba", "Tatuapé", "Vila Formosa", "Lajeado", "Cangaíba"];
 countryLists["Oeste"] = ["Jaraguá", "Vila Leopoldina", "São Domingos", "Anhanguera", "Brasilândia", "Perdizes"," Pinheiros"];

 function comboDinamica(selectObj) {
 // get the index of the selected option
 var idx = selectObj.selectedIndex;
 // get the value of the selected option
 var which = selectObj.options[idx].value;
 // use the selected option value to retrieve the list of items from the countryLists array
 cList = countryLists[which];
 // get the country select element via its known id
 var cSelect = document.getElementById("atributo1");
 // remove the current options from the country select
 var len=cSelect.options.length;

 while (cSelect.options.length > 0) {
 cSelect.remove(0);
 }
 var newOption;
 // create new options
 for (var i=0; i<cList.length; i++) {
 newOption = document.createElement("option");
 newOption.value = cList[i];  // assumes option string and value are the same
 newOption.text=cList[i];
 // add the new option
 try {
 cSelect.add(newOption);  // this will fail in DOM browsers but is needed for IE
 }
 catch (e) {
 cSelect.appendChild(newOption);
 }
 }
 }

 /*Validação*/
 const form = document.querySelector("#formulario1");
const nameInput = document.querySelector("#name");
const emailInput = document.querySelector("#email");

const dataCrime = document.querySelector("#iddate");

const zonaSelect = document.querySelector("#zona1");
const bairroSelect = document.querySelector("#atributo1");
const anonimoSelect = document.querySelector("#anonimo");

const mensageTextarea = document.querySelector("#mensagem"); /*chama as ID do HTML*/

form.addEventListener("submit", (event) => {
    event.preventDefault();

    //verificando se o nome esta vazio

    if(nameInput.value === ""){
        alert("Por favor, preencha o seu nome");
        return;

    }
    // verifica se o email esta vazio preenchido e se é valido
    if(emailInput.value === "" || !isEmailValid(emailInput.value)){
        alert("Por favor, preencha o seu email");
        return;
    }

    // if(dataCrime.value === "" || !isDataValid(dataCrime.value)){ //opção para escolhe
    //     alert("Por favor, selecione uma Data do Crime");
    //     return;
    // }

    //verificar se a situação foi selecionada
    if(zonaSelect.value === "zona0"){ //opção para escolhe
        alert("Por favor, selecione uma Zona");
        return;
    }

    //verificar se a situação foi selecionada
    if(bairroSelect.value === "0"){ //opção para escolhe
        alert("Por favor, selecione um Bairro");
        return;
    }

//verificar se a situação foi selecionada
    if(anonimoSelect.value === "a"){ //opção para escolhe
        alert("Por favor, selecione uma opção Anonimo");
        return;
    }

    //verifica se a mensagem esta preenchida
    if(mensageTextarea.value === ""){
        alert("Por favor, escreva seu depoimento");
        return;
    }



    // se todos os campos estiverem corretamete preenchidos, envie o form
    form.submit();
    //alert("sucesso")
});

//Função que valida e-mail
function isEmailValid(email){
    //cria uma regex para validar email
    const emailRegex = new RegExp(
        //usuario12@host.com.br
        /^[a-zA-Z0-9._-]+@+[a-zA-Z0-9._-]+\.[a-zA-Z]{2,}$/
    );

    if(emailRegex.test(email)){
        return true;
    }
    return false;
}
