class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
     getarea(){
      return this.height * this.width
  }
   
  }
var obj = new Rectangle(4, 5);
console.log(obj.height);
document.write("Height : " + obj.height+"<br>");
console.log(obj.width);
document.write("Width : "+obj.width+"<br>");
console.log(obj.getarea());
document.write("Area : "+obj.getarea());
