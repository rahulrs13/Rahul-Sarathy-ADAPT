var croom1 = new Map();
var croom2 = new Map();

croom1.set("user1", ["User 1: Hey Wats ur name"]);
croom1.set("user2", ["User 2: I am Mike"]);

croom2.set("user3", ["User 3: Hey how are you?"]);
croom2.set("user4", ["User 4: I am fine"]);

var user= (room,name)=>{
    document.write("Users in " +name+" are : "+"<br>");
    for(let key of room.keys())
    {
        document.write(key+"<br>");
}
}
var messages= (room,name)=>{
    document.write("<br>"+name+"<br>");
    for(let value of room.values())
    {
        document.write(value+"<br>");
    }
}

user(croom1,"Chatroom1");
user(croom2,"Chatroom2");
messages(croom1,"Chatroom1");
messages(croom2,"Chatroom2");