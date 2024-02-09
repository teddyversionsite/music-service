# DB Tests

These tests confirm that the queries we've writting in various repositories actually work (e.g. selectively filter a field on a value while ignoring other rows, or something like that).

To run these, we need to have the containerized database already running, with the `src` flyway migrations already run. These tests are all responsible for their own individual data setup and teardown.

For running in CI, we'll get to that "eventually".
