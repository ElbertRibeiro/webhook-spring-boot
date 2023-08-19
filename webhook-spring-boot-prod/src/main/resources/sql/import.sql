CREATE SCHEMA IF NOT EXISTS WEBHOOK;

CREATE TABLE IF NOT EXISTS webhook.TAB_WEBHOOK
(
    tw_id  INT PRIMARY KEY,
    tw_url VARCHAR(255)
);


insert into WEBHOOK.TAB_WEBHOOK(TW_ID, TW_URL)
values (10, 'http://localhost:8081/notificacao');

insert into WEBHOOK.TAB_WEBHOOK(TW_ID, TW_URL)
values (20, 'http://localhost:8081/teste');