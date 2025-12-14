##Project Name
X00197973_CA3

##Overview
The focus of this project is the same as last time. The ability the convert Yen to Euro and Euro to Yen. However this time there were not only significant in the field of testing with the use of security, dependency and performance testing, but deployment is now available. User input still isn't possible unfortunately.

##Technologies
Technologies used include Java, Gradle, Springboot, SonarQube, Jacoco, jmeter, Cucumber, Gherkin and Selenium.

##Local Development Setup
I utilised what is essentially the same local development setup as the previous project, which is Visual Studio Code. In VS Code, I downloaded Java, Gradle, Git and Springboot. Springboot was how I ran a significant amount of the project and was instrumental in the implementation of performance testing.

##CI Pipeline Implementation
The CI Pipeline for this project runs on Microsoft Azure and is implemented via GitHub where my project repository is. The first step I took was creating a GitHub repository to store my project during which I implemented a gitignore file. Pulls are required before merging as per protection rules but have an unlimited amount of approvals. After creating the GitHub project and finalising protection rules, I created a project in Azure. Once the Azure project was created, I went into the pipelines section to create a pipeline. After that I connected it with the GitHub project. Once the configuration was completed, I ensured the YAML was sorted correctly and I ran the project. These steps were all previously performed in CA2, but here we are not just performing Continuous Integration but Countinuous Devliery/Deployment and much more advanced testing mechanisms. I added a new stage which made deployment possible. Also available are security scanning and dependency security. Security scanning actually helped me find a big leak in the code which pushed me to keep the nvd api key as a secret variable. Despite all this complexity, I managed to produce a working pipeline.

##Testing Strategy
Testing this time was, as mentioned previously, significantly advanced with jmeter, Cucumber, Gherkin and Selenium being added. jmeter, sadly, could not be performed with my Springboot app for reasons I could not figure out. Certain elements of the Selenium test had to be disabled in order for the to run its tests properly but I did get some working utilising Cucumber and Gherkin. SonarQube was still implemented for static code analysis.

##Troubleshooting Guide
Issue: Changes not being pushed to GitHub 
Solution: Ensure you have saved VS Code file 
Issue: Merge between main and development resulted in unwanted code changes 
Solution: Change them manually 
Issue: Pipeline cannot run due to build configuration cache 
Solution: In gradle.properties, change org.gradle.configuration-cache to false
Issue: showProjectInfo and other functions do not work
Solution: Check the Java version
