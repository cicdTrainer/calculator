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
[https://jfrog.com/artifactoray/free-trial/?utm_source=google&utm_medium=cpc&utm_campaign={campaign}&gclid=EAIaIQobChMI9t3n7Kv56gIVQSUrCh3qcQhdEAAYASABEgJC5PD_BwE]

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
            > systemctl start artifactory.service

            Check Artifactory status with:
            > systemctl status artifactory.service
8- Run Jfrog service:
      systemctl start artifactory.service
9- Check Service status:
      sudo systemctl status artifactory.service
      output>   artifactory.service - Artifactory service
               Loaded: loaded (/lib/systemd/system/artifactory.service; enabled; vendor pres
               Active: active (running) since Sat 2020-08-01 06:21:27 UTC; 31s ago
               Process: 28839 ExecStart=/home/ubuntu/Downloads/artifactory-pro-7.6.3/app/bin/
               Main PID: 30809 (java)
                Tasks: 0
               Memory: 120.0K
                  CPU: 2.467s
               CGroup: /system.slice/artifactory.service
                       ‣ 30809 /home/ubuntu/Downloads/artifactory-pro-7.6.3/app/third-party/
10- Open JFrog UI
      http://localhost:8081 [copy in broser and hit]
11- UI login
      username: admin
      password: password
12- Rest the admin password as 12345678 [use simple one for testing]
13 - License Key
cHJvZHVjdHM6CiAgYXJ0aWZhY3Rvcnk6CiAgICBwcm9kdWN0OiBaWGh3YVhKbGN6b2dNakF5TUMw
d09DMHpNVlF3TmpvMU5Ub3hPUzR3TXpSYUNtbGtPaUF4Tm1WbE1qbGxOQzAzWmpka0xUUXlNMk10
T0dZeE1DMWpOelk1WWpaaU56aG1NREVLYjNkdVpYSTZJSE5wYlhCc2FXeGxZWEp1Q25CeWIzQmxj
blJwWlhNNklIdDlDbk5wWjI1aGRIVnlaVG9nYm5Wc2JBcDBjbWxoYkRvZ2RISjFaUXAwZVhCbE9p
QlVVa2xCVEFwMllXeHBaRVp5YjIwNklESXdNakF0TURndE1ERlVNRFk2TlRVNk1Ua3VNRE0wV2dv
PQogICAgc2lnbmF0dXJlOiBHSm5FYXEwNUFhMFNYVDBFbFBQU2hKTjlBMDhWQzNaQlNyekd2WGhC
SkVXeW52aVo1UnpLRlpyNGJmY2ZxZ2ZWc2FzNXZhb3hKeTkrK2hoTFc5dG9MNW1Ea2gvMHc0Z3Nh
ZDJwbXhsMnRHMGhiV1lNdFA4aCs2VE9XRHQrSGZKaDRLVGtNMG1STmI5N2o4S3hCS0F2RWhvZWdV
eklzakdpMEk2dy9rS0FvMXRlOFI2NnFZbFo2R3NXanV1ZEZDWlA0VmdoMjgzOXhoRXZ3ZkgrTmVw
V1pOYlh6Wm15VHZsVmZmQzVYTlROM3Nzb2c5RElTd2FNNnloajhVRjN3eHFxKzZ6LzdYWFBPNXkz
T2FNYURuaUJlUW1wbEVDb3FrMXBWOTVOb2wyVFo2dkFIR05YNFhlaXFmeEFReXNQQXF1VTJzdkw4
aG0zM3ZNaGs2azdTYzVRMmc9PQp2ZXJzaW9uOiAxCg==

14- Skip `base url setting` 

15- Skip `proxy configuration`

16- Create Repository, choose -> `maven` [Click on Finish]

=================================
JFrog and Maven Integration Steps
=================================
1- Top right conrner -> `Set me up` button. Please click on that
2- Choose Tool as -> `maven`
3- Choose credential -> `admin`
4- Click on `Generate Maven settings`
5- Click on `Generate Settings`
6- Click on `generate snippet` -> It will download the settings.xml file in /home/ubuntu/Downloads/ directory
7- Open terminal
      7.1 cd Downloads
      7.2 open settings.xml file and update the JFrog's admin password in it.
            <servers>
                <server>
                  <username>admin</username>
                  <password>12345678</password>
                  <id>central</id>
                </server>
                <server>
                  <username>admin</username>
                  <password>12345678</password>
                  <id>snapshots</id>
                </server>
            </servers>

      7.3 sudo cp settings.xml /var/lib/jenkins/.m2/
      7.4 sudo chgrp jenkins /var/lib/jenkins/.m2/settings.xml
      7.5 sudo chown jenkins /var/lib/jenkins/.m2/settings.xml
