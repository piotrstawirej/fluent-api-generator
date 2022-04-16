# About

Auxiliary tool for generating [fluent-api](https://github.com/stawirej/fluent-api) library.

Generates functional interfaces based on provided words which are used by [fluent-api](https://github.com/stawirej/fluent-api) library.

# Prerequisites

- Java 8 or later

# Usage

## Build

```bash
mvn clean install
```

## Run generator

```bash
./generate.sh
```

## Clean output

```bash
./clean.sh
```

## Customization

- Prepare or replace existing input files with words.
- Change [generate.sh](https://github.com/stawirej/fluent-api-generator/blob/master/generate.sh) script to customize output by providing
  - Input files path (files with your custom words)
  - Output package name
  - Output folder path
- Use generated output in [fluent-api](https://github.com/stawirej/fluent-api) library. 
