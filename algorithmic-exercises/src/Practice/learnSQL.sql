-- Basic SQL Queries:

-- SQL Bolt tutorial: https://sqlbolt.com/lesson/introduction

-- SELECT Queries
-- Select everything from a table:
SELECT *
FROM plant_db.plants; -- database name - it is opt., & table name

-- select specific column:
SELECT latin_name -- select the name COLUMN
FROM plant_db.plants; -- from plant db's plants table

-- Select more than one column:
SELECT latin_name, water_demand
FROM plant_db.plants;

-- Queries with constraints
-- =, !=, < <=, >, >=	Standard numerical operators	col_name != 4
-- BETWEEN … AND …	Number is within range of two values (inclusive)	col_name BETWEEN 1.5 AND 10.5
-- NOT BETWEEN … AND …	Number is not within range of two values (inclusive)	col_name NOT BETWEEN 1 AND 10
-- IN (…)	Number exists in a list	col_name IN (2, 4, 6)
-- NOT IN (…)	Number does not exist in a list	col_name NOT IN (1, 3, 5)

-- show every column from movies table where year is between 2000 & 2010
SELECT * FROM movies
WHERE  2000 < year < 2010;

-- show title and year columns from movies table where year is between 2000 & 2010
SELECT title, year FROM movies
WHERE year BETWEEN 2000 AND 2010;

-- = : case sensitive exact string comparison (notice the single equals)	col_name = "abc"
-- != or <>	: Case sensitive exact string inequality comparison	col_name != "abcd"
-- LIKE	: Case insensitive exact string comparison	col_name LIKE "ABC"
-- NOT LIKE : Case insensitive exact string inequality comparison	col_name NOT LIKE "ABCD"
-- % : Used anywhere in a string to match a sequence of zero or more characters (only with LIKE or NOT LIKE)	col_name LIKE "%AT%"
-- matches "AT", "ATTIC", "CAT" or even "BATS"
-- _ : Used anywhere in a string to match a single character (only with LIKE or NOT LIKE)	col_name LIKE "AN_"
-- (matches "AND", but not "AN")
-- IN (…) : String exists in a list	col_name IN ("A", "B", "C")
-- NOT IN (…) : String does not exist in a list	col_name NOT IN ("D", "E", "F")

-- Selecting every movies with title that contains Toy...
SELECT * FROM movies
WHERE title LIKE "Toy%";

SELECT * FROM movies
WHERE title = "WALL-_";


-- Filtering and sorting Query results

-- DISTINCT keyword removes the duplicate rows
-- GROUP BY
-- ORDER BY column ASC/DSC
--  	 each row is sorted alpha-numerically based on the specified column's value
-- LIMIT - reduce the number of rows to return
-- OFFSET - specify where to begin counting the number rows from

-- Select all the directors (without duplicates) and list them alphabetically
SELECT director FROM movies
GROUP BY director
ORDER BY director ASC;
-- List the first five movies sorted alphabetically
SELECT title, year FROM movies
ORDER BY year DESC
LIMIT 4;
-- List the first five Pixar movies sorted alphabetically
SELECT title FROM movies
ORDER BY title ASC
LIMIT 5;
-- List movies from index 5 to next 5 indeces
SELECT title FROM movies
ORDER BY title ASC
LIMIT 5 OFFSET 5;

-- List the two largest cities in Mexico
SELECT city FROM north_american_cities
WHERE country = "Mexico"
ORDER BY population DESC
LIMIT 2;


--  ------- JOINS -------

-- Multi-table queries with Joins
-- DB NORMALIZATION: DBs are often broken down into "pieces" and stored across multiple orthogonal tables
-- This minimizes duplicate data in any single table, and allows for data in the database
-- to grow independently of each other. --> need of joins
-- PRIMARY KEY:  identifies that entity uniquely across the database where tables share information
-- Auto-incrementing integer: common primary key type
-- primary key can be string, hashed value, long - if it is unique

-- JOIN - to combine row data across two separate tables using the primary key


-- INNER JOIN
-- 		- process that matches rows from the first table and the second table which have the same key
-- (as defined by the ON constraint) to create a result row with the combined columns from both tables
--

-- Find the domestic and international sales for each movie
SELECT title, domestic_sales, international_sales
FROM movies
         JOIN boxoffice
              ON movies.id = boxoffice.movie_id;

-- Show the sales numbers for each movie that did better internationally rather than domestically
-- WHERE --> alul!
SELECT title, domestic_sales, international_sales
FROM movies
         JOIN boxoffice
              ON movies.id = boxoffice.movie_id
