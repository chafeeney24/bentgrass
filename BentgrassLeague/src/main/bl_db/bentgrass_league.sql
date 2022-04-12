BEGIN TRANSACTION;

DROP TABLE IF EXISTS

CREATE TABLE member (
    member_id serial,
    member_name VARCHAR,
    CONSTRAINT pk_member PRIMARY KEY (member_id)
);

CREATE TABLE tournament (
    tournament_id serial,
    season int,
    event_name varchar,
    date_range daterange,


)

CREATE TABLE table_name (

)

CREATE TABLE table_name (

)