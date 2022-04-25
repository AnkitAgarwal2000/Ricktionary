pipeline { 
 agent any 
 stages { 
  stage('Testing') { 
   steps{ 
       echo 'running Tests' 
       bat 'py lab.py' 
    } 
  }
  stage('Build') { 
   steps { 
    echo 'Building jar files...' 
   } 
  } 
 } 
}
