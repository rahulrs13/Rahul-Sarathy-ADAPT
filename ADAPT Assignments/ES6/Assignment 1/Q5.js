"use strict";
let add = function (num1 = 54, num2 = 91) {
    return num1 + num2;
};
function userFriends(username, ...array) {
    document.write("<br>" + username + "<br>");
    for (let i of array) {
        document.write(i + "<br>");
    }
}
function printCapitalNames(name1, name2, name3, name4, name5) {
    document.write(name1.toUpperCase() + "<br>");
    document.write(name2.toUpperCase() + "<br>");
    document.write(name3.toUpperCase() + "<br>");
    document.write(name4.toUpperCase() + "<br>");
    document.write(name5.toUpperCase() + "<br>");
}
let array = ["Mike", "Ted", "Barney", "Lucifer", "Dimitri"];
document.write(add());
userFriends("Medmedev", array);
printCapitalNames(...array);
