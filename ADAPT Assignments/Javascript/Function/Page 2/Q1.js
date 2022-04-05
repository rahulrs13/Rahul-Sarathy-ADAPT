var num = [1,3,5,4,2];
function isEven(num){
    return (num %2 == 0);
}
function find(num,func){
    for(var i=0;i,num.length;i++){
        if(func(num[i])==true)
            return num[i];
        else{
            num.shift();
            return(find(num,func));
        }
    }

}
document.write(find(num,isEven));

