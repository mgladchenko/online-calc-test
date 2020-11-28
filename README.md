**Example of automation of Canvas inside iFrame using Java +Serenity/jBehave**   

**Setup on OS X:**
1. Install Homebrew package manager if not installed (https://brew.sh/)
2. Install JDK 8 or above via Homebrew   
`brew cask install java`  
3. Verify that JDK was installed  
`java -version`
4. Install Maven via Homebrew  
`brew install maven`
5. Verify that Maven was installed  
`mvn -version`
6. Make sure you have Chrome browser installed   
**Note:** Chromedriver will be installed automatically via **webdrivermanager**


**To Run tests from command line:**  
`mvn clean verify`  
Note: This will run RunJBehaveScenarios which specifies BDD Story file for execution.

**View Serenity HTML report:**    
Will be available automatically after run from command line at /target/site/serenity/index.html 
Or could be generated manually via command:  
`mvn serenity:aggregate`  