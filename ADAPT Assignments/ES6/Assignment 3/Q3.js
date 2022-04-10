"use strict";
let employee = (function () {
    function employee(name, age) {
        this.name = name;
        this.age = age;
    }
    employee.prototype.print = function () {
        return this.name + " " + this.age;
    };
    return employee;
}());
let circle = (function () {
    function circle(radius) {
        this.radius = radius;
    }
    circle.prototype.print = function () {
        return this.radius * 3.14;
    };
    return circle;
}());
function printAll(employee1, circle1) {
    document.write(employee1.print() + "<br>");
    document.write(circle1.print());
}
var employee1 = new employee("Rahul", 32);
var circle1 = new circle(2);
printAll(employee1, circle1);
