Setup to setup Eclipse in Ubuntu Lab:-
------------------------------------------
1- Open browser: search for eclipse dwonload
2- Open terminal
      uname -a
      output> x86_64 ~ 64 bit OS
3- Download url https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2020-06/R/eclipse-inst-linux64.tar.gz  [copy to broser and hit download button]
4- In terminal [ruuning the eclipse]
    4.1  cd Downloads
    4.2  ls -lrt
         > eclipse-inst-linux64.tar.gz [last file in rsult of above command]
    4.3 tar -xvf eclipse-inst-linux64.tar.gz [extract the tar file]
    4.4 cd eclipse-installer
    4.5 ./eclipse-inst  [Choose Eclispe IDE Java Developers. it will open a GUI based installation window, just fallow the default conf. It will also launch the eclipse. Close Welcome window.]
    4.6 Check already install instance location: /home/ubuntu/eclipse/java-2020-06/ [File Manager ] [if this location does not exist, then we have to install]
           > double click on `eclipse` file 
           > ./eclipse [to run via command line]
    4.7 Choose workspace directory [go for default one]
5- Creating a Maven project in eclipse
      5.1 Top left corner
            > File
                  > New
                        > other
                              > Maven
                                    > Maven Project
                                          > [click on Next]
                                                > Choose default working location
                                                      > New Maven Project
                                                            > Select ArcheType
                                                                  > Catalog: internal
                                                                  > GroupId: org.apache.mavne.archtypes
                                                                  > artifactId: maven-archtype-quickstart
                                                                  > version: 1.1
                                                                        > [Next]
                                                                              > Project details
                                                                                    > Group Id: com.simplilearn.cicd
                                                                                    > Artifact Id: jfrog-demo
                                                                                          > [Finish]                                                                                     
====================================================================================================================================
===================================
 Setup to install JFrog Artifactory
===================================
1- Search for: JFrog Artifactory Install 
2- Download link: https://api.bintray.com/content/jfrog/artifactory-pro/org/artifactory/pro/jfrog-artifactory-pro/$latest/jfrog-artifactory-pro-$latest-linux.tar.gz?bt_package=jfrog-artifactory-pro
3- cd Downloads
[All cmd run in terminal]
4- tar -xvf jfrog-artifactory-pro-7.6.3-linux.tar.gz 
5- cd artifactory-pro-7.6.3
6- cd app/bin
7- sudo ./installService.sh 
      output> 
            ************ SUCCESS ****************
            Installation of Artifactory completed

            Start Artifactory with:
            >sudo systemctl start artifactory.service

            Check Artifactory status with:
            >sudo systemctl status artifactory.service
			

