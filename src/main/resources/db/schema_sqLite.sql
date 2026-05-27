-- Tabella autori --

CREATE TABLE authors (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    birth_date DATE,
    nationality TEXT);

-- Tabella libri --

CREATE TABLE books (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    isbn TEXT UNIQUE,
    publication_year INTEGER,
    pages INTEGER,
    language TEXT,
    category_id INTEGER,

    FOREIGN KEY (category_id) REFERENCES categories(id));

-- Tabella categorie --

CREATE TABLE categories (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL UNIQUE);

-- Join Table libri/autori --

CREATE TABLE books_authors (
    book_id INTEGER NOT NULL,
    author_id INTEGER NOT NULL,

    PRIMARY KEY (book_id, author_id),
	FOREIGN KEY (book_id) REFERENCES books(id)
    ON DELETE CASCADE,

    FOREIGN KEY (author_id) REFERENCES authors(id)
    ON DELETE CASCADE);