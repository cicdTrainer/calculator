node {
   def mvnHome
   stage('Prepare') {
      git 'https://github.com/cicdTrainer/calculator.git'
      mvnHome = tool 'maven'
   }
   stage('Compile') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean compile"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean compile/)
      }
   }
   stage('Code Review') {
   if (isUnix()) {
   sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
   } else {
   bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
   }
 }
   stage('Unit Testing') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   stage('Integration Test') {
     if (isUnix()) {
        sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean verify"
     } else {
        bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean verify/)
     }
   }
   stage('Sonar') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' sonar:sonar"
      } else {
         bat(/"${mvnHome}\bin\mvn" sonar:sonar/)
      }
   }
   stage('Push the Artifacts to Nexus/Jfrog') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean deploy"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean deploy/)
      }
   }
}
