let p1 = new Promise((resolve,reject) => {
    let x = 22;
    resolve(x);
    reject("No")
})

p1.then((m) => {
    console.log(m);
}).catch((m) => {
    console.log("Error"+m);
})

let p2 = new Promise((resolve,reject) => {
    let y = 12;
    resolve(y);
    reject("No")
})

p2.then((l) => {
    console.log(l);
}).catch((l) => {
    console.log("Error"+l);
})

Promise.all([p1,p2]).then(function(values){
    let sum = 0;
    for (let i in values){
        sum+=values[i];
    }
  document.write(sum);
})
