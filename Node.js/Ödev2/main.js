function addLi(){
    let value = document.getElementById("text").value;
    let li = document.createElement("li");
    li.appendChild(document.createTextNode(value));
    document.getElementById("unorderedList").appendChild(li);
    document.getElementById("text").value = "";
}

function listItems(){
    const li = document.querySelectorAll("li");
    li.forEach(element => {
        console.log(element.innerText);
    })
}


function prom(){
    const promise = new Promise((resolve, reject) => {
        listItems();
        resolve("Elemanlar Listelendi.");
    });
    
    promise
        .then((value) => {
            listItems();
            console.log(value)
        })

    return promise;
}
