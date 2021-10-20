const { RSA_X931_PADDING } = require('constants');
const readline = require('readline');

function getArea(radius){
    return Math.PI * radius * radius;
}

let rl = readline.createInterface(
    process.stdin, process.stdout);

rl.question("What is radius?", (rad) => {
    let area = getArea(rad);
    console.log("Circle Area : ${area}")
})