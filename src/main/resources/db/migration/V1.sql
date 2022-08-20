CREATE SEQUENCE IF NOT EXISTS hibernate_sequence;

CREATE TABLE IF NOT EXISTS product
(
    id    uuid    not null
        constraint product_pkey
            primary key,
    name  varchar not null,
    price decimal not null
);

CREATE TABLE IF NOT EXISTS checklist
(
    id         uuid                    not null
        constraint checklist_pkey
            primary key,
    amount     decimal                 not null,
    created_at timestamp default now() not null
);

CREATE TABLE IF NOT EXISTS checklist_line
(
    id           uuid    not null
        constraint checklist_line_pkey
            primary key,
    count        bigint  not null,
    amount       decimal not null,
    product_id   uuid
        constraint checklist_line_product_fkey
            references product,
    checklist_id uuid
        constraint checklist_line_checklist_fkey
            references checklist
);
