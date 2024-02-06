# TeddyVersion Music Service

This will house all things related to getting information about the music. Shows, Songs, Performances (Song + Show).

### DTOs and Typescript

Added the excellent [typescript-generator](https://github.com/vojtechhabarta/typescript-generator) gradle plugin to take Entity definitions and generate corresponding typescript definitions for us. Just run `gradle generateTypescript` and then grab the file at `build/typescript-generator/musicService.d.ts` and drop it in the front end repo.

### Containerization

We use [jib]() to package everything up for us. `gradle jib` does all the heavy lifting and outputs a tagged image.
