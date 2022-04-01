insert into users(username ,password ,enabled)values('user','$2a$10$HXXKuC2.JudhtHFDfwNRBeNl9tPBmrpV4kMF.e78m2/Ce9r/2E6Ne',true)
insert into users(username ,password ,enabled)values('admin','$2a$10$MqPcxCEYdM1YtRrBqlqtMO94F5e90jCTw4rjSedJE5F3SGn.F.xYC',true)

insert into authorities(username ,authority) values ('user','ROLE_USER')
insert into authorities(username ,authority) values ('admin','ROLE_ADMIN')