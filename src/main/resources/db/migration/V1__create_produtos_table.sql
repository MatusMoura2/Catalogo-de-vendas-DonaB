CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE produtos (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    title VARCHAR(255) NOT NULL,
    image VARCHAR(255),
    price REAL NOT NULL
);
