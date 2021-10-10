const todoList = document.querySelector("#todoList");
let count = 1;
const alertDom = document.querySelector("#alert");

const alertFunction = (title, message, className="warning") => `
<div class="alert alert-${className} alert-dismissible fade show" role="alert">
  <strong>${title}</strong> ${message}
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
`

function addItem(){
    const inputPlace = document.querySelector("#inputText");

    if(inputPlace.value.trim().length == 0){
        console.log("girdi");
        alertDom.innerHTML = alertFunction(
            "Alan Boş Bırakılamaz!",
            "Eksik Bilgi Girdiniz!"
        )
        inputPlace.value = "";
    }else{
    alertDom.style.display = "none";

    let work = inputPlace.value;
    inputPlace.value = "";
    const liDom = document.createElement("li");
    liDom.innerHTML = work + '<button style="margin-left: 1350px;" id="close' + count + '">' + 'X' + '</button>';
    liDom.classList.add('list-group-item');
    liDom.id = "li-" + count;
    let id = liDom.id;
    liDom.addEventListener("click", function(e){
        e.target.style.background = "lightgreen";
        liDom.classList.add('text-decoration-line-through');
    });
    todoList.append(liDom);

    let buttonId = "close" + count;
    let button = document.getElementById(buttonId);
    button.onclick = function(){
        document.getElementById(id).remove();
    }
    count++;
    }
}