var countryLists = new Array(7)

 countryLists["zona0"] = ["Selecione um Bairro"];
 countryLists["Cental"] = ["Barra Funda","Bom Retiro","Bras","Liberdade","Santa Cecília","Se","Republica","Consolacao"];
 countryLists["Norte"] = ["Jacana","Vila Guilherme","Tremembe","Tucuruvi","Vila Maria"];
 countryLists["Sul"] = ["Itaim Bibi", "Ipiranga", "Morumbi", "Moema", "Vila Mariana", "Capao Redondo", "Grajau"];
 countryLists["Leste"] = ["Itaquera", "Mooca", "Iguatemi", "Penha", "Sapopemba", "Tatuape", "Vila Formosa", "Lajeado", "Cangaiba"];
 countryLists["Oeste"] = ["Jaragua", "Vila Leopoldina", "Sao Domingos", "Anhanguera", "Brasilandia", "Perdizes"," Pinheiros"];

 function comboDinamica(selectObj) {
 // obter o índice da opção selecionada
 var idx = selectObj.selectedIndex;
 // obter o valor da opção selecionada
 var which = selectObj.options[idx].value;
 // use o valor da opção selecionada para recuperar a lista de itens da matriz countryLists
 cList = countryLists[which];
 // obtenha o elemento de seleção do país por meio de seu ID conhecido
 var cSelect = document.getElementById("rep-bairro");
 // remova as opções atuais da seleção do país
 var len=cSelect.options.length;

 while (cSelect.options.length > 0) {
 cSelect.remove(0);
 }
 var newOption;
 // criar novas opções
 for (var i=0; i<cList.length; i++) {
 newOption = document.createElement("option");
 newOption.value = cList[i];  // assume que a string de opção e o valor são iguais
 newOption.text=cList[i];
 // add the new option
 try {
 cSelect.add(newOption);  // isso falhará nos navegadores DOM, mas é necessário para o IE
 }
 catch (e) {
 cSelect.appendChild(newOption);
 }
 }
 }

 /*Validação*/
const form = document.querySelector("#formulario1");
const nameInput = document.querySelector("#rep-name");
const emailInput = document.querySelector("#rep-email");

//const dataCrime = document.querySelector("#iddate");

const zonaSelect = document.querySelector("#rep-zona");
const bairroSelect = document.querySelector("#rep-bairro");
const anonimoSelect = document.querySelector("#rep-anonimo");

const mensageTextarea = document.querySelector("#rep-mensagem"); /*chama as ID do HTML*/

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
