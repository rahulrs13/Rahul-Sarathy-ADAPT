class Fibo{
   previousNo=Symbol();
   currentNo=Symbol();
   constructor(){
      this.previousNo=0;
      this.currentNo=1;
   }
   next(){
      
       let nxt=Symbol();
       nxt = this.previousNo+this.currentNo;
       this.previousNo=this.currentNo;
       this.currentNo=nxt;
      
       return nxt;
   }
 }
 
 let obj =new Fibo();
 document.write(obj.next()+"<br>");
 document.write(obj.next()+"<br>");
 document.write(obj.next()+"<br>");
 document.write(obj.next()+"<br>");
 document.write(obj.next()+"<br>");