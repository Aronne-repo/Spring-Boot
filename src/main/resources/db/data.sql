-- Tabella autori --

INSERT OR IGNORE INTO authors
(first_name, last_name, birth_date, nationality)
VALUES
('J.R.R.', 'Tolkien', '1892-01-03', 'British'),
('George', 'Orwell', '1903-06-25', 'British'),
('Stephen', 'King', '1947-09-21', 'American'),
('Agatha', 'Christie', '1890-09-15', 'British'),
('Jane', 'Austen', '1775-12-16', 'British'),
('Dan', 'Brown', '1964-06-22', 'American'),
('Robert', 'Martin', '1952-12-05', 'American'),
('Fyodor', 'Dostoevsky', '1821-11-11', 'Russian'),
('Isaac', 'Asimov', '1920-01-02', 'American');

-- Tabella libri --

INSERT OR IGNORE INTO books
(title, isbn, publication_year, pages, language, category_id)
VALUES
('The Hobbit', '9780261103344', 1937, 310, 'English', 1),
('1984', '9780451524935', 1949, 328, 'English', 2),
('The Shining', '9780307743657', 1977, 447, 'English', 3),
('Murder on the Orient Express', '9780062693662', 1934, 256, 'English', 4),
('Pride and Prejudice', '9780141439518', 1813, 279, 'English', 5),
('The Da Vinci Code', '9780307474278', 2003, 489, 'English', 6),
('Clean Code', '9780132350884', 2008, 464, 'English', 9),
('Crime and Punishment', '9780143058144', 1866, 671, 'Russian', 10),
('Foundation', '9780553293357', 1951, 255, 'English', 2);

-- Tabella categorie --

INSERT OR IGNORE INTO categories
(name)
VALUES
('Fantasy'),
('Science Fiction'),
('Horror'),
('Mystery'),
('Romance'),
('Thriller'),
('Historical Fiction'),
('Biography'),
('Programming'),
('Philosophy');

-- Tabella books_authors --

INSERT OR IGNORE INTO books_authors
(book_id, author_id)
VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9);