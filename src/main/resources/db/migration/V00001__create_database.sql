CREATE TABLE IF NOT EXISTS songs (
    id SERIAL PRIMARY KEY,
    display_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS shows (
    id SERIAL PRIMARY KEY,
    show_date DATE NOT NULL,
    venue VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50),
    country VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS performances (
    id SERIAL PRIMARY KEY,
    song_id INT,
    show_id INT,
    FOREIGN KEY(song_id) REFERENCES songs(id),
    FOREIGN KEY(show_id) REFERENCES shows(id)
);

CREATE TABLE IF NOT EXISTS user_votes (
    user_id INT, -- figure out how to reference eventual user table/db
    performance_id INT,
    FOREIGN KEY(performance_id) REFERENCES performances(id)
);
