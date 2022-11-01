arr = [1,2,2,3,3,3,3,3,4,5,6,7,8]
target = 2;

console.log(firstLast(arr, target));

function firstLast(arr, target) {

    arr = arr.sort();

    // Positions
        let arrTarget = [];
        let start = 0;
        let end = 0;

    for(i in arr) {
        if(arr[i] == target) 
            arrTarget.push(arr[i])   
    }

    start = arr.indexOf(target);
    end = start - 1;
    for(i in arrTarget)
        end++

    return [start, end]       
}