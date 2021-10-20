console.log(process.argv[1])

function primeNum(num) {
    let isPrime = true
    if(num < 2) isPrime = false;
    for (let index = 2; index < num; index++) {
        if(num % index == 0) isPrime = false;        
    }
    if(isPrime)console.log("Prime Number.")
    else console.log("Not Prime Number.")
}

primeNum(1)