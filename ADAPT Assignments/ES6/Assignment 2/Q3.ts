function isArmstrong(num){
    let a=num.toString().split("").map(iNum => parseInt(iNum, 10));;
    let b=0;
    for (let i of a) {
        b += Math.pow(i, 3);
    }
    return b==num;
 }
 let i=0;

 function *getNextArmstrong(){
    
    while(true){
        if( isArmstrong(i)){
            yield i;
        }
        if(i>1000){
            i=0;
            yield "number is too larger";
        }
        i++;
    }
 }

 function zero(){
    i=0;
}
 
 var g = getNextArmstrong();
 document.write(g.next().value+"<br>");
 document.write(g.next().value+"<br>");
 document.write(g.next().value+"<br>");
 document.write(g.next().value+"<br>");
 zero();
 document.write(g.next().value+"<br>");