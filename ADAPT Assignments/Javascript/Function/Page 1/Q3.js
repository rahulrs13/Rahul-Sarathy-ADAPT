var num = [1,3,5,4,2];
function isEven(num){
    return (num%2 == 0);
}
function  find(isEven){
 document.write(num.find(e => e % 2 == 0));
}
for(i=0;i<=4;i++){
document.write(isEven(num[i])+"<br>");
}
find(isEven);
