function double(x){
    return x*2;
}

function square(x){
    return x *x;
}
function composedValue(double,square,x) {
    return square(double(x));
}
console.log(composedValue(double,square,5));
document.write(composedValue(double,square,5));