WHERE international_sales > domestic_sales;
-- List all the movies by their ratings in descending order
SELECT title, domestic_sales, international_sales
FROM movies
         JOIN boxoffice
              ON movies.id = boxoffice.movie_id
ORDER BY Rating DESC;

-- OUTER JOINS
-- needed when there are two tables with asymmetric data
-- --> LEFT JOIN, RIGHT JOIN, FULL JOIN
-- LEFT JOIN: table A to tabe B: includes rows from A regardless of whether a matching row is found in B
-- RIGHT JOIN: same, but reversed, keeping rows in B regardless of whether a match is found in A
-- FULL JOIN: rows from both tables are kept, regardless of whether a matching row exists in the other table.

-- Find the list of all buildings that have employees
SELECT DISTINCT building FROM employees;
-- List all buildings and the distinct employee roles in each building (including empty buildings)
SELECT DISTINCT building_name, role
FROM buildings
         LEFT JOIN employees
                   ON building_name = building;

-- NULLs
-- WHERE column IS/IS NOT NULL

-- SELECT column, another_column, …
-- FROM mytable
-- WHERE column IS/IS NOT NULL
-- AND/OR another_condition
-- AND/OR …;

-- Find the name and role of all employees who have not been assigned to a building
SELECT name, role
FROM employees
WHERE building IS NULL;
-- Find the names of the buildings that hold no employees
SELECT Building_name
FROM Buildings
         LEFT JOIN employees
                   ON building_name = building
WHERE building IS NULL;

-- Queries with expressions

-- SELECT column AS better_column_name, …
-- FROM a_long_widgets_table_name AS mywidgets
-- INNER JOIN widget_sales
--   ON mywidgets.id = widget_sales.widget_id;

-- List all movies and their combined sales in millions of dollars
SELECT title, (domestic_sales + international_sales) / 1000000 AS gross_sales_millions
FROM movies
         JOIN boxoffice
              ON movies.id = boxoffice.movie_id;
-- List all movies and their ratings in percent
SELECT title, rating * 10 AS rating_percent
FROM movies
         JOIN boxoffice
              ON movies.id = boxoffice.movie_id;


-- Queries with aggregates

-- Select query with aggregate functions over all rows:
-- SELECT AGG_FUNC(column_or_expression) AS aggregate_description, …
-- FROM mytable
-- WHERE constraint_expression;

-- COUNT(*), COUNT(column)
-- 		A common function used to counts the number of rows in the group if no column name is specified.
-- 		Otherwise, count the number of rows in the group with non-NULL values in the specified column.
-- MIN(column)
-- 		Finds the smallest numerical value in the specified column for all rows in the group.
-- MAX(column)
-- 		Finds the largest numerical value in the specified column for all rows in the group.
-- AVG(column)
-- 		Finds the average numerical value in the specified column for all rows in the group.
-- SUM(column)
-- 		Finds the sum of all numerical values in the specified column for the rows in the group.

-- Select query with aggregate functions over groups:
-- SELECT AGG_FUNC(column_or_expression) AS aggregate_description, …
-- FROM mytable
-- WHERE constraint_expression
-- GROUP BY column;

-- Find the longest time that an employee has been at the studio
SELECT MAX(years_employed) as Max_years_employed
FROM employees;
-- For each role, find the average number of years employed by employees in that role
SELECT role, AVG(years_employed) as Average_years_employed
FROM employees
GROUP BY role;
-- Find the total number of employee years worked in each building
SELECT building, SUM(years_employed) as Total_years_employed
FROM employees
GROUP BY building;

-- HAVING group_condition -- it is a WHERE keywerd after a WHERE - GROUP BY keywords

-- Find the number of Artists in the studio (without a HAVING clause)
SELECT role, COUNT(*) as Number_of_artists
FROM employees
WHERE role = "Artist";
-- Find the number of Employees of each role in the studio
SELECT role, COUNT(*) as Number_of_employees
FROM employees
GROUP BY role;
-- Find the total number of years employed by all Engineers
SELECT role, SUM(years_employed) as Number_of_employed_year_engineers
FROM employees
WHERE role LIKE "engineer";


