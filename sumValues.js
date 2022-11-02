let arr = [1, 2, 3, 4, 5, 6];

console.log(fullSumArray(arr));

// without 0 index:
console.log(indexSumArray(arr, 3, 5));

function fullSumArray(arr) {
    
    let sum = 0;

    for(let a of arr) {
        sum += a;
    }

    return sum;
}

function indexSumArray(arr, x, y) {

    x--;
    y--;

    let sum = arr[x] + arr[y];
    return sum;
}