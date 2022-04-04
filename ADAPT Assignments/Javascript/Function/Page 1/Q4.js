function sqaure(arr) {

  ret= [];

  for (var i = 0, len = arr.length; i < len; i++) {
      ret.push(arr[i] * arr[i]);
  }

  return ret;     
}
function root(arr){
  ret= [];

  for (var i = 0, len = arr.length; i < len; i++) {
      ret.push(Math.sqrt(arr[i]));
  }
  return ret;
}
document.write("Square : "+sqaure([1,2,3,4,5])+"<br>");
document.write("Squareroot : "+root([1,4,9,16,25]));