-- Order of execution of a Query
-- https://sqlbolt.com/lesson/select_queries_order_of_execution
-- 1) FROM and JOIN this includes the subqueries in the clause, use temporary created tables that contains all the needed columns -->
-- 2) WHERE - applied to the individual rows, unsatisfying rows are discarded -->
-- 3) GROUP BY --> there will be only as many rows as there are unique values in that column
-- 4) HAVING - this is usedd to the grouped rows
-- 5) SELECT
-- 6) DISTINCT - it will remove  the duplcates from the output
-- 7) ORDER BY - the output data will be sorted as the query asks it
-- 8) LIMIT/OFFSET - range specified by the LIMIT and OFFSET are discarded, leaving the final set of rows to be returned from the query

-- Find the number of movies each director has directed
SELECT director, COUNT(title)
FROM movies
GROUP BY director ;
-- Find the total domestic and international sales that can be attributed to each director
SELECT director, SUM(Domestic_sales) + SUM(International_sales) AS all_sales
FROM movies
         JOIN boxoffice
              ON boxoffice.movie_id = movies.Id
GROUP BY director ;


-- INSERTING ROWS

-- SCHEMA
-- --> In SQL, the database schema is what describes the structure of each table, and the datatypes that each column of the table can contain.
-- --> This fixed structure is what allows a database to be efficient, and consistent despite storing millions or even billions of rows.
-- INSERT statement --> declares which table to write into, the columns of data that we are filling, and one or more rows of data to insert

-- Insert statement with values for all columns
-- INSERT INTO mytable
-- VALUES (value_or_expr, another_value_or_expr, …),
--        (value_or_expr_2, another_value_or_expr_2, …),
--        …;
-- -->  if you have incomplete data and the table contains columns that support default values,
-- you can insert rows with only the columns of data you have by specifying them explicitly.

-- Insert statement with specific columns
-- INSERT INTO mytable
-- (column, another_column, …)
-- VALUES (value_or_expr, another_value_or_expr, …),
--       (value_or_expr_2, another_value_or_expr_2, …),
--       …;
-- --> the number of values need to match the number of columns specified

-- Add the studio's new production, Toy Story 4 to the list of movies (you can use any director)
INSERT INTO movies VALUES (4, "Toy Story 4", "El Directore", 2015, 90);
-- Toy Story 4 has been released to critical acclaim! It had a rating of 8.7, and made 340 million domestically and 270 million internationally.
-- Add the record to the BoxOffice table.
INSERT INTO boxoffice VALUES (4, 8.7, 340000000, 270000000);


-- UPDATING ROWS

-- Update statement with values
-- UPDATE mytable
-- SET column = value_or_expr,
--     other_column = another_value_or_expr,
--     …
-- WHERE condition;

-- The director for A Bug's Life is incorrect, it was actually directed by John Lasseter
UPDATE movies
SET director = "John Lasseter"
WHERE title LIKE "A Bug's life";

-- DELETING ROWS
-- Delete statement with condition
-- DELETE FROM mytable
-- WHERE condition;

-- This database is getting too big, lets remove all movies that were released before 2005.
DELETE FROM movies
WHERE year < 2005;
-- Andrew Stanton has also left the studio, so please remove all movies directed by him.
DELETE FROM movies
WHERE director LIKE "Andrew Stanton";


-- CREATING TABLES

-- Create table statement w/ optional table constraint and default value
-- CREATE TABLE IF NOT EXISTS mytable (
--     column DataType TableConstraint DEFAULT default_value,
--     another_column DataType TableConstraint DEFAULT default_value,
--     …
-- );

-- Data types:
-- INTEGER, BOOLEAN - integer stores whole number values, boolean value is represented by 0 or 1
-- FLOAT, DOUBLE, REAL - store more precise numerical data like measurments of fractional values
-- CHARACTER(num_chars), VARCHAR(num_chars), TEXT - text based data types,
-- 			both character and varchar are specified with the num of maximum chars --> more efficient to store and query big tables
-- DATE, DATETIME - store date and time stamps to keep track of time series and event data
-- BLOB - binary data,
-- Constraint
-- PRIMARY KEY - values in this columns are unique, each value can be used to identify a single row in this table
-- AUTOINCREMENT - for integer values, value is automatically filled in and incremented with each row insertion
-- 				not supported by all the dbs
-- UNIQUE - values in the given column have to be unique,
-- 			Differs from the `PRIMARY KEY` in that it doesn't have to be a key for a row in the table.
-- NOT NULL - insert value can not be NULL
-- CHECK (expression) - run a more complex expression to test whether the values inserted are valid,
-- 						check values are positive or greater than a spec size, start with a certain prefix etc...
-- FOREIGN KEY - consistency check which ensures that each value in this col corresponds to another value in a col in another table
--