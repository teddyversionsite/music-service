# TeddyVersion Music Service

This will house all things related to getting information about the music. Shows, Songs, Performances (Song + Show).

### DTOs and Typescript

Added the excellent [typescript-generator](https://github.com/vojtechhabarta/typescript-generator) gradle plugin to take Entity definitions and generate corresponding typescript definitions for us. Just run `gradle generateTypescript` and then grab the file at `build/typescript-generator/musicService.d.ts` and drop it in the front end repo.

### Containerization

We use [jib]() to package everything up for us. `gradle jib` does all the heavy lifting and outputs a tagged image.

### Demo data

For now, we'll just use a test class to stuff data in for testing purposes. Eventually, we'll have a service that runs on cron to pull from the [elgoose](https://elgoose.net/api/docs/) api to keep the music stuff up to date.

Run the test in `src/test/java/com/teddyversion/musicService/demo/TestData.java` to recreate the necessary data.

### Local development

Added some docker to ease local development in `/docker`. There's a `start_postgres.sh` script to start the postgres database and create the required `music` db before starting the spring boot service (which runs flyway expecting it to be there). And a `start_nginx.sh` script to boot up a reverse proxy to get around CORS. `localhost:9000` will be used with the `/musicservice/` path proxying to this service.
