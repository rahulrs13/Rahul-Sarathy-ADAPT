let order = {
    id : 123,
    name : "Delhi koonk",
    price : 890,
    printOrder(){
        console.log("Id: "+order.id);
        console.log("Name: "+order.name);
        console.log("Price: "+order.price)
    },
    getPrice(){
        return order.price;
    }
}
console.log(order.printOrder())

let order1 = Object.assign(order)
console.log(order1)