//print sum of even numbers

let arr = [10,13,23,25,30,40,45,50]
console.log(arr)
for(let i=0; i<arr.length ; i++){
    if(arr[i]%2==0){
        console.log(arr[i])
    }
}


//print only numbers

let arr1 =[12,"hi",13,true,14,false,32,"sanju",7,9]
console.log(arr1)
for(let i=0; i<arr1.length; i++){
    if(typeof arr1[i] === 'number'){
        console.log(arr1[i])
    }   
}



