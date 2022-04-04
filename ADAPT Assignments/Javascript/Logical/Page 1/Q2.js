function max(n1,n2,n3){
 if (n1 > n2 && n1 > n3){
     document.write(n1);
 }
 else if (n2 > n3 && n2 > n1){
     document.write(n2);
 }
 else {
     document.write(n3);
 }
}
max(4,2,1);