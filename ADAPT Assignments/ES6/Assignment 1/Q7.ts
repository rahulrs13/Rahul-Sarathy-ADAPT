let arr = ['Mike','Eston','LA',48]

let [fname,lname,city,age] = arr;

console.log(city);
document.write(city);


let org = {
    name : "BT235",
    address:"22, Miami Main Road,Miami,325001"
};

let {name : n,address : p} = org;

console.log(p.slice(26,32));
