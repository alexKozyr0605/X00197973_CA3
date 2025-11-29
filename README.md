# X00197973_CA2

## Overview
For this project, I decided to make an app that could convert Euro to Yen and vice versa. User input is not available.

## Technologies Used
Technologies used include Java, Azure, GitHub, Jacoco, Visual Studio and Gradle.

## Local Development Setup
The code for the project was done via Visual Studio Code. In VS Code, I downloaded Java, Gradle and Git which made most of the project possible.

## Application Features
Features of the application include the ability to convert Euro to Yen and the ability to convert yen to euro. For this I defined two functions; yenConverter and euroConverter which convert Euro to Yen and Yen to Euro respectively, hence the names. The exchange rate for each currency and the amount they wish to convert is all stored within the functions. These functions are then called in a static Main function at the end of the page.

## CI Pipeline Implementation
The CI Pipeline for this project runs on Microsoft Azure and is implemented via GitHub where my project repository is. The first step I took was creating a GitHub repository to store my project during which I implemented a gitignore file. Pulls are required before merging as per protection rules but have an unlimited amount of approvals. After creating the GitHub project and finalising protection rules, I created a project in Azure. Once the Azure project was created, I went into the pipelines section to create a pipeline. After that I connected it with the GitHub project. Once the configuration was completed, I ensured the YAML was sorted correctly and I ran the project. Many runs were performed before the project was fully operational but eventually, after many code changes, I got the pipeline working.

## Branch Policies and Protection 
I have a separate branch for main and development. I experiment with code using the development branch and if they pass the unit test I push them to the main. Before pushing them, however I have to perform a pull request which results in me having to sort out which code I do and don't want on main.

## Testing Strategy
My testing strategy was rather simplistic. I used a assertNotNull's for each method. Then for the test report I used Jacoco test report. Unfortunately, the highest the minimum test coverage could go was 60%. Despite this the pipeline managed to cover at least 75% of the code. As for static code analysis, I utilised SonarQube. SonarQube is the most reliable form of static code analysis for Java.

## Troubleshooting Guide
Issue: Changes not being pushed to GitHub
Solution: Ensure you have saved VS Code file
Issue: Merge between main and development resulted in unwanted code changes
Solution: Change them manually
Issue: Pipeline cannot run due to build configuration cache
Solution: In gradle.properties, change org.gradle.configuration-cache to false
