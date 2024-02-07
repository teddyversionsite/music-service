CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY
);

ALTER TABLE user_votes
ADD CONSTRAINT user_votes_user_id_fkey
FOREIGN KEY (user_id) REFERENCES users(id);
