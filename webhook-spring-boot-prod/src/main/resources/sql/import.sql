CREATE SCHEMA IF NOT EXISTS WEBHOOK;

CREATE TABLE IF NOT EXISTS webhook.TAB_WEBHOOK
(
    tw_id  INT PRIMARY KEY,
    tw_url VARCHAR(255)
);


insert into WEBHOOK.TAB_WEBHOOK(TW_ID, TW_URL)
values (1, 'teste');

insert into WEBHOOK.TAB_WEBHOOK(TW_ID, TW_URL)
values (2, 'teste 2');