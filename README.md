# Fetch Rewards Coding Exercise - Android App

## Overview
This Android app is a solution for the Fetch Rewards coding exercise. It fetches data from a provided URL, filters, sorts, and displays the results in a user-friendly list.

## Features
- Retrieves data from [Fetch Rewards API](https://fetch-hiring.s3.amazonaws.com/hiring.json).
- Groups and sorts items by `listId` and `name`.
- Filters out items where the `name` is either blank or `null`.
- Presents the data in a scrollable list for easy readability.

## Tech Stack
- **Java**: Primary programming language.
- **Android AsyncTaskLoader**: For managing background tasks to fetch data from the API.
- **HTTPURLConnection**: Used for network requests and fetching JSON data.
- **JSON Parsing**: Handles parsing of JSON response into usable data.
- **ArrayAdapter/ListView**: For rendering the sorted and filtered data in a user-friendly format.# Android-Challenge-Fetch
