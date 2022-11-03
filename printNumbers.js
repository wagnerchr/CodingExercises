for(let a of showPrimeNumbers(0, 50)) {
    console.log(a)
}


function showPrimeNumbers(x, y) {

    primeNumbers = [];
    for(x; x < y; x++) {
        if(x !== 0 && x !== 1) {
            if(x%2 != 0 && x%3 != 0 && x%5 != 0 && x %7 != 0)
                primeNumbers.push(x);

        }

        if(x == 3 || x == 2 || x == 5 || x == 7)
            primeNumbers.push(x)
    }
    return primeNumbers
}