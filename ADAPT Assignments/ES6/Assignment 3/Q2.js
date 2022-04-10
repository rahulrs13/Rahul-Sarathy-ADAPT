"use strict";
class Account {
    constructor(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
class SavingAccount extends Account {
    constructor(id, name, balance, interest) {
        super(id, name, balance);
        this.interest = interest;
    }
    getBalance() {
        this.totalBalance = 0;
        this.totalBalance = this.balance + (this.balance * this.interest);
        return this.totalBalance;
    }
}
class CurrentAccount extends Account {
    constructor(id, name, balance, cash_credit) {
        super(id, name, balance);
        this.cash_credit = cash_credit;
    }
    getBalance() {
        this.totalBalance = 0;
        this.totalBalance = this.balance - this.cash_credit;
        return this.totalBalance;
    }
}
var SavingAccountObj = new SavingAccount(234, "Ted", 45521, 24);
document.write(SavingAccountObj.getBalance() + "<br>");
var CurrentAccountObj = new CurrentAccount(887, "Mike", 72213, 42);
document.write(CurrentAccountObj.getBalance());
